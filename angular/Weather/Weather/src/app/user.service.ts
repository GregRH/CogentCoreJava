import { EventEmitter, Output, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
	users:any[];
	@Output() fireIsLoggedIn:EventEmitter<any> = new EventEmitter<any>();
  constructor() { 
	this.users = [];

  }
public createUser(user: any){
	if(localStorage.getItem('users')!=null){
		this.users=JSON.parse(localStorage.getItem('users')||'{}');
	}else{
		this.users=[];
	}
	if(user.name!=null && user.password != null && user.email != null){
		this.users.push({
			name:user.name,
			email: user.email,
			password: user.password
		});
		console.log(this.users);
		localStorage.setItem("users",JSON.stringify(this.users));
		return true;
	}else{
		return false
	}
	}
	public getUsers(){
		this.users=JSON.parse(localStorage.getItem("users")||'{}');
		return this.users;
	}
	public getEmitter(){
		this.fireIsLoggedIn;

	}
	public loginUser(auth: any){
		this.users = this.getUsers();
		for(let i=0;i<this.users.length;i++){
			if(auth.email === this.users[i].email && auth.password == this.users[i].password){
				this.fireIsLoggedIn.emit({auth});
				return true;
			}

		}
		return false;
	}

}
