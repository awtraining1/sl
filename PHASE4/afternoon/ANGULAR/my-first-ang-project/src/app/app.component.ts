import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Title } from '@angular/platform-browser';
import { Product } from './classes/Product';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  noOfProductViews:number=0;
  today = new Date();

  myProduct:Product = new Product('asas',100,'asasa'); 

  parentFunc1(evt:any):void{
    console.log(`Got an event from the child ${evt}`);
    this.noOfProductViews=evt;
  }

}
