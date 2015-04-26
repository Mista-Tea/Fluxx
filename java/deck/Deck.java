package fluxx.deck;

import fluxx.card.Card;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Deck {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected ArrayList<Card> cards;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Deck() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 */
	public void shuffle() {
		Collections.shuffle( this.cards );
	}

	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

	public Card drawTopCard() {
		return this.cards.remove( 0 );
	}

	public Card drawBottomCard() {
		return this.cards.remove( this.cards.size() - 1 );
	}

	public boolean addCard( Card card ) {
		if ( this.cards.contains( card ) ) { return false; }

		return this.cards.add( card );
	}

	public boolean addCard( int i, Card card ) {
		if ( this.cards.contains( card ) ) { return false; }

		this.cards.add( i, card );

		return true;
	}

	public boolean removeCard( Card card ) {
		return this.cards.remove( card );
	}

	public Card removeCard( int i ) {
		return this.cards.remove( i );
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setCards( ArrayList<Card> cards ) {
		this.cards = cards;
	}
	public ArrayList<Card> getCards() {
		return cards;
	}

	public int getSize() {
		return this.cards.size();
	}
}
