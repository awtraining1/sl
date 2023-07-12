import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'product',
  templateUrl: './product-component.component.html',
  styleUrls: ['./product-component.component.css']
})

export class ProductComponent implements OnInit{
  /* Component Data */

  // name:string='Electronic Item';
  // price:number=0;


  product!: Product;

  constructor(private productService: ProductService) {
    console.log("ProductComponent: Constructor called ");
  }

  ngOnInit(){
    this.product= this.productService.getNewProduct();
  }


  // Behaviours
  onSave(event:any): void {
    console.log("Button clicked" + event.target.name );
  }
  
  trackMouse(event:any): void {
    console.log("Mouse moved at: " + event);
  }

  trackTextFeild(val:string): void {
    console.log("Text Input  is: " + val );
  }

}
