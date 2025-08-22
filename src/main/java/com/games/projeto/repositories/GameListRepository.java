package com.games.projeto.repositories;

import com.games.projeto.entities.Game;
import com.games.projeto.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> { //aqui aplicamos herança para estender a classe Game e Id.
}
