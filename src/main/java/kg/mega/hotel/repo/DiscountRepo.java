package kg.mega.hotel.repo;

import kg.mega.hotel.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount,Long> {
}
