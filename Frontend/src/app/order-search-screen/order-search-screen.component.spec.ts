import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderSearchScreenComponent } from './order-search-screen.component';

describe('OrderSearchScreenComponent', () => {
  let component: OrderSearchScreenComponent;
  let fixture: ComponentFixture<OrderSearchScreenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrderSearchScreenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderSearchScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
