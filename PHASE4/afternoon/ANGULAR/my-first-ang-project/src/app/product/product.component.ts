import { Component, OnInit, OnChanges, OnDestroy  } from '@angular/core';
import { Product } from '../classes/Product';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit, OnChanges, OnDestroy {
  // name:string='HP Laptop';
  // price:number=2000;

  product: Product = new Product("Laptop",2000,"assets/images/laptop.jpg", true, true);

  constructor(){
    console.log("ProductComponent : constructor called")
  }

  ngOnInit(){
    console.log("ProductComponent : ngOnInit called")
  }

  ngOnChanges(){
    console.log("ProductComponent : ngOnChanges called")
  }

  ngOnDestroy(){
    console.log("ProductComponent : ngOnDestroy called");
  }

  addLike():void{
    console.log("clicked the like button! ")
  }

}
