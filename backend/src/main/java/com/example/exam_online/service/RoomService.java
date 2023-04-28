package com.example.exam_online.service;

import com.example.exam_online.entity.Room;
import com.example.exam_online.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService extends AbstractEntityAuditService<Room> implements IRoomService<Room>{
	@Autowired
	RoomRepository roomRepository;
	
	@Override
	public Room getRoomById (Long roomId) {
		System.out.println(roomId);
		System.out.println(roomRepository.findById(roomId));
		return roomRepository.findById(roomId).get();
	}
	
	protected JpaRepository<Room, Long> getEntityRepository () {
		return roomRepository;
	}
}
