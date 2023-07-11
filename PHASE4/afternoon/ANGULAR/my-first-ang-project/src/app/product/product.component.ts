import { Component, OnInit, OnChanges, OnDestroy, Input  } from '@angular/core';
import { Product } from '../classes/Product';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit, OnChanges, OnDestroy {
  // name:string='HP Laptop';
  // price:number=2000;

  @Input("message") msg:string='';

  product: Product = new Product("Laptop",2000,"assets/images/laptop.jpg", true, true);

  constructor(){
    console.log("ProductComponent : constructor called")
  }

  ngOnInit(){
    console.log("ProductComponent : ngOnInit called");
    console.log(`Here is the message from parent : ${this.msg}`);
  }

  ngOnChanges(){
    console.log("ProductComponent : ngOnChanges called");
  }

  ngOnDestroy(){
    console.log("ProductComponent : ngOnDestroy called");
  }

  addLike(evt:any):void{
    console.log(`Like button clicked.! It was from button ${evt.target.name}`)
  }

  addComments(val:string):void{
    console.log(`Thank you. Got your comments - ${val}` );
  }

}
