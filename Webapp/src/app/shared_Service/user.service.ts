import { Injectable, ErrorHandler } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/common/http'
import { Observable } from 'rxjs';
import { User } from '../£models/user';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/observable/throw';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  //PORT MAY HAVE TO CHANGE
  private baseUrl : string = 'http://localhost:8080/user';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});

  constructor(private _http:Http) { }

  getHome(){
    return this._http.get(this.baseUrl + '/home', this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  getAllUser(){
    return this._http.get(this.baseUrl + '/allUsers', this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  getUserById(id:Number){
    return this._http.get(this.baseUrl + '/one/' + id, this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  getUserByUsername(username:String){
    return this._http.get(this.baseUrl + '/one/' + username, this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  errorHandler(error:Response){
    return Observable.throw(error || "SERVER ERROR!");
  }
}
