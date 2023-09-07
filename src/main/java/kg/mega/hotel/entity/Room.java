package kg.mega.hotel.entity;

import jakarta.persistence.*;
import kg.mega.hotel.enums.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Entity
@Table(name = "tb_room")
    @Getter
    @Setter
    @RequiredArgsConstructor
@AllArgsConstructor

    @FieldDefaults(level = AccessLevel.PRIVATE)
public class Room {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
    Integer rooms;
    Boolean isAvailable;
@OneToMany
        List<Client> clients;
Category category;
}
