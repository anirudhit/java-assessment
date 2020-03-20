import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { AccountService } from '../../../services/account.service';

@Component({
  selector: 'app-new-account-modal',
  templateUrl: './new-account-modal.component.html',
  styleUrls: ['./new-account-modal.component.css']
})
export class NewAccountModalComponent implements OnInit {

  displayModal: boolean;
  @Output() accountAdded = new EventEmitter();
  // newAccountForm = new FormGroup({
  //   id: new FormControl(3),
  //   accountNumber: new FormControl('32102805050'),
  //   accountType: new FormControl('SAVINGS'),
  //   userId: new FormControl(1)
  // });

  constructor(private fb: FormBuilder, private accountService: AccountService) { }

  newAccountForm = this.fb.group({
    id: ['', [Validators.required]],
    accountNumber: ['', [Validators.required]],
    accountType: ['', [Validators.required]],
    userId: ['', [Validators.required]]
  });

  get id() {
    return this.newAccountForm.get('id');
  }

  get accountNumber() {
    return this.newAccountForm.get('accountNumber');
  }

  get accountType() {
    return this.newAccountForm.get('accountType');
  }

  get userId() {
    return this.newAccountForm.get('userId');
  }

  ngOnInit() {
  }

  showModalDialog() {
    this.displayModal = true;
  }

  saveAccount() {
    if (this.newAccountForm.invalid) {
      this.newAccountForm.get('id')['touched'] = true;
      this.newAccountForm.get('accountNumber')['touched'] = true;
      this.newAccountForm.get('accountType')['touched'] = true;
      this.newAccountForm.get('userId')['touched'] = true;
    } else {
      this.accountService.addAccount(this.newAccountForm.value)
        .subscribe(data => {
          this.accountAdded.emit();
          this.newAccountForm.reset();
          this.displayModal = false;
        });
    }
  }

  cancelAccount() {
    this.newAccountForm.reset();
    this.displayModal = false;
  }

}
