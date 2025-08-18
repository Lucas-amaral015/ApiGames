package com.games.projeto.service;

import com.games.projeto.entities.Game;
import com.games.projeto.entities.GameDTO;
import com.games.projeto.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // ou @Component declara que é um componente(DI)
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll(){ //aqui o findAll quer dizer busca completa.

        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }

}
