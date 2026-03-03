package com.ranjan.inventory_service.repository;

import com.ranjan.inventory_service.entity.Inventory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface InventoryRepository extends ReactiveCrudRepository<Inventory, Long> {
}