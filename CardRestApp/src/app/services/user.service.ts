import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IUser } from './../models/iuser';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl = 'api/CardRestTransactions/getUsers';
  private usersCountUrl = 'api/CardRestTransactions/getUsersCount';

  constructor(private httpClient: HttpClient) { }

  getUsers(): Observable<IUser[]> {
    return this.httpClient.get<IUser[]>(this.usersUrl);
  }

  getUsersCount(): Observable<IUser> {
    return this.httpClient.get<IUser>(this.usersCountUrl);
  }
}
