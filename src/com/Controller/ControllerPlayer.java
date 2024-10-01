package com.Controller;

import java.util.List;

import com.Entity.Player;
import com.Service.ServicePlayer;

public class ControllerPlayer {
	ServicePlayer service = null;

	public List<Player> getplayercontroller() {
		service = new ServicePlayer();
		List<Player> db = service.getallplayerservice();
		return db;

	}

	public List<Player> getbatsmancontroller(int r) {
		service = new ServicePlayer();
		List<Player> db = service.getallbatsmanservice(r);
		return db;

	}

	public List<Player> getteamcontroller(String s) {
		service = new ServicePlayer();
		List<Player> db = service.getplayerteamservice(s);
		return db;

	}

	public List<Player> getbowlercontroller(int i) {
		service = new ServicePlayer();
		List<Player> db = service.getallbowlerservice(i);
		return db;

	}

	public List<Player> getallroundercontroller(int r, int w) {
		service = new ServicePlayer();
		List<Player> db = service.getallallroundersservice(r, w);
		return db;
	}

	public List<Player> getjerseycontroller(int j) {
		service = new ServicePlayer();
		List<Player> db = service.playerjerseyservice(j);
		return db;

	}

	public List<Player> playernamecontroller(String s) {
		service = new ServicePlayer();
		List<Player> db = service.playerbynameservice(s);
		return db;

	}
}
