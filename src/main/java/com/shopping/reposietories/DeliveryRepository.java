package com.shopping.reposietories;

import com.shopping.models.Deliveries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Deliveries ,Long> {
}
