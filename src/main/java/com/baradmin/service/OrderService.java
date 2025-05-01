package com.baradmin.service;

import com.baradmin.model.Order;
import com.baradmin.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;
    public OrderService(OrderRepository repo) { this.repo = repo; }
    public Order create(Order o) { return repo.save(o); }
    public List<Order> list() { return repo.findAll(); }
}
