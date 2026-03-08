package com.ranjan.inventory_service.service;

import com.ranjan.inventory_service.entity.Inventory;
import com.ranjan.inventory_service.repository.InventoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class InventoryServiceImpl implements InventoryService{
    private InventoryRepository inventoryRepository;

    @Override
    public Mono<Inventory> saveInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public Flux<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Mono<Inventory> getInventoryByProductId(Long productId) {
        return inventoryRepository.findByProductId(productId);
    }

    @Override
    public Mono<Boolean> isInStock(Long productId, Long quantity) {

        return inventoryRepository.findByProductId(productId)
                .map(inventory -> inventory.getQuantity() >= quantity)
                .defaultIfEmpty(false);
    }
}
