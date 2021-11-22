import { Component, OnInit } from '@angular/core';
import {Register} from 'src/app/users/models/register';
import {AuthService} from 'src/app/users/services/auth.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
	register: Register = new Register();

  constructor(private authService: AuthService) { }

  ngOnInit(): void {}
  registerSubmit(){
	  this.authService.registerUser(this.register).subscribe(
			(res)=>{
				console.log(JSON.stringify(res))
			} ,
		  (err)=>{
			  console.log(JSON.stringify(err))
		  }
	  );

	console.log(JSON.stringify(this.register));
  }
}
