import { Component, OnInit } from '@angular/core';
import { DrinksService } from '../£services/drinks.service';

@Component({
  selector: 'app-individualdrink',
  templateUrl: './individualdrink.component.html',
  styleUrls: ['./individualdrink.component.css']
})
export class IndividualdrinkComponent implements OnInit {
  private input: string;
  drinks: Array<any>;

  constructor(private drinksService: DrinksService) { }

  ngOnInit() {
      this.drinksService.getDrinkByName(this.input).subscribe(data => {
        this.drinks = data;
      });
      console.log(this.drinks);
  }
  // input(input: any) {
  //   throw new Error("Method not implemented.");
  // }
}
