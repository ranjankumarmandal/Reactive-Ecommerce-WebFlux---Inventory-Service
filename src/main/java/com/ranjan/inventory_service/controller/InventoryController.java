package com.ranjan.inventory_service.controller;

import com.ranjan.inventory_service.entity.Inventory;
import com.ranjan.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @PostMapping
    public Mono<Inventory> addInventory(@RequestBody Inventory inventory) {
        return inventoryService.saveInventory(inventory);
    }

    @GetMapping
    public Flux<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @GetMapping("/{productId}")
    public Mono<Inventory> getInventory(@PathVariable Long productId) {
        return inventoryService.getInventoryByProductId(productId);
    }

}
