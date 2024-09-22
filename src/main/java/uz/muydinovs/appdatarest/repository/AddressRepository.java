package uz.muydinovs.appdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.muydinovs.appdatarest.entity.Address;
import uz.muydinovs.appdatarest.projection.CustomAddress;

@RepositoryRestResource(path = "address",excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {

    //sort qilish uchun //api/address/search/byName
    @RestResource(path = "byName")
    Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);

}
