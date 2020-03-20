import { Component, OnInit } from '@angular/core';
import { DashboardService } from '../services/dashboard.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  public dashboardCounts: any;
  constructor(private dashboardService: DashboardService) { }

  ngOnInit() {
    this.dashboardService.getCounts()
      .subscribe(data => {
        this.dashboardCounts = data;
        console.log(this.dashboardCounts);
      });
  }

}
