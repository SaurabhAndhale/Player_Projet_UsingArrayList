package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Player;

public class PlayerDao {
	

		Player player = null;

		public List<Player> getallplayers() {

			List<Player> ipllist = new ArrayList<Player>();

			List<Player> csklist = new ArrayList<>();
			csklist.add(new Player("M.Dhoni", 7,"CSK", 5545, 2));
			csklist.add(new Player("R.Gaikwad", 21,"CSK", 2755, 1));
			csklist.add(new Player("R.Jadeja", 99,"CSK", 2100, 3));

			List<Player> milist = new ArrayList<>();

			milist.add(new Player("R.Sharma", 45,"MI", 6231, 11));
			milist.add(new Player("H.Pandya", 21,"MI" ,3231, 59));
			milist.add(new Player("J.Bumrah", 90, "MI",231, 118));

			List<Player> rcblist = new ArrayList<>();
			rcblist.add(new Player("V.Kohli", 18, "RCB", 8988, 2));
			rcblist.add(new Player("G.Maxwell", 33, "RCB", 2388, 47));
			rcblist.add(new Player("M.Siraj", 21, "RCB" ,188, 60));

			ipllist.addAll(csklist);
			ipllist.addAll(milist);
			ipllist.addAll(rcblist);

			return ipllist;

		}
	
}
