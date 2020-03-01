import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../services/employee/employee.service';

@Component({
  selector: 'app-empdetails',
  templateUrl: './empdetails.component.html',
  styleUrls: ['./empdetails.component.css']
})
export class EmpdetailsComponent implements OnInit {
  empDetails = [];
  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
    this.empDetails = this.employeeService.getEmployees();
  }

}
