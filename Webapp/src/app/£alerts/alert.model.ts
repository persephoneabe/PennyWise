// Model file that represents our alerts.
export class Alert {
  type: AlertType;
  message: string;
  alertId: string;
  keepAfterRoutingChange: boolean;

  constructor(init?: Partial<Alert>) {
    Object.assign(this, init);
  }
}

export enum AlertType {
  Success,
  Error,
  Info,
  Warning
}
