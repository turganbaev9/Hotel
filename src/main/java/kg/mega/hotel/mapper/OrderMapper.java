package kg.mega.hotel.mapper;

import kg.mega.hotel.dto.OrderDTO;
import kg.mega.hotel.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
OrderMapper INSTANCE =Mappers.getMapper(OrderMapper.class);
Order toEntity(OrderDTO orderDTO);
OrderDTO toDTO(Order order);
List<Order>toEntityList(List<OrderDTO>orderDTOS);
List<OrderDTO>toDTOList(List<Order>orders);
}
