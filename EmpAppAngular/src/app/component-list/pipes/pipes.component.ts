import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  message = 'Hello pipes, component';
  value = 5.3876;
  percent = .15;
  currency = 15;
  today = new Date();
  employee = {
    id: 1,
    firstName: 'John',
    lastName: 'Doe'
  };
  constructor() { }

  ngOnInit() {
  }

}
