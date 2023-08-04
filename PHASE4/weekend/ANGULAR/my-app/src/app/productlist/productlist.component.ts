import { Component } from '@angular/core';

@Component({
  selector: 'productlist',
  templateUrl: './productlist.component.html',
  styleUrls: ['./productlist.component.css']
})
export class ProductlistComponent {

 initialPriceFromParent:number=100;

 parentFunc1(evt:any):void{
  console.log(`Got an event from the child. \n Message from the child - ${evt}`);
  }

  constructor(){
    //console.log("Inside productlist constructor");
  }

  ngOnChanges():void{
    //console.log("Inside productlist ngOnChanges");
  }

  ngOnInit():void{
    //console.log("Inside  productlist ngOnInit");
  }

  ngOnDestroy():void{
    console.log("Inside productlist ngOnDestroy");
  }

  ngAfterContentInit():void{
    //console.log("Inside productlist ngAfterContentInit");
  }

  ngAfterContentChecked():void{
    //console.log("Inside productlist ngAfterContentChecked");
  }

  ngAfterViewInit():void{
    //console.log("Inside  productlist ngAfterViewInit");
  }

  ngAfterViewChecked():void{
    //console.log("Inside ngAfterViewChecked");
  }

}
