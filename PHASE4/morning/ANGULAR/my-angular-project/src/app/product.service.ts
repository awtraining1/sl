import { Injectable } from '@angular/core';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!:Product[];

  constructor() { }

  // APIs
  public getAllProducts(): Product[] {
    this.products = [ 
      new Product("Laptop", 60000, "assets/img/laptop.jpg", "200", true, true),
      new Product("Keyboard", 600,  "assets/img/KeyB.jpg","200", false, true),
      new Product("Mouse", 108,  "assets/img/laptop.jpg","200", false, true),
      new Product("Printer", 12000.25, "assets/img/laptop.jpg","200", true, false),
    ];

    return this.products;
  }
}
