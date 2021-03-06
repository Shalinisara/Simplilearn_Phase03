
package com.player.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerCRUDService;


@Service
public class PlayerCRUDServiceImpl implements PlayerCRUDService {
	
	@Autowired
	private PlayerRepository playerrepo;
	
	@Override
	public Player createPlayer(Player player) {
		// TODO Auto-generated method stub
		System.out.println("in service impl");
		return playerrepo.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return playerrepo.save(player);
	}

	@Override
	public Player getPlayer(@PathVariable int id) {
		// TODO Auto-generated method stub
		return playerrepo.findById(id).get();
	}

	@Override
	public void deletePlayer(@ PathVariable int id) {
		// TODO Auto-generated method stub
		playerrepo.deleteById(id);
		
	}

}
