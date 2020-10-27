package com.example.eventAPP.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.eventAPP.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {

	Evento findByCodigo(long codigo);
	
}
