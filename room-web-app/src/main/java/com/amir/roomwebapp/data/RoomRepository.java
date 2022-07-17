package com.amir.roomwebapp.data;

import com.amir.roomwebapp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
