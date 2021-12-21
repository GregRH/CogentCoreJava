import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router,RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthenticatedService } from './authenticated.service';

@Injectable({
  providedIn: 'root'
})
export class AuthenticatedGuard implements CanActivate {

	constructor(private authService: AuthenticatedService, private route: Router){
	}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
	if(this.authService.isAuthenticated()){
		return true;
	}else{
		this.route.navigateByUrl("auth");
		return false;
	}
  }
  
}
