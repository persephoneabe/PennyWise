import {Injectable} from '@angular/core';
import {Observable, Subject} from 'rxjs';
import {Alert, AlertType} from './alert.model';
import {NavigationStart, Router} from '@angular/router';
import {filter} from 'rxjs/operators';

@Injectable({providedIn: 'root'})
export class AlertService {
  private subject = new Subject<Alert>();
  private keepAfterRouteChange = false;

  constructor(private router: Router) {
    // Creates an event trigger that clears alerts on a page refresh.
    this.router.events.subscribe(event => {
      if (event instanceof NavigationStart) {
        if (this.keepAfterRouteChange) {
          this.keepAfterRouteChange = false;
        } else {
          this.clear();
        }
      }
    });
  }

  // Allows for application components to subscribe to alerts as observables
  onAlert(alertId?: string): Observable<Alert> {
    return this.subject.asObservable().pipe(filter(x => x && x.alertId === alertId));
  }

  // Method for clearing alerts.
  clear(alertId?: string) {
    this.subject.next(new Alert({alertId}));
  }

  // Actual alert method.
  alert(alert: Alert) {
    this.keepAfterRouteChange = alert.keepAfterRoutingChange;
    this.subject.next(alert);
  }

  // Methods for specifying alert type more easily.
  sucess(message: string, alertId?: string) {
    this.alert(new Alert({message, type: AlertType.Success, alertId}));
  }

  error(message: string, alertId?: string) {
    this.alert(new Alert({message, type: AlertType.Error, alertId}));
  }

  info(message: string, alertId?: string) {
    this.alert(new Alert({message, type: AlertType.Info, alertId}));
  }

  warn(message: string, alertId?: string) {
    this.alert(new Alert({message, type: AlertType.Warning, alertId}));
  }
}
