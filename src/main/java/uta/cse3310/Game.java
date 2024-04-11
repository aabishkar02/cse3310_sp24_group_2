package uta.cse3310;

import java.util.ArrayList;
import java.util.UUID;

import uta.cse3310.*;


public class Game{
	
	public String gameId;
	public boolean joinable;
	public Grid grid;
	public ArrayList<Player> players = new ArrayList<Player>();
	public Player[] leaderboard;
	public ChatBox chatBox;
	public GameClock gameClock;
	
	public Game(Player player){
		this.gameId = generateUniqueID();
		// assign color
		player.color = "red";
		players.add(player);
	}

	public void startGame(){
		
	}
	
	public static String generateUniqueID() {
   	 return UUID.randomUUID().toString();
  	}
	
	public void addPlayer(Player player){
		players.add(player);
		// assign color
		switch (players.size()) {
            case 2:
              player.color = "blue";
              break;
          
            case 3:
              player.color = "pink";
              break;
            
            case 4:
              player.color = "green";
              break;
        }
		System.out.println("added player");
		return;
	}
	
	public void removePlayer (Player player){
		players.remove(player);
		System.out.println("remove player");
		return;
	}
	
	public void endGame(){
	
	}
	
	public void updateLeaderboard(){

	}

	public void updateAllTimeLeaderboard(){

	}
	
	public Player removePlayer(){
		return null;
	}
	
}
