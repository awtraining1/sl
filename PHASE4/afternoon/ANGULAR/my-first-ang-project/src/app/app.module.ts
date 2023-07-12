import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { ProductListComponent } from './product-list/product-list.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddProductComponent } from './add-product/add-product.component';
import { AddProductUsingReactiveFormComponent } from './add-product-using-reactive-form/add-product-using-reactive-form.component';
import { ProductService } from './product.service';
import { HighlightDirective } from './highlight.directive';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    ProductListComponent,
    AddProductComponent,
    AddProductUsingReactiveFormComponent,
    HighlightDirective
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule,HttpClientModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
