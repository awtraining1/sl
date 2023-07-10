import { Component } from '@angular/core';

@Component({
  selector: 'product',
  templateUrl: './product-component.component.html',
  styleUrls: ['./product-component.component.css']
})

export class ProductComponent{

  name:string='Electronic Item';

  price:number=0;

}
