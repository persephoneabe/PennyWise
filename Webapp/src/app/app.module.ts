import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {AlertModule} from './£alerts';
import { NavbarComponent } from './navbar/navbar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FooterComponent } from './footer/footer.component';
<<<<<<< HEAD
import { DictionaryComponent } from './dictionary/dictionary.component';
=======
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12
import { HomepageComponent } from './homepage/homepage.component';
import { FrontpageComponent } from './frontpage/frontpage.component';
import { RegistrationComponent } from './registration/registration.component';
import { DrinksearchComponent } from './drinksearch/drinksearch.component';
import { UserdrinksComponent } from './userdrinks/userdrinks.component';
import { IndividualdrinkComponent } from './individualdrink/individualdrink.component';
<<<<<<< HEAD
import { UserService } from './shared_Service/user.service';
=======

>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DashboardComponent,
    FooterComponent,
<<<<<<< HEAD
    DictionaryComponent,
=======
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12
    HomepageComponent,
    FrontpageComponent,
    RegistrationComponent,
    DrinksearchComponent,
    UserdrinksComponent,
    IndividualdrinkComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FontAwesomeModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule,
    AlertModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
