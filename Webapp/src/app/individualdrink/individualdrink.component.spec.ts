import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IndividualdrinkComponent } from './individualdrink.component';

describe('IndividualdrinkComponent', () => {
  let component: IndividualdrinkComponent;
  let fixture: ComponentFixture<IndividualdrinkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IndividualdrinkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IndividualdrinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
