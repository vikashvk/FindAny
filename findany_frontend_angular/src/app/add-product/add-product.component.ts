import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductList } from '../models/ProductList';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  product: ProductList = new ProductList();
  submitted = false;
  serialNo: number;
  constructor(private route: ActivatedRoute, private router: Router, private adminService: AdminService) { }

  // addForm: FormGroup;

  ngOnInit() {

  }

  newproduct(): void {
    this.submitted = false;
    this.product = new ProductList();
  }

  save() {
    console.log(this.product);
    this.adminService.createProduct(this.product)
      .subscribe(data => console.log(data), error => console.log(error));
    this.serialNo = this.product.serialNo;
 
  }

  onSubmit() {
    // if (this.addForm.invalid == true) {
    //   console.log('invalid');
    //   return;
    // }
    this.submitted = true;
    this.save();
    
  }

}
