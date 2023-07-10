import { Component } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {

  // products:Product[] = [ ];

  products:Product[] = [ 
    new Product("Laptop", 60000),
    new Product("Keyboard", 600),
    new Product("Mouse", 108),
    new Product("Printer", 12000.25), 
  ];


}
