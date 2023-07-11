import { Component, OnChanges, OnDestroy, OnInit } from '@angular/core';
import { Product } from '../Product';

@Component({
  selector: 'product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit, OnChanges, OnDestroy{

  products:Product[] = [ ]; 

  constructor(){
    console.log("ProductListComponent: Constructor called ");
  }

  ngOnInit(): void {
    console.log("ProductListComponent: ngOnInit called ");
    
    this.products = [ 
      new Product("Laptop", 60000, "assets/img/laptop.jpg", "200", true, true),
      new Product("Keyboard", 600,  "assets/img/KeyB.jpg","200", false, true),
      new Product("Mouse", 108,  "assets/img/laptop.jpg","200", false, true),
      new Product("Printer", 12000.25, "assets/img/laptop.jpg","200", true, false),
    ];

  }

  ngOnChanges():void{
    console.log("ProductListComponent: ngOnChanges called ")
  }

  ngOnDestroy():void{
    console.log("ProductListComponent: ngOnDestroy called ")
  }

}
