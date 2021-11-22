import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingComponent } from './core/components/layouts/landing/landing.component';
const routes: Routes = [
	{ 
		path: '',
		component: LandingComponent,
	},
	{
		path: 'users',
		loadChildren: () =>
			import('./users/users.module').then((m)=>m.UsersModule),

	},
	{
		path: 'dashboard', loadChildren: () => import('./dashboard/dashboard.module').then((m)=>m.DashboardModule),
	},
	{
		path: 'profile', loadChildren: () => import('./profile/profile.module').then((m)=>m.ProfileModule),
	},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
