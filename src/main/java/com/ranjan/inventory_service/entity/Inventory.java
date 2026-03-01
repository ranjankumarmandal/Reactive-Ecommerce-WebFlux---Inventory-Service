package com.ranjan.inventory_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("inventory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
}
