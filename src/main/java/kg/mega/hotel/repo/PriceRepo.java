package kg.mega.hotel.repo;

import kg.mega.hotel.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price,Long> {
}
