package fluxx;

import java.util.ArrayList;

import fluxx.card.Card;
import fluxx.card.CardController;
import fluxx.card.Goal;
import fluxx.player.Player;
import fluxx.player.PlayerController;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Game extends Thread {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	public final static int STANDARD_STARTING_CARD_COUNT = 3;
	protected int startingCardCount;

	protected PlayerController playerController;
	protected CardController cardController;
	
	protected boolean enableWaiting = true;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Game() {
		this.playerController = new PlayerController( this );
		this.cardController = new CardController( this );
		
		startingCardCount = STANDARD_STARTING_CARD_COUNT;

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public boolean addPlayer( String name, fluxx.player.Playable type ) {
		Player player = new Player( name, type );
		player.setGame( this );
		System.out.println( "Adding new player: " + player );
		wait( 1000 );
		return this.playerController.addPlayer( player );
	}
	public boolean removePlayer( Player player ) {
		return this.playerController.removePlayer( player );
	}

	/**
	 *
	 */
	public void run() {
		System.out.println( "\n\nRunning a new Fluxx game\n\n" +
				 " ______ _                  \n"+
				 "|  ____| |                 \n"+
				 "| |__  | |_   ___  ____  __\n"+
				 "|  __| | | | | \\ \\/ /\\ \\/ /\n"+
				 "| |    | | |_| |>  <  >  < \n"+
				 "|_|    |_|\\__,_/_/\\_\\/_/\\_\\\n\n");
		
		wait( 1000 );
		dealAll();
		wait( 1000 );
		
		do {
			this.cardController.setCardsDrawn( 0 );
			this.cardController.setCardsPlayed( 0 );
			this.playerController.doNextTurn();
		} while ( noClearWinner() );
	}

	/**
	 *
	 * @param player
	 * @param numCards
	 */
	public void deal( Player player, int numCards ) {
		for ( int i = 1; i <= numCards; i++ ) {
			this.cardController.drawTo( player, player.getMainHand(), false );
			wait( 500 );
		}
		System.out.println();
		wait( 500 );
	}

	/**
	 *
	 */
	public void dealAll() {
		System.out.println( "Dealing new players their cards ("+startingCardCount+" cards)\n" );
		wait( 1000 );
		for ( Player p : playerController.getPlayers() ) {
			System.out.println( "\tDealing " + p.getName() + "'s cards" );
			wait( 500 );
			deal( p, startingCardCount );
		}
	}

	/**
	 *
	 * @return
	 */
	public boolean noClearWinner() {
		// TODO
		return true;
	}

	public void wait( int s ) {
		if ( !enableWaiting ) { return; }
		
		try {
		    Thread.sleep( s );                 //1000 milliseconds is one second.
		} catch ( InterruptedException ex ) {
		    Thread.currentThread().interrupt();
		}
	}
	
	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setPlayerController( PlayerController playerController ) {
		this.playerController = playerController;
	}
	public PlayerController getPlayerController() {
		return this.playerController;
	}

	public void setCardController( CardController cardController ) {
		this.cardController = cardController;
	}
	public CardController getCardController() {
		return this.cardController;
	}

	public void setPlayers( ArrayList<Player> players ) {
		this.playerController.setPlayers( players );
	}
	public ArrayList<Player> getPlayers() {
		return this.playerController.getPlayers();
	}

	public void setDiscardPile( ArrayList<Card> pile ) {
		this.cardController.setDiscardPile( pile );
	}
	public ArrayList<Card> getDiscardPile() {
		return this.cardController.getDiscardPile();
	}

	public void setCurrentGoal( Goal goal ) {
		this.cardController.setCurrentGoal( goal );
	}
	public Goal getCurrentGoal() {
		return this.cardController.getCurrentGoal();
	}

	public void setCurrentPlayer( Player ply ) {
		this.playerController.setCurrentPlayer( ply );
	}
	public Player getCurrentPlayer() {
		return this.playerController.getCurrentPlayer();
	}
}