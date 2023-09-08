package kg.mega.hotel.repo;

import kg.mega.hotel.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
