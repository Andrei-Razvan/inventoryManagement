package uk.lset.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uk.lset.inventory.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
