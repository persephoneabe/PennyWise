import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserdrinksComponent } from './userdrinks.component';

describe('UserdrinksComponent', () => {
  let component: UserdrinksComponent;
  let fixture: ComponentFixture<UserdrinksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserdrinksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserdrinksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
