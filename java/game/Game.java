package fluxx.game;

import fluxx.card.Card;
import fluxx.card.CardController;
import fluxx.card.FluxxCard;
import fluxx.card.GoalCard;
import fluxx.card.RuleCard;
import fluxx.player.Player;
import fluxx.player.PlayerController;

import java.util.ArrayList;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Game {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected PlayerController playerController;
	protected CardController cardController;

	protected Player currentPlayer;



	protected Player[] playerOrder;
	protected RuleCard[] rules;
	protected FluxxCard[] goals;
	protected boolean drawRule;
	protected boolean handLimitRule;
	protected boolean playRule;
	protected boolean keeperLimitRule;



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Game() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public boolean addPlayer( String name ) {
		return this.playerController.addPlayer( new Player( name ) );
	}

	public boolean removePlayer( Player player ) {
		return this.playerController.removePlayer( player );
	}

	public void doPlayerTurn( Player player ) {
		this.playerController.doPlayerTurn( player );
	}


	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setPlayers( ArrayList<Player> players ) { this.playerController.setPlayers( players ); }
	public ArrayList<Player> getPlayers() { return this.playerController.getPlayers(); }

	public void setDiscardPile( ArrayList<Card> pile ) { this.cardController.setDiscardPile( pile ); }
	public ArrayList<Card> getDiscardPile() { return this.cardController.getDiscardPile(); }

	public void setCurrentGoal( GoalCard goal ) { this.cardController.setCurrentGoal( goal ); }
	public GoalCard getCurrentGoal() { return this.cardController.getCurrentGoal(); }

	public void setCurrentPlayer( Player ply ) { this.playerController.setCurrentPlayer( ply ); }
	public Player getCurrentPlayer() { return this.playerController.getCurrentPlayer(); }
}