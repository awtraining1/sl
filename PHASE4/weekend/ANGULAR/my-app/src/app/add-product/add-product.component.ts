import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Product } from '../product';

@Component({
  selector: 'add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {

  name:string = '';
  price:number=0;
  submitted:boolean = false;

  //product!:Product;

  addProductForm!: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.addProductForm = this.formBuilder.group({
      name: new FormControl('',Validators.required),
      price:new FormControl<number>(0,[Validators.required, Validators.min(1), Validators.max(100000)])
    });
  }

  get f() { return this.addProductForm.controls; }

  onSubmit():void {
    this.submitted = true;

    console.log("Form submited..");

    // stop here if form is invalid
    if (this.addProductForm.invalid) {
      return;
    };

    // If we are here, then write code below that will 
    // submitted to the Java/Node/Php Backend.
    console.log('Your product has been submitted for approval');
  }

}
