import { Component } from '@angular/core';
import { Product } from '../classes/Product';

@Component({
  selector: 'add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  product!:Product;

  OnSubmit():void{
    console.log(`Form submitted with values ${this.product.name} , ${this.product.price} `)
  }

}
