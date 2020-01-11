import { Injectable } from '@angular/core';
import { User } from '../£models/user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http:Http) { }

  login(user:User){
    return this._http.post(this.baseUrl + '/login', this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }
}
