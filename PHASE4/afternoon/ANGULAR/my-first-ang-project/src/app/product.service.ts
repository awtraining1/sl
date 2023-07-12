import { Injectable } from '@angular/core';
import { Product } from './classes/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  //APIs
  getAllProducts():Product[] {

    return [
      new Product("Laptop", 60000,"assets/images/laptop.jpg", true, true),
      new Product("Keyboard", 560, "assets/images/keyboard.jpg", false, true),
      new Product("Mouse", 600,'', false, false),
      new Product("Monitor", 20000,'', true, false),
    ];
  }

  getProduct(prodNum:number=0):Product {

    return  new Product("Laptop", 60000,"assets/images/laptop.jpg", true, true);
  }

}
