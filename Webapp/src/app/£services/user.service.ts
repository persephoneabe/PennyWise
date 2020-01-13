import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {Drinkprototype} from '../£models/drinkprototype';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {
  }
  // Gets all of a user's favorite drinks
  getFavouriteDrinks(): Observable<Drinkprototype[]>{
    return null;
  }
  // Saves a drink to a user's favorites
  saveFavouriteDrink() {
  }
  // Removes a drink from a user's favorites
  deleteFavouriteDrink() {
  }
}
