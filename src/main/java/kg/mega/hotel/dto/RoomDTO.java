package kg.mega.hotel.dto;
import kg.mega.hotel.enums.Category;
import lombok.Data;
@Data
public class RoomDTO {

    Long id;
    Integer rooms;
    Boolean isAvailable;
    ClientDTO client;
    Category category;
}
