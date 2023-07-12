import { Component, OnInit, OnChanges, OnDestroy, Input, Output, EventEmitter  } from '@angular/core';
import { Product } from '../classes/Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit, OnChanges, OnDestroy {
  // name:string='HP Laptop';
  // price:number=2000;

  productCounter:number=0;

  @Input("message") msg:string='';

  @Input("productNumber") pNumber:string='1';

  @Output() helloChange = new EventEmitter<string>();

  constructor(private productService: ProductService) {
  }

  f1():void{
    this.helloChange.emit(`Hi Parent, I got ${this.productCounter++} views`);    
  }

  product!: Product;  

  ngOnInit(){
    console.log("ProductComponent : ngOnInit called");
    console.log(`Here is the message from parent : ${this.msg}`);
    
    // this.product = this.productService.getProduct();
    
    this.productService.getProductFromBackend(this.pNumber).subscribe(
      (response) => { this.product = response; },
      (error) => { console.log(error); });
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
