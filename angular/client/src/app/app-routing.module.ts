import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [{
	path:'dashboard',
	loadChildren:()=>import('./dashboard/dashboard.module').then(m=>m.DashboardModule)

},
{
	path:'profile',
	loadChildren:()=>import('./profile/profile.module').then(m=>m.ProfileModule)
},
{
	path:'comments',
	loadChildren:()=>import('./comments/comments.module').then(m=>m.CommentsModule)

}];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
