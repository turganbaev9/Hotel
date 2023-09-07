package kg.mega.hotel.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;


@Data
public class OrderDTO {
    Long id;

    ClientDTO client;

    DiscountDTO discount;
    PriceDTO price;

    RoomDTO room;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate dateTimeFrom;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate dateTimeTo;
    Double priceBeforeDiscount;
    Double priceWithDiscount;
}
