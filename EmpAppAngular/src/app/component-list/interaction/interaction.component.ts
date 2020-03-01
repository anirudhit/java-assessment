import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-interaction',
  templateUrl: './interaction.component.html',
  styleUrls: ['./interaction.component.css']
})
export class InteractionComponent implements OnInit {

  @Input('employee') emp;
  @Output() empMessage = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  sendMessage() {
    this.empMessage.emit('Message from interaction component');
  }

}
