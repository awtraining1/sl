import { Component } from '@angular/core';
import { Product } from '../classes/Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  product:Product = new Product('',0,'',true,true);

  constructor(private productService: ProductService) {
  }

  OnSubmit():void{
    console.log(`Form submitted with values ${this.product.name} , ${this.product.price} `);
    this.productService.addProductToBackEnd(this.product.name,this.product.price).subscribe(
      (response) => { this.product = response; },
      (error) => { console.log(error); });
  }

}
