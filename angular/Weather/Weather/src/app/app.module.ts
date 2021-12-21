import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/components/home/home.component';
import { ContactUsComponent } from './contact-us/component/contact-us/contact-us.component';
import { LoginComponentComponent } from './login-register/component/login-component/login-component.component';
import { ReactiveFormsModule } from '@angular/forms';
import { WeatherBoxComponent } from './weather-box/component/weather-box/weather-box.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
	  HomeComponent,
	  ContactUsComponent,
	  LoginComponentComponent,
	  WeatherBoxComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	  ReactiveFormsModule,
	  HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
