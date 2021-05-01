package com.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.model.Player;
import com.player.service.PlayerCRUDService;

@RestController
public class PlayerCRUDController {
	
	 
	@Autowired
	
	private PlayerCRUDService playercrudservice;
	
	@PostMapping("/player")
	public Player createPlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		System.out.println("In controller");
		Gson gson = new GsonBuilderUtils().setPrettyPrinting().create(); // pretty print       
		 String prettyJson = gson.toJson(player); 
		 System.out.println(prettyJson);
		return playercrudservice.createPlayer(player);
	}

	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		// TODO Auto-generated method stub
		return playercrudservice.updatePlayer(player);
	}

	@GetMapping("/player/{id}")
	public Player getPlayer(@PathVariable int id) {
		// TODO Auto-generated method stub
		return playercrudservice.getPlayer(id);
	}

	@DeleteMapping("/player/{id}")
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		playercrudservice.deletePlayer(id);
	}

}