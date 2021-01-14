package ru.sibsutis.barter.crud;

import ru.sibsutis.barter.databases.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
