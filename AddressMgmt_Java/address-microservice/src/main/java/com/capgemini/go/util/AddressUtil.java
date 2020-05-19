package com.capgemini.go.util;

import java.util.Map;
import com.capgemini.go.entities.AddressDTO;


public class AddressUtil {
	
public static AddressDTO convertToAddress(Map<String,Object> map) {

	        AddressDTO address=new AddressDTO();
		
	address.setAddressId((String)map.get("addressId"));
	
		address.setBuildingNo((String)map.get("buildingNo"));

			address.setCity((String)map.get("city"));

			address.setField((String)map.get("field"));

			address.setRetailerId((String)map.get("retailerId"));
			address.setState((String)map.get("state"));
			address.setZip((String)map.get("zip"));
			return address;
		}

	}


