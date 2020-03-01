import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-star',
  templateUrl: './star.component.html',
  styleUrls: ['./star.component.css']
})
export class StarComponent implements OnInit {

  starsSelected = 0;

  constructor() { }

  ngOnInit() {
  }

  selectStar(starVal: number) {
    this.starsSelected = starVal;
  }

}
