import { Component } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product',
  templateUrl: './product-component.component.html',
  styleUrls: ['./product-component.component.css']
})

export class ProductComponent {
  /* Component Data */

  // name:string='Electronic Item';
  // price:number=0;


  product: Product = new Product("Laptop", 1000, "assets/img/laptop.jpg", "200", true, true );

  // Behaviours
  onSave(): void {
    console.log("Button clicked");
  }

}
