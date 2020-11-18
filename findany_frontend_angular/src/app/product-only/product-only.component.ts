import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-product-only',
  templateUrl: './product-only.component.html',
  styleUrls: ['./product-only.component.css']
})
export class ProductOnlyComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  @Input() product: any;
  @Output() productAdded = new EventEmitter();
  addProductToCart(product) {
    this.productAdded.emit(product);
  }
}
