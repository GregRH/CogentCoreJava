    import { Employee } from './../employee';
   import { Component, OnInit, Input } from '@angular/core';
     import { EmployeeServiceService } from '../employee-service.service';
     import { EmployeeListComponent } from '../employee-list/employee-list.component';
     
     @Component({
       selector: 'app-employee-details',
       templateUrl: './employee-details.component.html',
       styleUrls: ['./employee-details.component.css']
    })
  export class EmployeeDetailsComponent implements OnInit {
    
    @Input() employee!: Employee;
    
      constructor(private employeeService: EmployeeServiceService, 
        private listComponent: EmployeeListComponent) { }
    
      ngOnInit() {
      }
    }
