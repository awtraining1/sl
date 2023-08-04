import { Injectable } from '@angular/core';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products:Product[]=[
    new Product("Laptop", 60000, true, true),
    new Product("Keyboard", 560, false, true),
    new Product("Mouse", 600,  false, false),
    new Product("Monitor", 20000, true, false),
  ];

  getAllProducts(): Product[] {

    return this.products;
  }

  getProducts(index:number): Product {
    return this.products[index];
  }


  constructor() { }
}
