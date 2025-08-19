package com.tenorius.dslit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tenorius.dslit.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
