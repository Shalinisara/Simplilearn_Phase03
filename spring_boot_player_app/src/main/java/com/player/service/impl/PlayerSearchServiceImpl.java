package com.player.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService {

	@Autowired
	private PlayerRepository playerrepo;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerrepo.findAll();
	}

	@Override
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return playerrepo.findByName(name);
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return playerrepo.findByAge(age);
	}

	@Override
	public List<Player> getPlayersByTeamname(String teamname) {
		// TODO Auto-generated method stub
		return playerrepo.findByTeamName(teamname);
	}

	@Override
	public Player getPlayerByContact(long contact) {
		// TODO Auto-generated method stub
		return playerrepo.findByContact(contact);
		
	}

}
