import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {AuthenticationService} from '../£services/authentication.service';
import {AlertService} from '../£alerts';
import {first} from 'rxjs/operators';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})

@Component({templateUrl: 'registration.component.html'})
export class RegistrationComponent implements OnInit {

  registrationForm: FormGroup;
  submitted = false;

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private authenticationService: AuthenticationService,
    private alertService: AlertService
  ) {
    // We do not want this page to be accessible to any user that is currently logged in
    if (this.authenticationService.currentUserValue) {
      this.router.navigate(['/']);
    }
  }

  ngOnInit(): void {
    this.registrationForm = this.formBuilder.group({
      fullname: ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      verify: ['', Validators.required]
    });
  }

  // Getter for form fields
  get f() {
    return this.registrationForm.controls;
  }

  onSubmit() {
    this.submitted = true;
    if (this.registrationForm.invalid) {
      this.alertService.clear();
      this.alertService.error('You must fill out all fields');
      return;
    }
    if (this.f.password !== this.f.verify) {
      this.authenticationService.register(
        this.f.fullName.value, this.f.username.value, this.f.password.value)
        .pipe(first()).subscribe(data => {
          this.router.navigateByUrl('/frontpage');
          this.alertService.sucess('You have successfully created an account, please login to continue');
        },
        error => {
          this.alertService.error('Failed to create an account');
        });
    }
  }
}
