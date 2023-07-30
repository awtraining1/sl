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
  @Input("isSpecial") isSpecial!:boolean;

  product!:Product;

  likeCounter:number=0;

  like(evt:any, val:number):void{
    this.likeCounter =this.likeCounter+ val;
    console.log(`I am being liked ${this.likeCounter} times`);
    console.log(`Event Details :  ${evt.target.type}  ${evt.target.name}`);
  }

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
    this.product = new Product(this.name, this.price, this.isSpecial);
  }

  ngOnDestroy():void{
    console.log("Inside ngOnDestroy");
  }

}
