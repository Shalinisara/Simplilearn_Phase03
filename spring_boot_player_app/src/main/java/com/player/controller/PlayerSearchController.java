package com.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.player.model.Player;
import com.player.service.PlayerSearchService;

@RestController
public class PlayerSearchController {
	
	@Autowired
	private PlayerSearchService service;
	
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return service.getAllPlayers();
	}

	@GetMapping("/players/name/{name}")
	public List<Player> getPlayersByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getPlayersByName(name);
	}

	@GetMapping("/players/age/{age}")
	public List<Player> getPlayersByAge(@PathVariable int age) {
		// TODO Auto-generated method stub
		return service.getPlayersByAge(age);
	}

	@GetMapping("/players/teamName/{teamName}")
	public List<Player> getPlayersByTeamName(@PathVariable String teamName) {
		// TODO Auto-generated method stub
		return service.getPlayersByTeamname(teamName);
	}

	@GetMapping("/player/contact/{contact}")
	public Player getPlayerByContact(@PathVariable long contact) {
		// TODO Auto-generated method stub
		return service.getPlayerByContact(contact);
	}
	

}
