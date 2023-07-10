import { Component } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product',
  templateUrl: './product-component.component.html',
  styleUrls: ['./product-component.component.css']
})

export class ProductComponent{

  // name:string='Electronic Item';
  // price:number=0;

  product:Product = new Product();

}
