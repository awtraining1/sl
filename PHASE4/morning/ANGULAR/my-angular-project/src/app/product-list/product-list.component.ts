import { Component, OnChanges, OnDestroy, OnInit } from '@angular/core';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit, OnChanges, OnDestroy {

  products: Product[] = [];

  constructor(private productService: ProductService) {
    console.log("ProductListComponent: Constructor called ");
  }

  ngOnInit(): void {
    console.log("ProductListComponent: ngOnInit called ");

    // this.products = this.productService.getAllProducts();

    this.productService.getAllProducts().subscribe(
      (response) => { this.products = response; },
      (error) => { console.log(error); });
  }

  ngOnChanges(): void {
    console.log("ProductListComponent: ngOnChanges called ");
    this.productService.getAllProducts().subscribe(
      (response) => { this.products = response; },
      (error) => { console.log(error); });
  }

  ngOnDestroy(): void {
    console.log("ProductListComponent: ngOnDestroy called ")
  }

}
