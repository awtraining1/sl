import { Injectable } from '@angular/core';
import { Product } from './product';

import { HttpClient } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  backEndUrl :String = "http://localhost:8080/api/product/v1";

  constructor(private httpClient: HttpClient) { };

  products:Product[]=[
    new Product("Laptop", 60000, true, true),
    new Product("Keyboard", 560, false, true),
    new Product("Mouse", 600,  false, false),
    new Product("Monitor", 20000, true, false),
  ];

  //SpringBoot integration
  getAllProductsFromSpringBootBackend(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(`${this.backEndUrl}/list`);
  }

  //Sample/Dummy data providers
  getAllProducts(): Product[] {

    return this.products;
  }

  getProducts(index:number): Product {
    return this.products[index]; }

}
