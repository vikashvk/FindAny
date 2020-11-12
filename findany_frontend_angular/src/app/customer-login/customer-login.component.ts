import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent implements OnInit {

  

  constructor(private service:CustomerService) { }

  ngOnInit(): void {
  }
  authenticate(user){
  this.service.signIn(user).then(response=>{
   

  }).catch(error=>{
    console.log(error);
  
    
    
  })
  }

}
