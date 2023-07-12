import { Component, OnInit } from '@angular/core';
import { Product } from '../classes/Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit{
 products: Product[] = [];

  constructor(private productService: ProductService) {
  }
  
  ngOnInit(): void {   
     //this.products = this.productService.getAllProducts();

     this.productService.getAllProductsFromBackend().subscribe(
      (response) => { this.products = response; },
      (error) => { console.log(error); });
  }

}
