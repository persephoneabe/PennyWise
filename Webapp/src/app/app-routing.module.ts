import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomepageComponent} from './homepage/homepage.component';
import {FrontpageComponent} from './frontpage/frontpage.component';
<<<<<<< HEAD
=======
import {RegistrationComponent} from './registration/registration.component';
import {DrinksearchComponent} from './drinksearch/drinksearch.component';
import {UserdrinksComponent} from './userdrinks/userdrinks.component';
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12


const routes: Routes = [
  {path: '', redirectTo: '/homepage', pathMatch: 'full'},
  {path: 'homepage', component: HomepageComponent},
  {path: 'frontpage', component: FrontpageComponent},
<<<<<<< HEAD
=======
  {path: 'registration', component: RegistrationComponent},
  {path: 'search', component: DrinksearchComponent},
  {path: 'favourites', component: UserdrinksComponent},
>>>>>>> 62ca941f7e0f0d95b289d655ece277d461994a12
  {path: '**', redirectTo: '/frontpage', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
