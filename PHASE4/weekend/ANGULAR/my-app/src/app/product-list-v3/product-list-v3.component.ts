import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product-list-v3',
  templateUrl: './product-list-v3.component.html',
  styleUrls: ['./product-list-v3.component.css']
})
export class ProductListV3Component {

  products!:Product[];

  constructor(private productService: ProductService) {
   
  }

  ngOnInit(): void {   
    
    this.productService.getAllProductsFromSpringBootBackend().subscribe(
     (response) => { this.products = response; },
     (error) => { console.log(error); });
 }

}
