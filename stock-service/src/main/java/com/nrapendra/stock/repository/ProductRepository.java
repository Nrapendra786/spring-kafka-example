package com.nrapendra.stock.repository;

import org.springframework.data.repository.CrudRepository;
import com.nrapendra.stock.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
