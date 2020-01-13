import {Component, OnInit} from '@angular/core';
import {Drink} from '../£models/drink';
import {DrinksService} from '../£services/drinks.service';

@Component({
  selector: 'app-alcohol',
  templateUrl: './alcohol.component.html',
  styleUrls: ['./alcohol.component.css']
})
export class AlcoholComponent implements OnInit {
  drinks: Drink[];
  showlist: boolean;
  Alchohol: string;
  Alchohols: string[] = [
    'Baileys Irish Cream',
    'Brandy',
    'Bourbon',
    'Champagne',
    'Dark Rum',
    'Dry Vermouth',
    'Gin',
    'Grenadine',
    'Irish Whiskey',
    'Jack Daniels',
    'Jagermeister',
    'Kahlua',
    'Light Rum',
    'Malibu Rum',
    'Peach Schnapps',
    'Red Wine',
    'Rye Whiskey',
    'Scotch',
    'Southern Comfort',
    'Sweet Vermouth',
    'Tequila',
    'Triple Sec',
    'Vodka',
    'Mocktails'
  ];
  constructor(private drinksService: DrinksService) {
  }
  ngOnInit() {
    this.showlist = true;
  }

  select(selection: string): void {
    this.Alchohol = selection;
    this.showlist = false;
  }

  search(): void {
    if (this.Alchohol === 'Mocktails') {
      this.drinksService.getDrinksByAlchohol(false).subscribe(data => {
          this.drinks = data;
        }
      );
    } else {
      this.drinksService.getDrinksByIngredient(this.Alchohol).subscribe(data => {
          this.drinks = data;
        }
      );
    }
  }
}
