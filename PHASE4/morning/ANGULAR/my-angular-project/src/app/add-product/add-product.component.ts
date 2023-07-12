import { Component } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

product:Product = new Product(0,'',0,'','100',true,true);


onSubmit():void{
  console.log(`Form submitted for product : ${this.product.name}, ${this.product.price}`);
}

}
