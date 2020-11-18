import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxJs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  private baseUrl = 'http://localhost:8090/findany';

  constructor(private http: HttpClient) { 
  }

  createProduct(product: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + '/addProduct', product);
  }

  getAllProductList(): Observable<any> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
        // Authorization: 'Bearer ' + token
      })
    };
    return this.http.get(`${this.baseUrl}` + '/allproducts',httpOptions);
  }


  getCustomerList(): Observable<any> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
        // Authorization: 'Bearer ' + token
      })
    };
    return this.http.get(`${this.baseUrl}` + '/Customers');
  }



  deleteProduct(id: any): Observable<any>{
    return this.http.delete(`${this.baseUrl}` + '/remove/' + `${id}`, { responseType : 'text'});
  }

  editProduct(id:number, value:any):Observable<Object>
{
    return this.http.put(`${this.baseUrl}`+'/update/' + `${id}`, value);
}
  
  viewBilldetail(id: any):Observable<any>
{
  return this.http.get(`${this.baseUrl}`+'/Bills/' + `${id}`);
}

  getBillByid(id: any): Observable<any> 
{
  return this.http.get(`${this.baseUrl}`+'/Bills/' + `${id}`);
}

  getBillBycustid(id: any): Observable<any> 
{
  return this.http.get(`${this.baseUrl}`+'/Billscust/' + `${id}`);
}

}
