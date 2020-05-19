import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddAddressComponent } from './add-address/add-address.component';
import { FindAddressComponent } from './find-address/find-address.component';
import { UpdateAddressComponent } from './update-address/update-address.component';
import { ViewAllAddressComponent } from './view-allAddress/view-allAddress.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule } from '@angular/common/http';
import { AddressServices } from './services/AddressServices';

@NgModule({
  declarations: [
    AppComponent,
    AddAddressComponent,
    FindAddressComponent,
    UpdateAddressComponent,
    ViewAllAddressComponent 
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [AddressServices],
  bootstrap: [AppComponent]
})
export class AppModule { }
