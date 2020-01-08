import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from './user';

@Injectable({
  providedIn: 'root'
})
export class NavbarService {

  constructor(private http: HttpClient) {
  }


  login(): Observable<User> {
   return this.http.get('endpoint') as Observable<User>;
  }

  logout(): void {

  }
}
