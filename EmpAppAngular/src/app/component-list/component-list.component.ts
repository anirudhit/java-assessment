import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component-list',
  templateUrl: './component-list.component.html',
  styleUrls: ['./component-list.component.css']
})
export class ComponentListComponent implements OnInit {

  employee = {
    id: 1,
    firstName: 'John',
    lastName: 'Doe'
  };

  message = '';

  constructor() { }

  ngOnInit() {
  }

}
