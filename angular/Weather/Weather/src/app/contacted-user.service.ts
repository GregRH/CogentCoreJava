import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ContactedUserService {
	contacted: any[];
  constructor() { 
	this.contacted=[];
  }
	public createUser(con: any){
		if(localStorage.getItem('contact')!=null){
			this.contacted=JSON.parse(localStorage.getItem('contact')||'{}');
		}else{
			this.contacted=[];
		}
		if(con.name != null && con.msg != null && con.email != null){
			this.contacted.push({
				name: con.name,
				email: con.email,
				msg: con.msg
			});
			console.log(this.contacted);
			localStorage.setItem("contact",JSON.stringify(this.contacted));
			return true;
		}else{
			return false;
		}
	}
	public getContactedUser(){
		if(localStorage.getItem("contact")!=null){
			return JSON.parse(localStorage.getItem('contact')||'{}');
		}else{
			return [];
		}
	}
	}
