package br.com.brasilcap.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilcap.dslist.dto.GameDTO;
import br.com.brasilcap.dslist.dto.GameListDTO;
import br.com.brasilcap.dslist.dto.GameMinDTO;
import br.com.brasilcap.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id) {
		GameListDTO resultado = gameListService.findById(id);
		return resultado;
	}

	@GetMapping
	public List<GameListDTO> findAll() {
		return gameListService.findAll();
	}

}
