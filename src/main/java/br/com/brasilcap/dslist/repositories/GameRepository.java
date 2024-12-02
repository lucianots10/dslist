package br.com.brasilcap.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilcap.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
