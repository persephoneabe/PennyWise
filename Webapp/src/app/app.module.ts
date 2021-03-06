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
import { HomepageComponent } from './homepage/homepage.component';
import { FrontpageComponent } from './frontpage/frontpage.component';
import { RegistrationComponent } from './registration/registration.component';
import { DrinksearchComponent } from './drinksearch/drinksearch.component';
import { UserdrinksComponent } from './userdrinks/userdrinks.component';
import { IndividualdrinkComponent } from './individualdrink/individualdrink.component';
import { AlcoholComponent } from './alcohol/alcohol.component';
import { GlassComponent } from './glass/glass.component';
import { CategoryComponent } from './category/category.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DashboardComponent,
    FooterComponent,
    HomepageComponent,
    FrontpageComponent,
    RegistrationComponent,
    DrinksearchComponent,
    UserdrinksComponent,
    IndividualdrinkComponent,
    AlcoholComponent,
    GlassComponent,
    CategoryComponent
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
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
