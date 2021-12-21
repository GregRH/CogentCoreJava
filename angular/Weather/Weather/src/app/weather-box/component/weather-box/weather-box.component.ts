import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup } from '@angular/forms';
import { WeatherApiService } from '../../../weather-api.service';
@Component({
  selector: 'app-weather-box',
  templateUrl: './weather-box.component.html',
  styleUrls: ['./weather-box.component.css']
})
export class WeatherBoxComponent implements OnInit {
	result:any;
	searchForm: FormGroup;
  constructor(private weatherService: WeatherApiService) { }

  ngOnInit(): void {
	  this.searchForm = new FormGroup({
		  search: new FormControl
	  });
	  this.result = {
		  "temp":0,
		  "wind":0,
		  "pressure":0,
		  "humidity":0,
		  "city":"NA",
		  "region":"NA",
		  "country":"NA"
	  }
  }
	getWeatherForCity(){
		let loc=this.searchForm.value.search;
		if(loc != null){
			this.getWeatherData(loc);
		}
	}
	public getWeatherData(location){
		this.weatherService.getWeatherData(location).subscribe(
			(data: any)=>{
				this.result = {
					"temp":data.current.temp_c,
					"wind": data.current.wind_mph,
					"pressure": data.current.pressure_mb,
					"humidity": data.current.humidity,
					"city":data.location.name,
					"region":data.location.region,
					"country":data.location.country
				}
			},
			(error: any)=>{
				console.log("Error");
			
			}
		)
	}

}
