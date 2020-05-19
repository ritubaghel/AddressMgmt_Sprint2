import { Component, OnInit } from '@angular/core';
import { Address } from '../model/address';
import { AddressServices } from '../services/AddressServices';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-view-allAddress',
  templateUrl: './view-allAddress.component.html',
  styleUrls: ['./view-allAddress.component.css']
})
export class ViewAllAddressComponent implements OnInit {

  allAddress: Address[] = [];
  service: AddressServices;

  constructor(service: AddressServices) {
    this.service = service;
    this.getAllAddress();
  }

  private getAllAddress() {
    let observable: Observable<Address[]> = this.service.fetchAllAddresses();
    observable.subscribe(add => {
      this.allAddress = add;
      console.log("inside success callback =" + this.allAddress.length);
    }, err => console.log(err));
  }

  ngOnInit(): void {
  }

  removeAddress(address: Address) {
    let result: Observable<Address> = this.service.deleteAddress(address);
    result.subscribe(add => {
      this.getAllAddress();
      console.log("Record deleted successfully for addressId = " + add.addressId);
    }, err => {
      console.log("err in deleteing record=" + err);
    })
  }

  confirmDelete(addressObj) {
    var txt;
    var r = confirm("Do you really want to delete data for addressId = " + addressObj.addressId);
    if (r == true) {
      txt = "You pressed OK!";
      //delete call
      this.removeAddress(addressObj);
    } else {
      txt = "You pressed Cancel!";
    }
  }

}
  




