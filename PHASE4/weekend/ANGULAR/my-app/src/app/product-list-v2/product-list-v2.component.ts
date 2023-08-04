import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'product-list-v2',
  templateUrl: './product-list-v2.component.html',
  styleUrls: ['./product-list-v2.component.css']
})
export class ProductListV2Component {

  products!:Product[];

  constructor(private productService: ProductService) {
    this.products=productService.getAllProducts();
  }

}
