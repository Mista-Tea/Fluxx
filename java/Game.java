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
public class Game {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	public final static int STANDARD_STARTING_CARD_COUNT = 3;
	protected int startingCardCount;

	protected PlayerController playerController;
	protected CardController cardController;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Game() {
		this.playerController = new PlayerController();
		this.cardController = new CardController();
		startingCardCount = STANDARD_STARTING_CARD_COUNT;

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public boolean addPlayer( String name, fluxx.player.Playable player ) {
		Player fp = new Player( name, player );
		return this.playerController.addPlayer( fp );
	}
	public boolean removePlayer( Player player ) {
		return this.playerController.removePlayer( player );
	}

	/**
	 *
	 */
	public void run() {
		dealAll();

		while ( noClearWinner() ) {
			this.cardController.setCardsDrawn( 0 );
			this.cardController.setCardsPlayed( 0 );
			this.playerController.doNextTurn();
		}
	}

	/**
	 *
	 * @param player
	 * @param numCards
	 */
	public void deal( Player player, int numCards ) {
		for ( int i = 1; i <= numCards; i++ ) {
			this.cardController.draw( player );
		}
	}

	/**
	 *
	 */
	public void dealAll() {
		for ( Player p : this.playerController.getPlayers() ) {
			deal( p, this.startingCardCount );
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