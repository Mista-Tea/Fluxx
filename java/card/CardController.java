package fluxx.card;

import java.util.ArrayList;
import java.util.Collections;

import fluxx.player.Player;
/**
 * Created by Thomas on 4/24/2015.
 *
 * The card controller handles all of the cards in the game in a list format.
 * Each list of cards can be drawn from and discarded to; this will mainly be used for drawing from the Deck and discarding to the discard pile.
 * FluxxCard lists also have a designated owner, either one of the players or the game board.
 * Each list can also be hidden, so only the owner of that list of cards is able to view the contents of the list but all players can know the size of each list.
 *
 * The card effect controller manages the effects for the cards that are played: rules, goals, actions, and keepers.
 * This controller is in charge of maintaining and enforcing the different rules that are in play, as well as checking if the current goal(s) have been met.
 * The card effect controller will also handle when a keeper is played.
 * Whenever a player plays an action the card effect controller will process the action effects and will then play them out with user input if needed.
 */
public class CardController {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	Goal currentGoal;

	ArrayList<Card> rules;
	ArrayList<Card> discardPile;
	ArrayList<Card> drawPile;

	protected int cardsDrawn;
	protected int cardsPlayed;
	protected int cardsDiscarded;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public CardController() {

	}


	/* ------------------------------------------- Methods -------------------------------------- */

	public void play( Card card ) {
		card.play();

		this.addCardsPlayed( 1 );
	}

	public Card draw( Player player ) {
		if ( this.drawPile.isEmpty() ) {
			this.drawPile.addAll( this.discardPile );
			Collections.shuffle( this.drawPile );
			this.discardPile.clear();
		}

		this.addCardsDrawn( 1 );

		return this.drawPile.remove( 0 );
	}

	public void discard( Player player, Card card ) {
		player.getMainHand().remove( card );
		card.setPlayer( null );
		this.discardPile.add( card );

		this.addCardsDiscarded( 1 );
	}

	public void addCardsDrawn( int i ) {
		this.cardsDrawn += i;
	}

	public void addCardsPlayed( int i ) {
		this.cardsPlayed += i;
	}

	public void addCardsDiscarded( int i ) {
		this.cardsDiscarded += i;
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setCurrentGoal( Goal goal ) {
		this.currentGoal = goal;
	}
	public Goal getCurrentGoal() {
		return this.currentGoal;
	}

	public void setDiscardPile( ArrayList<Card> pile ) {
		this.discardPile = pile;
	}
	public ArrayList<Card> getDiscardPile() {
		return this.discardPile;
	}

	public void setDrawPile( ArrayList<Card> pile ) {
		this.drawPile = pile;
	}
	public ArrayList<Card> getDrawPile() {
		return this.drawPile;
	}

	public int getCardsDrawn() {
		return cardsDrawn;
	}
	public void setCardsDrawn( int cardsDrawn ) {
		this.cardsDrawn = cardsDrawn;
	}

	public int getCardsPlayed() {
		return cardsPlayed;
	}
	public void setCardsPlayed( int cardsPlayed ) {
		this.cardsPlayed = cardsPlayed;
	}

	public int getCardsDiscarded() {
		return cardsDiscarded;
	}
	public void setCardsDiscarded( int cardsDiscarded ) {
		this.cardsDiscarded = cardsDiscarded;
	}
}
