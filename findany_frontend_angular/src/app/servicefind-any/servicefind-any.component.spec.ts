import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicefindAnyComponent } from './servicefind-any.component';

describe('ServicefindAnyComponent', () => {
  let component: ServicefindAnyComponent;
  let fixture: ComponentFixture<ServicefindAnyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServicefindAnyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServicefindAnyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
