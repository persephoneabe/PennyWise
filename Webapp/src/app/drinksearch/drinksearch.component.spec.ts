import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DrinksearchComponent } from './drinksearch.component';

describe('DrinksearchComponent', () => {
  let component: DrinksearchComponent;
  let fixture: ComponentFixture<DrinksearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DrinksearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DrinksearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
