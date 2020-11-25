import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../models/Product';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-shopproduct',
  templateUrl: './shopproduct.component.html',
  styleUrls: ['./shopproduct.component.css']
})
export class ShopproductComponent implements OnInit {
  products: Array<Product>;
  productsRecieved: Array<Product>;
  cartProducts:any;
  constructor(private router:Router,private adminService:AdminService) {

   }

  ngOnInit(): void {
    
    this.adminService.getProducts().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
    //from localstorage retrieve the cart item
    let data = localStorage.getItem('cart');
    //if this is not null convert it to JSON else initialize it as empty
    if (data !== null) {
      this.cartProducts = JSON.parse(data);
    } else {
      this.cartProducts = [];
    }
  }

  handleSuccessfulResponse(response) {
    this.products = new Array<Product>();
    //get products returned by the api call
    this.productsRecieved = response;
    for (const product of this.productsRecieved) {

      const productwithField = new Product();
      productwithField.serialNo = product.serialNo;
      productwithField.name = product.name;
      productwithField.price = product.price;
      productwithField.category = product.category;
      //populate retrieved image field so that product image can be displayed
      // productwithField.retrievedImage = 'data:image/jpeg;base64,' + product.picByte;
      // productwithField.picByte = product.picByte;
      this.products.push(productwithField);
    }
  }
  addToCart(productSerial) {
    //retrieve book from books array using the book id
    let product = this.products.find(product => {
      return product.serialNo === +productSerial;
    });
    let cartData = [];
    //retrieve cart data from localstorage
    let data = localStorage.getItem('cart');
    console.log(data);
    //prse it to json 
    if (data !== null) {
      cartData = JSON.parse(data);
    }
    console.log('aaja');
    // add the selected book to cart data
    cartData.push(product);
    //updated the cartBooks
    this.updateCartData(cartData);
    //save the updated cart data in localstorage
    localStorage.setItem('cart', JSON.stringify(cartData));
    //make the isAdded field of the book added to cart as true
    product.isAdded = true;
  }
  updateCartData(cartData) {
    this.cartProducts = cartData;
  }

  goToCart() {
    this.router.navigate(['/cart']);
  }

  emptyCart() {
    this.cartProducts = [];
    localStorage.clear();
  }

}
