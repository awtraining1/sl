import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProductComponent } from './product-component/product-component.component';
import { ProductListComponent } from './product-list/product-list.component';
import { SizerComponent } from './sizer/sizer.component';
import { AddProductComponent } from './add-product/add-product.component';
import { AddProductUsingReactiveFormComponent } from './add-product-using-reactive-form/add-product-using-reactive-form.component';

import { ProductService } from './product.service';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    ProductListComponent,
    SizerComponent,
    AddProductComponent,
    AddProductUsingReactiveFormComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
