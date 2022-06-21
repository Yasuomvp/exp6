package com.rick.exp6;

import com.rick.exp6.repository.AddressRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Exp6ApplicationTests {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void test1(){
        System.out.println(addressRepository.getAddressesByUserId(1L));
    }

    @Test
    void test2(){
        System.out.println(addressRepository.getUserAndAddressByAddressId(5L));
    }

    @Test
    void test3(){
        System.out.println(addressRepository.getUserAndAddressByUserId(1L));
    }
}
