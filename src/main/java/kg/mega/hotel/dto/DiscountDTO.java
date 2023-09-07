package kg.mega.hotel.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DiscountDTO {
    Long id;
    String nameDisc;
    Double amount;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate endDate;
    Integer countDays;


    RoomDTO room;
}
