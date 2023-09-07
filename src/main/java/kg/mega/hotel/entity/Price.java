package kg.mega.hotel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_price")
@Getter
@Setter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    LocalDate endDate;
    @OneToMany List <Discount> discounts;


}
