import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListV3Component } from './product-list-v3.component';

describe('ProductListV3Component', () => {
  let component: ProductListV3Component;
  let fixture: ComponentFixture<ProductListV3Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductListV3Component]
    });
    fixture = TestBed.createComponent(ProductListV3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
