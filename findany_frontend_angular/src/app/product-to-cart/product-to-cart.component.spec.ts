import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductToCartComponent } from './product-to-cart.component';

describe('ProductToCartComponent', () => {
  let component: ProductToCartComponent;
  let fixture: ComponentFixture<ProductToCartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductToCartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductToCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
