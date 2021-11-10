package org.company.hotelbooking.model.mapper;


import org.company.hotelbooking.model.dto.BookingDto;
import org.company.hotelbooking.model.entity.Booking;
import org.company.hotelbooking.model.request.BookingRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel="spring")
public interface BookingMapper {
    BookingMapper BOOKING_MAPPER= Mappers.getMapper(BookingMapper.class);

    BookingDto toBookingDto(Booking Booking);
    Booking toDtoBooking(BookingDto BookingDto);
    List<BookingDto> toBookingDtoList(List<Booking> Bookings);

    Booking createBooking(BookingRequest request);

    void updateBooking(@MappingTarget Booking Booking, BookingRequest request);
}
