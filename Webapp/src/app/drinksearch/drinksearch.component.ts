import {Component} from '@angular/core';
import {DrinksService} from '../£services/drinks.service';

import {Drink} from '../£models/drink';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-drinksearch',
  templateUrl: './drinksearch.component.html',
  styleUrls: ['./drinksearch.component.css']
})
export class DrinksearchComponent {
  private input: string;
  drinks: Drink[];

  constructor(private drinksService: DrinksService) {
  }

  search(): void {
    this.drinksService.searchDrinks(this.input).subscribe(data => {
      this.drinks = data;
    });
    console.log(this.drinks);
  }
}
