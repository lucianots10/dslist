package br.com.brasilcap.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brasilcap.dslist.dto.GameListDTO;
import br.com.brasilcap.dslist.entities.GameList;
import br.com.brasilcap.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {

		GameList umaListaGame = gameListRepository.findById(id).get();

		return new GameListDTO(umaListaGame);

	}

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {

		List<GameList> result = gameListRepository.findAll();

		List<GameListDTO> retorno = result.stream().map(umGame -> new GameListDTO(umGame)).toList();

		return retorno;

	}
	
}
