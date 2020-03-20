import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewAccountModalComponent } from './new-account-modal.component';

describe('NewAccountModalComponent', () => {
  let component: NewAccountModalComponent;
  let fixture: ComponentFixture<NewAccountModalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewAccountModalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewAccountModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
