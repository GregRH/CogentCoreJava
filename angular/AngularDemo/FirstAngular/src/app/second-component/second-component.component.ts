import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second-component',
  templateUrl: './second-component.component.html',
  styleUrls: ['./second-component.component.css']
})
export class SecondComponentComponent implements OnInit {
	numbers:number[]=[1,2,3,4,5,6,7,8,9,10];
  constructor() { }

  ngOnInit(): void {
  }

}
