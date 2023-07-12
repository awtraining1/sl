import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProductUsingReactiveFormComponent } from './add-product-using-reactive-form.component';

describe('AddProductUsingReactiveFormComponent', () => {
  let component: AddProductUsingReactiveFormComponent;
  let fixture: ComponentFixture<AddProductUsingReactiveFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddProductUsingReactiveFormComponent]
    });
    fixture = TestBed.createComponent(AddProductUsingReactiveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
