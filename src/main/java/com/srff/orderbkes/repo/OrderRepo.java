package com.srff.orderbkes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srff.orderbkes.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
