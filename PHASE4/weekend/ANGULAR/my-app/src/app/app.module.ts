import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductComponent } from './product/product.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ProductService } from './product.service';
import { ProductListV2Component } from './product-list-v2/product-list-v2.component';
import { HighLightDirective } from './high-light.directive';
import { NoSuchPageComponent } from './no-such-page-component/no-such-page-component.component';

import { Routes, RouterModule } from '@angular/router';
import { ProductListV3Component } from './product-list-v3/product-list-v3.component';

const routes :Routes = [
  {path: 'add-product', component: AddProductComponent},
  {path: 'product-list', component: ProductlistComponent },
  {path: 'product-list-v2', component: ProductListV2Component },
  {path: '**', component: NoSuchPageComponent },  //Fallback  router
  ];

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,
    ProductlistComponent,
    AddProductComponent,
    ProductListV2Component,
    HighLightDirective,
    NoSuchPageComponent,
    ProductListV3Component
  ],
  imports: [
    BrowserModule,    FormsModule,    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
