package com.capgemini.go.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.go.entities.AddressDTO;
import java.util.List;
public interface IAddressDao extends JpaRepository<AddressDTO,String> {
    
}
