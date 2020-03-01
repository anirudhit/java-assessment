import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }

  getEmployees(){
    return [{
      id: 1,
      firstName: 'John',
      lastName: 'Doe'
    },{
      id: 2,
      firstName: 'James',
      lastName: 'Borg'
    },{
      id: 3,
      firstName: 'Amanda',
      lastName: 'DJonesoe'
    }];
  }
}
