package com.capgemini.go.service;
import java.util.List;

import com.capgemini.go.entities.AddressDTO;

public interface IAddressService {

	boolean deleteAddress(AddressDTO addressDTO);
	boolean updateAddress(AddressDTO addressDTO);
	boolean addAddress(AddressDTO addressDTO);
    List<AddressDTO>viewAllAddress();
    AddressDTO findById(String addressId);
		
	
}
