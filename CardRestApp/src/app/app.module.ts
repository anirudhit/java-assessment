import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountComponent } from './account/account.component';
import { TransactionHistoryComponent } from './transaction-history/transaction-history.component';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    DashboardComponent,
    AccountComponent,
    TransactionHistoryComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
