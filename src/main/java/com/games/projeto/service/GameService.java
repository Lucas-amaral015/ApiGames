package com.games.projeto.service;

import com.games.projeto.entities.Game;
import com.games.projeto.entities.GameDTO;
import com.games.projeto.entities.GameMinDTO;
import com.games.projeto.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // ou @Component declara que é um componente(DI)
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) // aqui é boa pratica para garantir que nao tera operação de escrita.
    public GameDTO findByid(Long id){ // especifiquei o ID
        Game result = gameRepository.findById(id).get();// recebe um id e retorna um objeto.
        GameDTO dto = new GameDTO(result);
        return dto;  // aqui eu busco o resultado do game e retorno um dto.
    }

    @Transactional(readOnly = true) // aqui é boa pratica para garantir que nao tera operação de escrita.
    public List<GameMinDTO> findAll(){ //aqui o findAll quer dizer busca completa.

        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

}
