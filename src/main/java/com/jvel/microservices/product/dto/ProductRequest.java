package com.jvel.microservices.product.dto;

public record ProductRequest(String id, String name, String description, String price) {
}
