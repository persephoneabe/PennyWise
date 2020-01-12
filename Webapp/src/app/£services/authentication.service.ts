import {Injectable} from '@angular/core';
import {BehaviorSubject, config, Observable} from 'rxjs';
import {User} from '../£models/user';
import {HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  private currentUserSubject: BehaviorSubject<User>;
  public currentUser: Observable<User>;

  constructor(private http: HttpClient) {
    this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser')));
    this.currentUser = this.currentUserSubject.asObservable();
  }

  public get currentUserValue(): User {
    return this.currentUserSubject.value;
  }

  login(username, password) {
    return this.http.post<any>('http://localhost:8080/login', {username, password}).pipe(map(user => {
      // Storing user token in local storage to retain user session between page refreshing
      localStorage.setItem('currentUser', JSON.stringify(user));
      this.currentUserSubject.next(user);
      return user;
    }));
  }

  logout() {
    // Removing user token from local storage to invalidate session
    localStorage.remoeItem('currentUser');
    this.currentUserSubject.next(null);
  }

  register(fullname, username, password) {
    return this.http.post('http://localhost:8080/register', {fullname, username, password});
  }
}
