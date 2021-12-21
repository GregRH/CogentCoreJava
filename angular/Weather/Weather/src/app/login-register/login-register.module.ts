import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginRegisterRoutingModule } from './login-register-routing.module';
import { LoginComponentComponent } from './component/login-component/login-component.component';


@NgModule({
  declarations: [
    LoginComponentComponent
  ],
  imports: [
    CommonModule,
    LoginRegisterRoutingModule
  ]
})
export class LoginRegisterModule { }
