package com.example.DiplomskaJava;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	private final PlayerRepository playerRepository;

	public PlayerService(PlayerRepository playerRepository) {
		super();
		this.playerRepository = playerRepository;
	}

	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	public Player savePlayer(Player player) {
		return playerRepository.save(player);
	}

	public void deletePlayer(Long id) {
		playerRepository.deleteById(id);
		;
	}

}

