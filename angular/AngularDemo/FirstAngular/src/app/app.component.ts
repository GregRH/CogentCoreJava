import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FirstAngular';
	listItems: any[]=[{
		"ID":"101",
		"Name":"Anaita"
	},{
		"ID":"102",
		"Name":"Joseph"
	}];
}
