import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-to-cart',
  templateUrl: './product-to-cart.component.html',
  styleUrls: ['./product-to-cart.component.css']
})
export class ProductToCartComponent implements OnInit {
  productList = [
    {name: 'Women dress', price: 8799},
    {name: 'Horse toy', price: 999},
    {name: 'sport gloves', price: 99}
   ];
  cartProductList = [];
 
  addProductToCart(product) {
    const productExistInCart = this.cartProductList.find(({name}) => name === product.name); // find product by name
    if (!productExistInCart) {
      this.cartProductList.push({...product, num:1}); // enhance "porduct" opject with "num" property
      return;
    }
    productExistInCart.num += 1;
  }
   removeProduct(product) {
    this.cartProductList = this.cartProductList.filter(({name}) => name !== product.name)
   }
  constructor() { }

  ngOnInit(): void {
  }

}
