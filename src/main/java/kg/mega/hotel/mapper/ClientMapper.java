package kg.mega.hotel.mapper;

import kg.mega.hotel.dto.ClientDTO;
import kg.mega.hotel.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {
ClientMapper INSTANCE= Mappers.getMapper(ClientMapper.class);
Client toEntity(ClientDTO clientDTO);
List<Client> toEntityList(List<ClientDTO>clientDTOS);
ClientDTO toDTO(Client client);
List<ClientDTO> toDTOList(List<ClientDTO> clientDTOS);
}
