import { Component } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product',
  templateUrl: './product-component.component.html',
  styleUrls: ['./product-component.component.css']
})

export class ProductComponent {

  // name:string='Electronic Item';
  // price:number=0;

  imageWebAddress:string = "https://images.unsplash.com/photo-1588872657578-7efd1f1555ed?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wJTIwY29tcHV0ZXJ8ZW58MHx8MHx8fDA%3D&w=1000&q=80";

  product: Product = new Product("Laptop", 1000, this.imageWebAddress, "200");

}
