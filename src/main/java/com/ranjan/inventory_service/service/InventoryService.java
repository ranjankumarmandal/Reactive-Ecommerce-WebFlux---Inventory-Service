package com.ranjan.inventory_service.service;

import com.ranjan.inventory_service.entity.Inventory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InventoryService {
    Mono<Inventory> saveInventory(Inventory inventory);
    Flux<Inventory> getAllInventory();
    Mono<Inventory> getInventoryByProductId(Long productId);
    Mono<Boolean> isInStock(Long productId, Long quantity);
}
