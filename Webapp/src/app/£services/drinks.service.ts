import {Injectable} from '@angular/core';
import {Observable, of} from 'rxjs';
import {Drink} from '../£models/drink';
import {HttpClient} from '@angular/common/http';
import {catchError, tap} from 'rxjs/operators';
import {subscribeTo} from 'rxjs/internal-compatibility';

@Injectable({
  providedIn: 'root'
})
export class DrinksService {

  constructor(private http: HttpClient) {
  }

  // Gets a single drink by it's id
  getDrinkById(id: number): Observable<Drink> {
    return this.http.get<Drink>(`http://localhost:8080/drink/search/id/${id}`);
  }

  // Gets all drinks that fit a certain search string
  searchDrinks(term: string): Observable<Drink[]> {
    return this.http.get<Drink[]>(`http://localhost:8080/drink/search/name/${term}`);
  }

  //Gets a drink by name
  getDrinkByName(name: string): Observable<Drink[]> {
    return this.http.get<Drink[]>(`http://localhost:8080/drink/search/name/${name}`);
  }

  // Gets all drinks by a specific ingredient
  getDrinksByIngredient(ingredient: string): Observable<Drink[]> {
    return this.http.get<Drink[]>(`http://localhost:8080/drink/search/ingredient/${ingredient}`);
  }

  // Gets all the drinks based on whether they have alcohol in them or not
  getDrinksByAlchohol(alchoholic: boolean): Observable<Drink[]> {
    if (alchoholic) {
      return this.http.get<Drink[]>(`http://localhost:8080/drink/search/search/alcoholic`);
    } else if (!alchoholic) {
      return this.http.get<Drink[]>(`http://localhost:8080/drink/search/search/nonalcoholic`);
    }
  }

  // Get all the drinks that belong to a specific glass
  getDrinksByGlass(glass:string): Observable<Drink[]> {
    return this.http.get<Drink[]>(`http://localhost:8080/drink/search/glass/${glass}`);
  }

  // Gets all the drinks in a certain category
  getDrinksByCategory(category: string): Observable<Drink[]> {
    return this.http.get<Drink[]>(`http://localhost:8080/drink/search/category/${category}`);
  }
}
