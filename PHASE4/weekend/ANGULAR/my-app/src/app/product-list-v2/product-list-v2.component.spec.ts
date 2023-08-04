import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListV2Component } from './product-list-v2.component';

describe('ProductListV2Component', () => {
  let component: ProductListV2Component;
  let fixture: ComponentFixture<ProductListV2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductListV2Component]
    });
    fixture = TestBed.createComponent(ProductListV2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
