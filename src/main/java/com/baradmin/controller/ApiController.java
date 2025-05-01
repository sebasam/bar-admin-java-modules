package com.baradmin.controller;

import com.baradmin.model.Product;
import com.baradmin.model.Order;
import com.baradmin.service.ProductService;
import com.baradmin.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final ProductService ps;
    private final OrderService os;
    public ApiController(ProductService ps, OrderService os) {
        this.ps = ps; this.os = os;
    }
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product p) { return ps.create(p); }
    @GetMapping("/products")
    public List<Product> listProducts() { return ps.list(); }
    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order o) { return os.create(o); }
    @GetMapping("/orders")
    public List<Order> listOrders() { return os.list(); }
}
