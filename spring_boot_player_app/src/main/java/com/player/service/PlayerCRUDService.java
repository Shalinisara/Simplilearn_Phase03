package com.player.service;

import com.player.model.Player;

public interface PlayerCRUDService {
	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayer(int id);
	public void deletePlayer(int id);
	
}
