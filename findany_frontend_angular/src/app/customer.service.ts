import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }
  
  signIn(user)
  {
    return this.http.post('http://localhost:8080/authenticate',user).toPromise();
  }
  
  signUp(user)
 {
   return this.http.post('http://localhost:8080/register',user).toPromise();
 }
}

