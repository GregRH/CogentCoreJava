import { Component, OnInit } from '@angular/core';
import {ContactedUserService} from '../../../contacted-user.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private contactedService: ContactedUserService) { }
	contactedUsers:any[]

  ngOnInit(): void {
	  this.contactedUsers=this.contactedService.getContactedUser();	
  }
	getContactedUser(){
		this.contactedUsers=this.contactedService.getContactedUser();
		console
	}
}
