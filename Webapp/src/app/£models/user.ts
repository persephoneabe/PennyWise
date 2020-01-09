import { BankAccount } from './bankaccount';

export class User {
  accId: number;
  accUsername: string;
  accPassword: string;
  accFullname: string;
  bankAccount: BankAccount;

  token: string;
}
