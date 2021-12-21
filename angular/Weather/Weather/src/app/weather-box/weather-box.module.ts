import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WeatherBoxRoutingModule } from './weather-box-routing.module';
import { WeatherBoxComponent } from './component/weather-box/weather-box.component';


@NgModule({
  declarations: [
    WeatherBoxComponent
  ],
  imports: [
    CommonModule,
    WeatherBoxRoutingModule
  ]
})
export class WeatherBoxModule { }
