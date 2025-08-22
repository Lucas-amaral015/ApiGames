package com.games.projeto.controller;


import com.games.projeto.entities.GameDTO;
import com.games.projeto.entities.GameMinDTO;
import com.games.projeto.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}") //configurando que terá um parametro para o id.
    public GameDTO findById(@PathVariable Long id){ // configurando argumento para casar com o postman da requisição
        GameDTO result = gameService.findByid(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
