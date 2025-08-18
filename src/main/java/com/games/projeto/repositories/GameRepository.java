package com.games.projeto.repositories;

import com.games.projeto.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> { //aqui aplicamos herança para estender a classe Game e Id.
}
