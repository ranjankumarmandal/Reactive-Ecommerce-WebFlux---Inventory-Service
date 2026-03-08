package com.ranjan.inventory_service.service;

import com.ranjan.inventory_service.entity.Inventory;
import reactor.core.publisher.Mono;

public interface InventoryService {
    Mono<Inventory> saveInventory(Inventory inventory);

}
