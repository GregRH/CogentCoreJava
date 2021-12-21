import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticatedService {

  constructor() { }
	public getAutheticatedUser():string|null{
		if(this.isAuthenticatedUser()){
			if(localStorage.getItem('auth')!=null){
				return JSON.parse(localStorage.getItem('auth')||'{}');
			}
		}
		return null;
	}
	public isAuthenticatedUser(){
		if(localStorage.getItem('login')==='true'){
			return true; 
		}else{
			return false;
		}
	}
	public setAuthenticatedUser(auth: any){
		localStorage.setItem("login","true");
		localStorage.setItem("auth",JSON.stringify(auth));
	}
	public logout(){
		localStorage.removeItem("auth");
		localStorage.removeItem("login");
	}
}
