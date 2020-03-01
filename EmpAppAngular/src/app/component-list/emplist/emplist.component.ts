import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../services/employee/employee.service';

@Component({
  selector: 'app-emplist',
  templateUrl: './emplist.component.html',
  styleUrls: ['./emplist.component.css']
})
export class EmplistComponent implements OnInit {
  empList = [];
  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
    this.empList = this.employeeService.getEmployees();
    console.log(this.empList);
  }

}
