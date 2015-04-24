package com.cse326.fluxx.deck;

import com.cse326.fluxx.card.Card;
import com.cse326.fluxx.player.Player;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Deck {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	private Card[] cards;
	private Player[] canSee;
	private int size;

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

	}

	/**
	 *
	 * @param i
	 */
	public Card drawCard( int i ) {
		return null;
	}

	/**
	 *
	 * @param card
	 * @return
	 */
	public Card drawCard( Card card ) {
		return null;
	}

	/**
	 *
	 * @return
	 */
	public Card drawTopCard() {
		return null;
	}

	/**
	 *
	 * @return
	 */
	public Card drawBottomCard() {
		return null;
	}

	/**
	 *
	 * @param card
	 * @param i
	 */
	public void insertCard( Card card, int i ) {

	}

	/**
	 *
	 * @param card
	 */
	public void insertTopCard( Card card ) {

	}

	/**
	 *
	 * @param card
	 */
	public void insertBottomCard( Card card ) {

	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public Card[] getCards() {
		return cards;
	}

	public void setCards( Card[] cards ) {
		this.cards = cards;
	}

	public Player[] getCanSee() {
		return canSee;
	}

	public void setCanSee( Player[] canSee ) {
		this.canSee = canSee;
	}

	public int getSize() {
		return size;
	}

	public void setSize( int size ) {
		this.size = size;
	}
}
