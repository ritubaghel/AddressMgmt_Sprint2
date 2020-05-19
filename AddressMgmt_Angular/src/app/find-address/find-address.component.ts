import { Component, OnInit } from '@angular/core';
import { Address } from '../model/address';
import { AddressServices } from '../services/AddressServices';
import { Observable } from 'rxjs';
import { format } from 'util';

@Component({
  selector: 'app-view-address',
  templateUrl: './find-address.component.html',
  styleUrls: ['./find-address.component.css']
})
export class FindAddressComponent implements OnInit {
  service: AddressServices;
  constructor(service: AddressServices) {
    this.service = service;
  }

  foundAddress: Address = null;
  foundStatus = null;
  errMsg = null;

  ngOnInit(): void {
  }
  findAddressById(form: any) {
    let details = form.value;
    let addressId = details.addressId;
    let fetchedAddress: Observable<Address> = this.service.findAddressById(addressId);
    fetchedAddress.subscribe(
      add => {
        this.foundAddress = add;
        this.foundStatus = "found";
      },
      err => {
        this.foundStatus = "notfound";
        this.errMsg = err.error;
        console.log("error while fetching");
      }
    );
  }

}
