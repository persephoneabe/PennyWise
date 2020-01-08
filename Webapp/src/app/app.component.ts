import { Component } from '@angular/core';
import { faRubleSign } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Webapp';
  faRubleSign = faRubleSign;
}
