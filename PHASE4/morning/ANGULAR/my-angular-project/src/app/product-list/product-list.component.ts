import { Component, OnChanges, OnDestroy, OnInit } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit, OnChanges, OnDestroy{

  products:Product[] = [ ]; 
  imageWebAddress:string = "https://images.unsplash.com/photo-1588872657578-7efd1f1555ed?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wJTIwY29tcHV0ZXJ8ZW58MHx8MHx8fDA%3D&w=1000&q=80";
 

  constructor(){
    console.log("ProductListComponent: Constructor called ");
  }

  ngOnInit(): void {
    console.log("ProductListComponent: ngOnInit called ");
    
    this.products = [ 
      new Product("Laptop", 60000, this.imageWebAddress, "200"),
      new Product("Keyboard", 600,  this.imageWebAddress,"200"),
      new Product("Mouse", 108,  this.imageWebAddress,"200"),
      new Product("Printer", 12000.25,  this.imageWebAddress,"200"),
    ];

  }

  ngOnChanges():void{
    console.log("ProductListComponent: ngOnChanges called ")
  }

  ngOnDestroy():void{
    console.log("ProductListComponent: ngOnDestroy called ")
  }

}
