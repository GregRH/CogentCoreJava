import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UsersRoutingModule } from './users-routing.module';
import { LoginComponent } from './components/auth/login/login.component';
import { RegisterComponent } from './components/auth/register/register.component';
import {AuthService} from './services/auth.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

@NgModule({
	declarations: [ LoginComponent, RegisterComponent ],
	imports: [ CommonModule, HttpClientModule, UsersRoutingModule, FormsModule],
	providers: [AuthService],
})
export class UsersModule { }
