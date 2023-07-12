import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { ProductListComponent } from './product-list/product-list.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddProductComponent } from './add-product/add-product.component';
import { AddProductUsingReactiveFormComponent } from './add-product-using-reactive-form/add-product-using-reactive-form.component';
import { ProductService } from './product.service';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    ProductListComponent,
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
