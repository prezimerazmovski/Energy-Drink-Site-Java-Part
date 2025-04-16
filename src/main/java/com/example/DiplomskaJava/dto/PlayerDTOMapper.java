package com.example.DiplomskaJava.dto;

import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.example.DiplomskaJava.model.Player;

@Service
public class PlayerDTOMapper implements Function<Player, PlayerDTO> {

	@Override
	public PlayerDTO apply(Player player) {
		// TODO Auto-generated method stub
		return new PlayerDTO(player.getId(), player.getFirstName(), player.getLastName(), player.getEmail(),
				player.getCode());
	}

}
