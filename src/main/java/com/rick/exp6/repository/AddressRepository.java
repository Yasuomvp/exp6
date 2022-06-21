package com.rick.exp6.repository;

import com.rick.exp6.dox.Address;
import com.rick.exp6.dto.UserAndAddress;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {

    List<Address> getAddressesByUserId(Long id);

    @Query("select address.id as address_id,user.id as user_id,address.create_time,address.update_time,address.detail,user.name from address left join user on address.user_id = user.id where address.id = :address_id;")
    List<UserAndAddress> getUserAndAddressByAddressId(@Param("address_id") Long id);

    @Query("select user.id user_id,name,user.create_time,user.update_time,address.detail,address.id address_id from user left join address on user.id = address.user_id where user.id = :user_id")
    List<UserAndAddress> getUserAndAddressByUserId(@Param("user_id") Long id);
}
