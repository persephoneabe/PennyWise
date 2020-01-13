import { Component, OnInit } from '@angular/core';
import {DrinksService} from '../£services/drinks.service';
import {Drink} from '../£models/drink';

@Component({
  selector: 'app-glass',
  templateUrl: './glass.component.html',
  styleUrls: ['./glass.component.css']
})
export class GlassComponent implements OnInit {
  drinks: Drink[];
  showlist: boolean;
  Glass: string;
  Glasses: string[] = [
    'Balloon Glass',
    'Beer Glass',
    'Beer mug',
    'Brandy snifter',
    'Champagne flute',
    'Cocktail glass',
    'Coffee mug',
    'Collins glass',
    'Copper Mug',
    'Highball Glass',
    'Hurricane glass',
    'Irish coffee cup',
    'Jar',
    'Margarita/Coupette glass',
    'Martini Glass',
    'Nick and Nora Glass',
    'Old-fashioned glass',
    'Pint glass',
    'Pousse cafe glass',
    'Punch bowl',
    'Shot glass',
    'Wine Glass',
    'Whiskey sour glass'
  ];
  constructor(private drinksService: DrinksService) { }

  ngOnInit() {
    this.showlist = true;
  }
  select(selection: string): void {
    this.Glass = selection;
    this.showlist = false;
  }
  search(): void {
      this.drinksService.getDrinksByGlass(this.Glass).subscribe(data => {
          this.drinks = data;
        }
      );
    }
  }
