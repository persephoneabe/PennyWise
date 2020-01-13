import { Component, OnInit } from '@angular/core';
import {Drink} from '../£models/drink';
import {DrinksService} from '../£services/drinks.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {
  drinks: Drink[];
  showlist: boolean;
  Category: string;
  Categories: string[] = [
    'Beer',
    'Cocoa',
    'Coffee / Tea',
    'Cocktail',
    'Homemade Liqueur',
    'Milk / Float / Shake',
    'Ordinary Drink',
    'Punch / Party Drink',
    'Soft Drink / Soda',
    'Other/Unknown'
  ];
  constructor(private drinksService: DrinksService) { }

  ngOnInit() {
    this.showlist = true;
  }
  select(selection: string): void {
    this.Category = selection;
    this.showlist = false;
  }
  search(): void {
    this.drinksService.getDrinksByCategory(this.Category).subscribe(data => {
        this.drinks = data;
      }
    );
  }
}
