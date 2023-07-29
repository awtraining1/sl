import { Component, Input } from '@angular/core';

@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  @Input("name") name:string="";

  @Input("price") price!:number;

  date_added!:string;

  constructor(){
    console.log("Inside constructor");
  }

  ngOnChanges():void{
    console.log("Inside ngOnChanges");
  }

  ngOnInit():void{
    console.log("Inside ngOnInit");
  }

  ngOnDestroy():void{
    console.log("Inside ngOnDestroy");
  }

}
