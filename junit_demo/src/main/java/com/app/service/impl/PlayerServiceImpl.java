package com.app.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.app.model.Player;
import com.app.service.PlayerService;

public class PlayerServiceImpl implements PlayerService {
	
	public static List<Player> playerlist;

	public Player getPlayerById(int id) {
		Player player=null;
		try {
			player=playerlist.stream().findFirst().filter(p->p.getId()==id).get();
		}catch(NoSuchElementException e) {}
		return player;
		
	}

	public List<Player> getPlayersByAge(int age) {
		return playerlist.stream().filter(p->p.getAge()==age).collect(Collectors.toList());
		
	}

}
