import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  public usersCount: any;
  public users: any[];

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.initCalls();
  }

  initCalls() {
    this.getUsersCount();
    this.getUsers();
  }

  getUsersCount() {
    this.userService.getUsersCount()
      .subscribe(data => {
        this.usersCount = data;
      });
  }

  getUsers() {
    this.userService.getUsers()
      .subscribe(data => {
        this.users = data;
      });
  }

}
