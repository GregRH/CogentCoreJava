import { Component, OnInit } from '@angular/core';
import {Login} from 'src/app/users/models/login';

import {AuthService} from 'src/app/users/services/auth.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
	login: Login = new Login();
  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }
	loginSubmit(){
		
	  this.authService.loginUser(this.login).subscribe(
			(res)=>{
				console.log(JSON.stringify(res))
			} ,
		  (err)=>{
			  console.log(JSON.stringify(err))
		  }
	  );

	console.log(JSON.stringify(this.login));

	}
}
