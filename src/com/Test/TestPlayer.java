package com.Test;

import com.Controller.ControllerPlayer;

public class TestPlayer {
	public static void main(String[] args) {

		ControllerPlayer controller = new ControllerPlayer();
		System.out.println("-----------------------------------");
		System.out.println("All Players from list are : ");
		controller.getplayercontroller();
		System.out.println("-----------------------------------");
		System.out.println("Batsman from List are : ");
		controller.getbatsmancontroller(3500);
		System.out.println("-----------------------------------");
		System.out.println("Bowlers from list are :");
		controller.getbowlercontroller(55);
		System.out.println("-----------------------------------");
		System.out.println("Player from team RCB are : ");
		controller.getteamcontroller("RCB");
		System.out.println("-----------------------------------");
		System.out.println("Allrounders Players from list are : ");
		controller.getallroundercontroller(1500, 45);
		System.out.println("-----------------------------------");
		System.out.println("Player whose jersey num is 21 are : ");
		controller.getjerseycontroller(21);
		System.out.println("-----------------------------------");
		System.out.println("Player whose name starts with M are : ");
		controller.playernamecontroller("M");
		System.out.println("-----------------------------------");
	}

}
