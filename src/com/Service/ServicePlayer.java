package com.Service;

import java.util.List;

import com.Dao.PlayerDao;
import com.Entity.Player;

public class ServicePlayer {
	PlayerDao dao = null;

	public List<Player> getallplayerservice() {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			System.out.println(player);
		}
		return db;
	}

	public List<Player> getallbatsmanservice(int r) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getRun() > r) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getallbowlerservice(int r) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getWicket() > r) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getallallroundersservice(int r, int w) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getRun() > r && player.getWicket() > w) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> getplayerteamservice(String s) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {

			if (player.getTeam() == s) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> playerjerseyservice(int j) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			if (player.getNo() == j) {
				System.out.println(player);
			}
		}
		return db;
	}

	public List<Player> playerbynameservice(String s) {

		dao = new PlayerDao();
		List<Player> db = dao.getallplayers();
		for (Player player : db) {
			if (player.getName().startsWith(s)) {
				System.out.println(player);
			}
		}
		return db;
	}
}
