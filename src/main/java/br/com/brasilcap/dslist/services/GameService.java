package br.com.brasilcap.dslist.services;

import java.util.ArrayList;

// // // // // // // import org.springframework.stereotype.Component;
// // // // // // // @Component

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brasilcap.dslist.dto.GameDTO;
import br.com.brasilcap.dslist.dto.GameMinDTO;
import br.com.brasilcap.dslist.entities.Game;
import br.com.brasilcap.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game umGame = gameRepository.findById(id).get();
		return new GameDTO(umGame);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {

		List<Game> result = gameRepository.findAll();

		List<GameMinDTO> retorno = result.stream().map(umGame -> new GameMinDTO(umGame)).toList();

/*
		List<GameMinDTO> retorno = new ArrayList<GameMinDTO>();

		for (Game game : result) {
			retorno.add(new GameMinDTO(game));
		}
*/

		return retorno;

	}
	
}
