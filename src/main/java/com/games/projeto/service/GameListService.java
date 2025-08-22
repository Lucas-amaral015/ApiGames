package com.games.projeto.service;

import com.games.projeto.dto.GameDTO;
import com.games.projeto.dto.GameListDTO;
import com.games.projeto.dto.GameMinDTO;
import com.games.projeto.entities.Game;
import com.games.projeto.entities.GameList;
import com.games.projeto.repositories.GameListRepository;
import com.games.projeto.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // ou @Component declara que é um componente(DI)
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true) // aqui é boa pratica para garantir que nao tera operação de escrita.
    public List<GameListDTO> findAll(){ //aqui o findAll quer dizer busca completa.

        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
