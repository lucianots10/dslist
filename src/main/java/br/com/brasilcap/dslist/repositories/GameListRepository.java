package br.com.brasilcap.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilcap.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
