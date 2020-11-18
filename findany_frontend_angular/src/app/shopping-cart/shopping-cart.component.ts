import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  @Input() products: any[];
  @Output() productRemoved = new EventEmitter();
  calcTotal() {
    return this.products.reduce((acc, prod) => acc+= prod.num ,0)
  }
  removeProduct(product) {
    this.productRemoved.emit(product)
  }
}
