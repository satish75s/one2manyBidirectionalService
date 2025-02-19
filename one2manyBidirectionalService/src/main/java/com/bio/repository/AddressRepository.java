package com.bio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bio.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}