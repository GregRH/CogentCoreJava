import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class WeatherApiService {
	email: string = "bala-test@mailinator.com";
	apiKey: string = "e57a097736ff4e0fb3e164235212911";
	url: string = "http://api.weatherapi.com/v1/current.json";
  constructor(private http: HttpClient ) { }
	getWeatherData(location: string){
		let genratedUrl = this.url+"?key="+this.apiKey+"&q="+location+"&aqi=no";
		return this.http.get(genratedUrl);
	}
}
