import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

import { Product } from '../models/Product';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-admin-product-list',
  templateUrl: './admin-product-list.component.html',
  styleUrls: ['./admin-product-list.component.css']
})
export class AdminProductListComponent implements OnInit {
  product: Observable<Product[]>;
  serialNo: number;

  constructor( private route: ActivatedRoute, private router: Router, private adminService: AdminService) { }

  ngOnInit(): void {
    this.serialNo = Number(this.route.snapshot.paramMap.get('serialNo'));
    this.reloadData();

    
  }
  reloadData() {
    debugger
    this.product = this.adminService.getAllProductList(this.serialNo);
  }

}
