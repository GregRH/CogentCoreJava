import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { AuthenticationService } from './authentication.service';
import { Router } from './router';
import { UserService } from './user.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Weather';
	isLogin:boolean;
	constructor(private authService: AuthenticationService, private router:Router, private userService: UserService){
		this.isLogin=false;
	}
	ngOnInit() {
		this.userService.fireIsLoggedIn.subscribe((user)=>{
			this.isLogin=true;
		})
	}
	ngOnChanges(changes: SimpleChanges):void{
		if(this.authService.isAuthenticatedUser()){
			this.isLogin=true;

		}else{
			this.isLogin=false;
		}
	}
	logoutUser(){
		this.isLogin=false;
		this.authService.logout();
		this.router.navigateByUrl('auth');
	}
}
