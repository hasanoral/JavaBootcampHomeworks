package org.company.hotelbooking.model.dto;


import java.util.List;
import lombok.*;
import org.company.hotelbooking.model.entity.Option;
import org.company.hotelbooking.model.entity.Room;
import org.company.hotelbooking.model.entity.User;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

    private User user;
    private Room room;
    private String dateIn;
    private String dateOut;
    private List<Option> options;

}
