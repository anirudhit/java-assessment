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
  private addAccountUrl = '/api/CardRestTransactions/addAccount';

  constructor(private httpClient: HttpClient) { }

  getAccounts(): Observable<IAccount> {
    return this.httpClient.get<IAccount>(this.accountsUrl);
  }

  getAccountsCount(): Observable<IAccount> {
    return this.httpClient.get<IAccount>(this.accountsCountUrl);
  }

  addAccount(account: any): Observable<IAccount> {
    return this.httpClient.post<IAccount>(this.addAccountUrl, account);
  }

}
