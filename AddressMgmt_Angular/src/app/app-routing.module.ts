import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddAddressComponent } from './add-address/add-address.component';
import { FindAddressComponent } from './find-address/find-address.component';
import { ViewAllAddressComponent  } from './view-allAddress/view-allAddress.component';
import { UpdateAddressComponent } from './update-address/update-address.component';


const routes: Routes = [
  { path: 'add-address', component: AddAddressComponent },
  { path: 'find-address', component: FindAddressComponent },
  { path: 'update-address', component: UpdateAddressComponent },
  { path: 'view-allAddress', component: ViewAllAddressComponent  },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
