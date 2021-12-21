import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ContactedUserService } from '../contacted-user.service';
@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent implements OnInit {
	contactForm: FormGroup;
	isSubmited: boolean;
	submitStatus: boolean;
	msg: string;

  constructor(private contactService: ContactedUserService) { }

  ngOnInit(): void {
	  this.contactForm=new FormGroup({
		  name: new FormControl(),
		  email: new FormControl(),
		  msg: new FormControl()
	  });
  }
	contactSave(){
		if(this.contactService.createUser(this.contactForm.value)){
			this.isSubmited=true;
			this.submitStatus=true;
			this.msg="we will get back to you shortly";
		}else{
			this.isSubmited=true;
			this.submitStatus=false;
			this.msg="Contact Failed"
		}
	}
}
