import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductComponentComponent } from './product-component.component';

describe('ProductComponentComponent', () => {
  let component: ProductComponentComponent;
  let fixture: ComponentFixture<ProductComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProductComponentComponent]
    });
    fixture = TestBed.createComponent(ProductComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
