import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable, throwError } from 'rxjs';

import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products!:Product[];

  private backEndUrl ='http://localhost:8080/product';

  constructor(private http: HttpClient) { }

  // APIs
  public getAllProducts(): Observable<Product[]> {

    // this.products = [ 
    //   new Product("Laptop", 60000, "assets/img/laptop.jpg", "200", true, true),
    //   new Product("Keyboard", 600,  "assets/img/KeyB.jpg","200", false, true),
    //   new Product("Mouse", 108,  "assets/img/laptop.jpg","200", false, true),
    //   new Product("Printer", 12000.25, "assets/img/laptop.jpg","200", true, false),
    // ];
    //return this.products;    
    return this.http.get<Product[]>(`${this.backEndUrl}/list`);    
  }

  // get a product at index 
  public getProduct(idx : number) : Observable<Product>  {
      //return this.products[idx];
      return this.http.get<Product>(`${this.backEndUrl}/details/${idx}`);
  }

  // get a product at index 
  public getNewProduct() : Product {
    return new Product(0,"",0,"","100",true,true);
}
}
