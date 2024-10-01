package com.Entity;

public class Player {
private String name;
private int no;
private String team;
private int run;
private int wicket ;
public Player() {
	super();
}
public Player(String name, int no, String team, int run, int wicket) {
	super();
	this.name = name;
	this.no = no;
	this.team = team;
	this.run = run;
	this.wicket = wicket;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public int getRun() {
	return run;
}
public void setRun(int run) {
	this.run = run;
}
public int getWicket() {
	return wicket;
}
public void setWicket(int wicket) {
	this.wicket = wicket;
}
@Override
public String toString() {
	return "Player [name=" + name + ", no=" + no + ", team=" + team + ", run=" + run + ", wicket=" + wicket + "]";
}

}
