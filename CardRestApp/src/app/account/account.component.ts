import { Component, OnInit } from '@angular/core';
import { AccountService } from '../services/account.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  public accountsCount: any;
  public accounts: any;

  constructor(private accountService: AccountService) { }

  ngOnInit() {
    this.initCalls();
  }

  initCalls() {
    this.getAccountsCount();
    this.getAccounts();
  }

  getAccountsCount() {
    this.accountService.getAccountsCount()
      .subscribe(data => {
        this.accountsCount = data;
    });
  }

  getAccounts() {
    this.accountService.getAccounts()
      .subscribe(data => {
        this.accounts = data;
    });
  }

}
