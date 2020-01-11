import {Component, Input, OnDestroy, OnInit} from '@angular/core';
import {Alert, AlertType} from './alert.model';
import {AlertService} from './alert.service';
import {Subscription} from 'rxjs';

@Component({selector: 'alert', templateUrl: 'alert.component.html'})
export class AlertComponent implements OnInit, OnDestroy {
  @Input() id: string;
  alert: Alert;
  subscription: Subscription;

  constructor(private alertService: AlertService) {
  }

  // Method for adding alerts to the alerts array.
  ngOnInit() {
    this.subscription = this.alertService.onAlert(this.id)
      .subscribe(alert => {
        if (!alert.message) {
          // Clears out the alerts array if an empty alert is received.
          this.alert = null;
          return;
        }
        this.alert = alert;
      });
  }

  // Method for removing subscription from the alerts service component when a user navigates away from the page.
  ngOnDestroy():
    void {
    this.subscription.unsubscribe();
  }

// Removes the alert that has been deselected with the "X".
  removeAlert(alert: Alert
  ) {
    this.alert = null;
  }

// Switches the Bootstrap class depending on what type of alert is being displayed.
  cssClass(alert: Alert) {
    if (!alert) {
      return;
    }
    switch (alert.type) {
      case AlertType.Success:
        return 'alert alert-success';
      case AlertType.Error:
        return 'alert alert-danger';
      case AlertType.Info:
        return 'alert alert-info';
      case AlertType.Warning:
        return 'alert alert-warning';
    }
  }
}
