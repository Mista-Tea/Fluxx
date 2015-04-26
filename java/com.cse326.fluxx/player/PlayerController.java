package fluxx.player;

import java.util.ArrayList;
/**
 * Created by Thomas on 4/24/2015.
 *
 * The player controller manages the player inputs into the game.
 * Whenever a player wants to play a card they first interact with the view and then select a card to play.
 * If any actions need more input from the player the player controller will handle those extra inputs.
 */
public class PlayerController {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected Player currentPlayer;
	protected ArrayList<Player> players;

	/* ---------------------------------------- Constructors ------------------------------------ */

	public PlayerController() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public void doPlayerTurn( Player ply ) {
		// TODO
	}

	public boolean addPlayer( Player player ) {
		return this.players.add( player );
	}

	public boolean removePlayer( Player player ) {
		return this.players.remove( player );
	}

	public ArrayList<Player> getOtherPlayers( Player player ) {
		ArrayList<Player> otherPlayers = new ArrayList<>();
		otherPlayers.addAll( this.players );
		otherPlayers.remove( player );

		return otherPlayers;
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setCurrentPlayer( Player ply ) { this.currentPlayer = ply; }
	public Player getCurrentPlayer() { return this.currentPlayer; }

	public void setPlayers( ArrayList<Player> players ) { this.players = players; }
	public ArrayList<Player> getPlayers() { return this.players; }


}
