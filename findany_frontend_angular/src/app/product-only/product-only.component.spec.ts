import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductOnlyComponent } from './product-only.component';

describe('ProductOnlyComponent', () => {
  let component: ProductOnlyComponent;
  let fixture: ComponentFixture<ProductOnlyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductOnlyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductOnlyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
