import {Component, OnInit} from '@angular/core';
import {DrinksService} from '../£services/drinks.service';
import {Drink} from '../£models/drink';
import {Observable, Subject} from 'rxjs';
import {debounceTime, distinctUntilChanged, switchMap} from 'rxjs/operators';

@Component({
  selector: 'app-drinksearch',
  templateUrl: './drinksearch.component.html',
  styleUrls: ['./drinksearch.component.css']
})
export class DrinksearchComponent implements OnInit {
  private searchtext: string;
  drinks: Drink[];

  constructor(private drinksService: DrinksService) {
  }

  ngOnInit(): void {
   // this.drinks = this.searchtext.pipe(debounceTime(1000), distinctUntilChanged(), switchMap(
     // (term: string) => this.drinksService.searchDrinks(term)));
  }

  search(): void {
    this.drinksService.searchDrinks(this.searchtext).subscribe(data => {
      this.drinks = data;
      console.log(this.drinks);
    });
  }

}
