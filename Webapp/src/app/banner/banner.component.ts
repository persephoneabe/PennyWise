import { Component, OnInit } from '@angular/core';
import { NavbarService } from '../navbar.service';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {

  constructor(private navbarservice: NavbarService) { }

  ngOnInit() {
  }

  logout(): void{
    this.navbarservice.logout();
  }

}
