import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-component',
  templateUrl: './first-component.component.html',
  styleUrls: ['./first-component.component.css']
})
export class FirstComponentComponent implements OnInit {
	title:string='Welcome to Angular Framework';
	number1:number=20;
	number2:number=30;
	fruits = ['apple','orange','bannana'];
	constructor() {
	
	var alphas:string[];
	alphas=["1","2","3","4"];
	}

  ngOnInit(): void {
  }

}
