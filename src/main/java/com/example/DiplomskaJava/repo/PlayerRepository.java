package com.example.DiplomskaJava.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DiplomskaJava.dto.PlayerDTO;
import com.example.DiplomskaJava.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

	PlayerDTO save(PlayerDTO playerDTO);

}
