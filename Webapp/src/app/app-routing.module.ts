import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomepageComponent} from './homepage/homepage.component';
import {FrontpageComponent} from './frontpage/frontpage.component';
import {RegistrationComponent} from './registration/registration.component';
import {DrinksearchComponent} from './drinksearch/drinksearch.component';
import {UserdrinksComponent} from './userdrinks/userdrinks.component';
import {AlcoholComponent} from './alcohol/alcohol.component';
import {GlassComponent} from './glass/glass.component';
import {CategoryComponent} from './category/category.component';


const routes: Routes = [
  {path: '', redirectTo: '/homepage', pathMatch: 'full'},
  {path: 'homepage', component: HomepageComponent},
  {path: 'frontpage', component: FrontpageComponent},
  {path: 'registration', component: RegistrationComponent},
  {path: 'search', component: DrinksearchComponent},
  {path: 'search/by_alcohol', component: AlcoholComponent},
  {path: 'search/by_glass', component: GlassComponent},
  {path: 'search/by_category', component: CategoryComponent},
  {path: 'favourites', component: UserdrinksComponent},
  {path: '**', redirectTo: '/frontpage', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
