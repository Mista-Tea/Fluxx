package fluxx.player;

import java.util.ArrayList;

import fluxx.Game;
import fluxx.card.Card;
import fluxx.card.Rule;
/**
 * Created by Thomas on 4/24/2015.
 *
 * The player controller manages the player inputs into the game.
 * Whenever a player wants to play a card they first interact with the view and then select a card to play.
 * If any actions need more input from the player the player controller will handle those extra inputs.
 */
public class PlayerController {

	protected Game game;

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected ArrayList<Player> players;
	protected Player currentPlayer;



	/* ---------------------------------------- Constructors ------------------------------------ */

	public PlayerController( Game game ) {
		this.game = game;
		this.players = new ArrayList<>();
		this.currentPlayer = null;
	}

	/* ------------------------------------------- Methods -------------------------------------- */
	public Card chooseCard( Player player, ArrayList<Card> source ) {
		return player.chooseCard( source );
	}


	public void playFromMainHand( Player player, Card card ) {
		game.getCardController().playFromMainHand( player, card );
	}
	public void playFromSubHand( Player player, Card card ) {
		game.getCardController().playFromSubHand( player, card );
	}

	
	
	public void drawToMainHand( Player player ) {
		game.getCardController().drawTo( player, player.getMainHand(), true );
	}
	
	public void drawToSubHand( Player player ) {
		game.getCardController().drawTo( player, player.getSubHand(), false );
	}
	

	
	public void discardFromMainHand( Player player, Card card ) {
		game.getCardController().discardFromMainHand( player, card );
	}
	public void discardFromSubHand( Player player, Card card ) {
		game.getCardController().discardFromSubHand( player, card );
	}

	public void discardFromKeepers( Player player, Card card ) {
		game.getCardController().discardFromKeepers( player, card );
	}



	public void choosePlayFromMainHand( Player player ) {
		playFromMainHand( player, chooseCard( player, player.getMainHand() ) );
	}

	public void choosePlayFromSubHand( Player player ) {
		playFromSubHand( player, chooseCard( player, player.getSubHand() ) );
	}



	public void chooseDiscardFromMainHand( Player player ) {
		discardFromMainHand( player, chooseCard( player, player.getMainHand() ) );
	}

	public void chooseDiscardFromSubHand( Player player ) {
		chooseCard( player, player.getSubHand() );
	}

	public void chooseDiscardKeeper( Player player ) {
		discardFromKeepers( player, chooseCard( player, player.getKeepers() ) );
	}




	public void discardEntireMainHand( Player player ) {
		ArrayList<Card> hand = player.getMainHand();
		
		for ( int i = hand.size() - 1; i >= 0; i-- ){
			discardFromMainHand( player, hand.get( i ) );
		}
	}

	public void discardEntireSubHand( Player player ) {
		ArrayList<Card> hand = player.getSubHand();
		
		for ( int i = hand.size() - 1; i >= 0; i-- ){
			discardFromSubHand( player, hand.get( i ) );
		}
	}
	
	public void addKeeper( Player player, Card card ) {
		card.getSource().remove( card );
		card.setSource( player.getKeepers() );
		player.getKeepers().add( card );
	}
	
	public void removeKeeper( Player player, Card card ) {
		discardFromKeepers( player, card );
	}


	/**
	 *
	 * @param player
	 */
	public void doPlayerTurn( Player player ) {
		System.out.println( "\t[DRAW] - " + player + " is drawing cards" );
		this.game.getCardController().triggerRule( Rule.RULE_TYPE.DRAW );
		game.wait( 1000 );
		System.out.println( "\n\t[PLAY] - " + player + " is playing cards" );
		this.game.getCardController().triggerRule( Rule.RULE_TYPE.PLAY );
		game.wait( 1000 );
		System.out.println( "\n\t[DISCARD HAND] - " + player + " is discarding cards (according to hand limit)" );
		this.game.getCardController().triggerRule( Rule.RULE_TYPE.LIMIT_HAND );
		game.wait( 1000 );
		System.out.println( "\n\t[DISCARD KEEPERS] - " + player + " is discarding cards (according to keeper limit)" );
		this.game.getCardController().triggerRule( Rule.RULE_TYPE.LIMIT_KEEPER );
		game.wait( 1000 );
	}

	/**
	 *
	 */
	public void doNextTurn() {
		this.currentPlayer = this.players.remove( 0 );
		this.players.add( this.currentPlayer );
		System.out.println( "| --------------------------------------------------------------- |" );
		System.out.println( "\nIt's Player [" + currentPlayer.getName() + "]'s turn!" );
		game.wait( 1000 );
		doPlayerTurn( this.currentPlayer );
	}

	/**
	 *
	 * @param player
	 * @return
	 */
	public boolean addPlayer( Player player ) {
		return this.players.add( player );
	}

	/**
	 *
	 * @param player
	 * @return
	 */
	public boolean removePlayer( Player player ) {
		return this.players.remove( player );
	}

	/**
	 *
	 * @param player
	 * @return
	 */
	public ArrayList<Player> getOtherPlayers( Player player ) {
		ArrayList<Player> otherPlayers = new ArrayList<>();
		otherPlayers.addAll( this.players );
		otherPlayers.remove( player );

		return otherPlayers;
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setCurrentPlayer( Player player ) {
		this.currentPlayer = player;
	}
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	public void setPlayers( ArrayList<Player> players ) {
		this.players = players;
	}
	public ArrayList<Player> getPlayers() {
		return this.players;
	}

	public Game getGame() {
		return game;
	}

	public void setGame( Game game ) {
		this.game = game;
	}
}
