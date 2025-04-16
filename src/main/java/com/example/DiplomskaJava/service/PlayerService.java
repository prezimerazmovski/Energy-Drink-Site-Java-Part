package com.example.DiplomskaJava.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.DiplomskaJava.dto.PlayerDTO;
import com.example.DiplomskaJava.dto.PlayerDTOMapper;
import com.example.DiplomskaJava.model.Player;
import com.example.DiplomskaJava.repo.PlayerRepository;

@Service
public class PlayerService {
	private final PlayerRepository playerRepository;
	private final PlayerDTOMapper playerDTOMapper;

	public PlayerService(PlayerRepository playerRepository) {
		super();
		this.playerRepository = playerRepository;
		this.playerDTOMapper = new PlayerDTOMapper();
	}

	public List<PlayerDTO> getAllPlayers() {
		return playerRepository.findAll().stream().map(playerDTOMapper).collect(Collectors.toList());

	}

	public Player savePlayer(Player player) {
		return playerRepository.save(player);

	}

	public void deletePlayer(Long id) {
		playerRepository.deleteById(id);
		;
	}

}

