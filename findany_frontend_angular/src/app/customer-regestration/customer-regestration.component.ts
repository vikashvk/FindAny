import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';


@Component({
  selector: 'app-customer-regestration',
  templateUrl: './customer-regestration.component.html',
  styleUrls: ['./customer-regestration.component.css']
})
export class CustomerRegestrationComponent implements OnInit {

  constructor(private service:CustomerService) { }

  ngOnInit(): void {
  }
  register(user){
    this.service.signUp(user).then(response=>{
     console.log(response);

   }).catch(error=>{
     console.log(error);
    })
  
  
  }
}
