import {Component, OnInit} from '@angular/core';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';

import {Router, ActivatedRoute} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {first} from 'rxjs/operators';

import {AuthenticationService} from '../£services/authentication.service';
import {AlertService} from '../£alerts';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  closeResult: string;
  public isMenuCollapsed = true;
  loginForm: FormGroup;
  isLoggedIn = false;
  submitted = false;
<<<<<<< HEAD
  returnUrl: string;
=======
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12

  constructor(
    private authenticationService: AuthenticationService,
    private alertService: AlertService,
    private modalService: NgbModal,
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router) {
    if (this.authenticationService.currentUserValue) {
      this.isLoggedIn = true;
    }
  }
<<<<<<< HEAD

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });

    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
  }

  get f() {
    return this.loginForm.controls;
  }

  onSubmit() {

    this.submitted = true;
    if (this.loginForm.invalid) {
      this.alertService.error('You must enter a username and password', 'a-1');
      return;
    }
    this.modalService.dismissAll();
    this.authenticationService.login(
      this.f.username.value, this.f.password.value)
      .pipe(first()).subscribe(data => {
        this.router.navigateByUrl('/frontpage');
        this.alertService.sucess('You have successfully logged in');
      },
      error => {
        this.alertService.error('Failed to log in');
      });
  }

  private logout() {
    this.authenticationService.logout();
    this.alertService.sucess('You have successfully logged out');
  }

  open(content) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
=======

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12
  }

  // Getter for form fields
  get f() {
    return this.loginForm.controls;
  }

  onSubmit() {
    this.submitted = true;
    if (this.loginForm.invalid) {
      this.alertService.error('You must enter a username and password', 'a-1');
      return;
    }
    this.modalService.dismissAll();
    this.authenticationService.login(
      this.f.username.value, this.f.password.value)
      .pipe(first()).subscribe(data => {
        this.router.navigateByUrl('/frontpage');
        this.alertService.sucess('You have successfully logged in');
      },
      error => {
        this.alertService.error('Failed to log in');
      });
  }

  private logout() {
    this.authenticationService.logout();
    this.alertService.sucess('You have successfully logged out');
  }

  open(content) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }
}
