import { User } from './user';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-templatedrivenform',
  templateUrl: './templatedrivenform.component.html',
  styleUrls: ['./templatedrivenform.component.css']
})
export class TemplatedrivenformComponent implements OnInit {
  topics = ['Angular', 'React', 'Vue'];
  userModel = new User('John Doe', 'johndoe@test.com', 9999999999, '', 'morning', true);
  constructor() { }

  ngOnInit() {
  }

}
