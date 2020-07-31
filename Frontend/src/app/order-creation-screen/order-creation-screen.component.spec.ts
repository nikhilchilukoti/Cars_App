import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderCreationScreenComponent } from './order-creation-screen.component';

describe('OrderCreationScreenComponent', () => {
  let component: OrderCreationScreenComponent;
  let fixture: ComponentFixture<OrderCreationScreenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrderCreationScreenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderCreationScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
