package kg.mega.hotel.repo;

import kg.mega.hotel.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order , Long> {
}
