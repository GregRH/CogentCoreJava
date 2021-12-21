import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticatedService } from '../../../authenticated.service';
import { UserService } from '../../../user.service';
@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
	login:boolean;
	registerForm: FormGroup;
	loginForm:FormGroup;
	loginerror: string;

  constructor(private userService: UserService, private authenticationService: AuthenticatedService,
	  private router: Router) {
	this.login = true;
  }


  ngOnInit(): void {
	  this.registerForm = new FormGroup({
		  name: new FormControl(),
		  email: new FormControl(),
		  password: new FormControl()
	  });
	this.loginForm  = new FormGroup({
		email: new FormControl(),
		password: new FormControl()
	});
  }
	registerUser(screen)
	{
		if(screen == 0){
			this.login=false;
		}else { 
			this.login = true;
		}
	}
	loginFormSubmit(){
		if(this.userService.loginUser(this.loginForm.value)){
			this.authenticationService.setAuthenticatededUser(this.loginForm.value);
			this.router.navigateByUrl("home");
		}
		else{
			this.loginerror="Username/Password Inocorrect";
		}
	}
	registerFormSubmit(){
		if(this.userService.createUser(this.registerForm.value)){
			this.router.navigateByUrl("home");
		}else{
			console.log('Error');
		}}
}
