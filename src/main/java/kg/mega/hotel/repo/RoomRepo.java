package kg.mega.hotel.repo;

import kg.mega.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room ,Long> {
}
