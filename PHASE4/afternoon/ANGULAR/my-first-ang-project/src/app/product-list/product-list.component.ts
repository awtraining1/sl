import { Component } from '@angular/core';
import { Product } from '../classes/Product';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {

  //products: Product[] = [];

  products: Product[] = [
    new Product("Laptop", 60000,"assets/images/laptop.jpg", true),
    new Product("Keyboard", 560, "assets/images/keyboard.jpg", false),
    new Product("Mouse", 600,'', false),
    new Product("Monitor", 20000,'', true),
  ]

}
