package br.com.brasilcap.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilcap.dslist.dto.GameDTO;
import br.com.brasilcap.dslist.dto.GameMinDTO;
import br.com.brasilcap.dslist.entities.Game;
import br.com.brasilcap.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO resultado = gameService.findById(id);
		return resultado;
	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		return gameService.findAll();
	}

}
