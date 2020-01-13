import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomepageComponent} from './homepage/homepage.component';
import {FrontpageComponent} from './frontpage/frontpage.component';
import {RegistrationComponent} from './registration/registration.component';
import {DrinksearchComponent} from './drinksearch/drinksearch.component';
import {UserdrinksComponent} from './userdrinks/userdrinks.component';


const routes: Routes = [
  {path: '', redirectTo: '/homepage', pathMatch: 'full'},
  {path: 'homepage', component: HomepageComponent},
  {path: 'frontpage', component: FrontpageComponent},
  {path: 'registration', component: RegistrationComponent},
  {path: 'search', component: DrinksearchComponent},
  {path: 'favourites', component: UserdrinksComponent},
  {path: '**', redirectTo: '/frontpage', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
