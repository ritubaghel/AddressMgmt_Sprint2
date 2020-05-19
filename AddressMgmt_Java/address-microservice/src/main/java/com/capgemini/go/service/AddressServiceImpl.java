package com.capgemini.go.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.go.dao.IAddressDao;
import com.capgemini.go.entities.AddressDTO;
import com.capgemini.go.exceptions.AddressNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional
public class AddressServiceImpl implements IAddressService {

	private IAddressDao addressDao;

	public IAddressDao getAddressDao() {
		return addressDao;
	}

	@Autowired
	public void setAddressDao(IAddressDao dao) {
		this.addressDao = dao;
	}

	public String generatedId() {
		StringBuilder id = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int number = random.nextInt(9);
			id.append(number);
		}
		return id.toString();
	}

	@Override
	public boolean addAddress(AddressDTO addressDTO) {
		String id = generatedId();
		addressDTO.setAddressId(id);
		addressDTO = addressDao.save(addressDTO);
		return true;
	}

	@Override
	public boolean updateAddress(AddressDTO addressDTO) {
		boolean exists = addressDao.existsById(addressDTO.getAddressId());
		if (exists) {
			addressDTO = addressDao.save(addressDTO);
			return true;
		}
		throw new AddressNotFoundException("Address not found for id=" + addressDTO.getAddressId());
	}

	@Override
	public List<AddressDTO> viewAllAddress() {
		List<AddressDTO> list = addressDao.findAll();
		return list;
	}

	@Override
	public boolean deleteAddress(AddressDTO addressDTO) {
		addressDao.delete(addressDTO);
		return true;
	}

	@Override
	public AddressDTO findById(String addressId) {
		Optional<AddressDTO> optional = addressDao.findById(addressId);
		if (optional.isPresent()) {
			AddressDTO address = optional.get();
			return address;
		}
		throw new AddressNotFoundException("Address not found for id=" + addressId);
	}

}
