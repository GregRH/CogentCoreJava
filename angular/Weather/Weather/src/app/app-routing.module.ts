import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AuthenticatedGuard } from './authenticated.guard';
import { ContactUsComponent } from './contact-us/component/contact-us/contact-us.component';
import { LoginComponentComponent } from './login-register/component/login-component/login-component.component';
import { WeatherBoxComponent } from './weather-box/component/weather-box/weather-box.component';
import { HomeComponent } from './home/components/home/home.component';

const routes: Routes = [
	{
		path: '',
		component: LoginComponentComponent
	},
	{
		path: 'auth',
		component: LoginComponentComponent
	},
	{
		path: 'contact',
		component: ContactUsComponent
	},
	{
		path: 'home',
		component: HomeComponent
	},
	{
		path: 'weather',
		component: WeatherBoxComponent,
		canActivate: [ AuthenticatedGuard ]
	}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
