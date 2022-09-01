package com.komal.task.Repository;

import org.springframework.data.repository.CrudRepository;

import com.komal.task.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>  {

}
