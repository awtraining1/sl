import { Component, Input } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  @Input("name") name:string="";
  @Input("price") price!:number;

  product!:Product;

  constructor(){
    console.log("Inside constructor");
  }

  ngOnChanges():void{
    console.log("Inside ngOnChanges");
  }

  ngOnInit():void{
    console.log("Inside ngOnInit");
    // Build the product by accepting the default values set by 
    // Parent component (Productlist Component). Rest go with the default values
    // as defined in the Product class constructor.
    this.product = new Product(this.name, this.price, true);
  }

  ngOnDestroy():void{
    console.log("Inside ngOnDestroy");
  }

}
