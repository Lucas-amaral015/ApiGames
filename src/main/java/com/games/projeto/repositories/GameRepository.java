package com.games.projeto.repositories;

import com.games.projeto.entities.Game;
import com.games.projeto.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> { //aqui aplicamos herança para estender a classe Game e Id.

    //consulta sql coloca aqui
    //

// nativeQuery é para poder funcionar a consulta sql e não JPQL.
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId); //consulta personalizada, colocando de parametro oque quero para consulta.
}
