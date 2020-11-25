import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../models/Product';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-adminupdateproduct',
  templateUrl: './adminupdateproduct.component.html',
  styleUrls: ['./adminupdateproduct.component.css']
})
export class AdminupdateproductComponent implements OnInit {
  id: number;
  product: Product;
  submitted = false;

  constructor(private route: ActivatedRoute,private router: Router, private adminService: AdminService) { }
  
  ngOnInit(): void {
    this.product = new Product();

    this.id = this.route.snapshot.params['id'];
    
    this.adminService.getProductByid(this.id)
      .subscribe(data => {
        console.log(data)
        this.product = data;
      }, error => console.log(error));
  }

  updateBill() {
    this.adminService.editProduct(this.id, this.product)
      .subscribe(data => console.log(data), error => console.log(error));
    this.product = new Product();
  }

  onSubmit() {
    this.submitted = true;
    this.updateBill();    
  }


}
