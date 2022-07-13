package com.flight.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entity.BookingEntity;

public interface BookingRepo extends JpaRepository<BookingEntity, Integer> {

	Optional<BookingEntity> findByMail(String mail);

	Optional<BookingEntity> findByPnr(String pnr);

	void deleteByPnr(String pnr);

}
