package org.company.hotelbooking.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.company.hotelbooking.model.entity.Room;
import org.company.hotelbooking.model.entity.User;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookingRequest {

    private User user;
    private Room room;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;


}
