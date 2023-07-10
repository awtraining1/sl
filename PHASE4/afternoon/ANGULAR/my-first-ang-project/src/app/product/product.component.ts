import { Component } from '@angular/core';
import { Product } from '../classes/Product';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  // name:string='HP Laptop';
  // price:number=2000;

  product: Product = new Product("Laptop",2000);

}
