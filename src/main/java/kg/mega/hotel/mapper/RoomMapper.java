package kg.mega.hotel.mapper;

import kg.mega.hotel.dto.RoomDTO;
import kg.mega.hotel.entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoomMapper {
RoomMapper INSTANCE= Mappers.getMapper(RoomMapper.class);
Room toEntity(RoomDTO roomDTO);
RoomDTO toDTO(Room room);
List<Room>toEntity(List<RoomDTO> roomDTOS);
List<RoomDTO>toDTOList(List<Room> rooms);
}
