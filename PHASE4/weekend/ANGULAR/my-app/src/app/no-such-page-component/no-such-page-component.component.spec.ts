import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NoSuchPageComponentComponent } from './no-such-page-component.component';

describe('NoSuchPageComponentComponent', () => {
  let component: NoSuchPageComponentComponent;
  let fixture: ComponentFixture<NoSuchPageComponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NoSuchPageComponentComponent]
    });
    fixture = TestBed.createComponent(NoSuchPageComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
