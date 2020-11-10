import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

import { ProductList } from '../models/ProductList';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-admin-product-list',
  templateUrl: './admin-product-list.component.html',
  styleUrls: ['./admin-product-list.component.css']
})
export class AdminProductListComponent implements OnInit {
  productList: Observable<ProductList[]>;
  serialNo: number;

  constructor( private route: ActivatedRoute, private router: Router, private adminService: AdminService) { }

  ngOnInit(): void {
    this.serialNo = Number(this.route.snapshot.paramMap.get('serialNo'));
    this.reloadData();

    
  }
  reloadData() {
    debugger
    this.productList = this.adminService.getAllProductList(this.serialNo);
  }

}
