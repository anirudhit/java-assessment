import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IDashboard } from '../models/idashboard';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  // private countsUrl = '/api/CardRestTransactions/getDashboardCounts';
  private countsUrl = 'http://localhost:8080/CardRestTransactions/getDashboardCounts';

  constructor(private http: HttpClient) { }

  getCounts(): Observable<IDashboard> {
    return this.http.get<IDashboard>(this.countsUrl);
  }
}
