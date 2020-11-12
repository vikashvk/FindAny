import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerRegestrationComponent } from './customer-regestration.component';

describe('CustomerRegestrationComponent', () => {
  let component: CustomerRegestrationComponent;
  let fixture: ComponentFixture<CustomerRegestrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerRegestrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerRegestrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
