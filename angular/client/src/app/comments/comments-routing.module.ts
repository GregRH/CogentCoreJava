import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CommentComponent} from './components/comment/comment.component';

const routes: Routes = [
	{
		path:'',
		component:CommentComponent,

	},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CommentsRoutingModule { }
