import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IAccount } from '../models/iaccount';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private accountsUrl = '/api/CardRestTransactions/getAccounts';
  private accountsCountUrl = '/api/CardRestTransactions/getAccountsCount';

  constructor(private httpClient: HttpClient) { }

  getAccounts(): Observable<IAccount> {
    return this.httpClient.get<IAccount>(this.accountsUrl);
  }

  getAccountsCount(): Observable<IAccount> {
    return this.httpClient.get<IAccount>(this.accountsCountUrl);
  }

}
