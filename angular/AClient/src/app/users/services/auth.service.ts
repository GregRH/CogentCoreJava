import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Register} from '../models/register';
import { Observable } from 'rxjs';
import {Login} from '../models/login';
const headersData = {headers: {'Content-Type': 'application/json'}};

@Injectable({
  providedIn: 'root'
})
export class AuthService {
	api = '/api/users/';
	constructor(private httpClient: HttpClient) { }
	registerUser(register: Register): Observable<any>{
		return this.httpClient.post(this.api+"register", register, headersData);
	}
	loginUser(login: Login): Observable<any>{
		return this.httpClient.post(this.api+"login", login, headersData);
	}
	
}
