package com.example.DiplomskaJava;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/players")
public class PlayerController {
	private final PlayerService playerService;

	public PlayerController(PlayerService playerService) {
		super();
		this.playerService = playerService;
	}

	@GetMapping
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}

	@PostMapping(path = "add")
	// consumes = MediaType.APPLICATION_XML_VALUE)
	public Player savePlayer(@ModelAttribute Player player) {
		return playerService.savePlayer(player);
	}

	@DeleteMapping("delete/{id}")
	public void deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);
	}
}
