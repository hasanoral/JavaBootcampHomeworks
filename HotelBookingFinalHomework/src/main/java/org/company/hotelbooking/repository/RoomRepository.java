package org.company.hotelbooking.repository;

import java.util.List;
import org.company.hotelbooking.model.entity.Room;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<Room, Long> {

    List<Room> getAllByRoomCategory(int categoryId);

}
