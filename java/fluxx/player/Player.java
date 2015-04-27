package fluxx.player;

import java.util.ArrayList;

import fluxx.Game;
import fluxx.card.Card;

/**
 * Created by Thomas on 4/24/2015.
 */
public class Player {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected String name;
	protected ArrayList<Card> mainHand;
	protected ArrayList<Card> subHand;
	protected ArrayList<Card> keepers;

	protected Playable player;

	protected Game game; 
	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Player() {
		this( "Player", null );
	}

	public Player( String name ) {
		this( name, null );
	}

	public Player( Playable player ) {
		this( "Player", player );
	}

	public Player( String name, Playable player ) {
		this.name = name;
		this.player = player;
		
		mainHand = new ArrayList<>();
		subHand = new ArrayList<>();
		keepers = new ArrayList<>();
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public Player choosePlayer( ArrayList<Player> players ) {
		// TODO
		// return this.menu.getPlayerSelection();
		Player player = this.player.choosePlayer( players );
		System.out.println( "\t\tPlayer " + this + " has selected Player [" + player.getName() + "]" );
		game.wait( 1000 );
		return player;
	}

	public Card chooseCard( ArrayList<Card> cards ) {
		// TODO
		// return this.menu.getCardSelection();
		Card card = this.player.chooseCard( cards ); 
		System.out.println( "\t\tPlayer " + this + " has selected a card: " + card );
		game.wait( 1000 );
		return card;
	}
	
	public int mainHandSize() {
		return mainHand.size();
	}

	public int subHandSize() {
		return subHand.size();
	}

	public int numKeepers() {
		return keepers.size();
	}
	
	public String toString() {
		return String.format( "%s [%s]", name, player );
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}

	public ArrayList<Card> getMainHand() {
		return mainHand;
	}
	public void setMainHand( ArrayList<Card> mainHand ) {
		this.mainHand = mainHand;
	}

	public ArrayList<Card> getSubHand() {
		return subHand;
	}
	public void setSubHand( ArrayList<Card> subHand ) {
		this.subHand = subHand;
	}

	public ArrayList<Card> getKeepers() {
		return keepers;
	}
	public void setKeepers( ArrayList<Card> keepers ) {
		this.keepers = keepers;
	}

	public Playable getPlayer() {
		return player;
	}
	public void setPlayer( Playable player ) {
		this.player = player;
	}
	
	public Game getGame() {
		return game;
	}
	public void setGame( Game game ) {
		this.game = game;
	}
}
