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
    new Product("Laptop", 60000,"assets/images/laptop.jpg"),
    new Product("Keyboard", 560, "assets/images/keyboard.jpg"),
    new Product("Mouse", 600,''),
    new Product("Monitor", 20000,''),
  ]

}
