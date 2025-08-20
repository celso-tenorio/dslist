package com.tenorius.dslit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tenorius.dslit.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
