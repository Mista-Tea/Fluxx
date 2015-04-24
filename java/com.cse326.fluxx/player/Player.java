package com.cse326.fluxx.player;

import com.cse326.fluxx.card.Card;
import com.cse326.fluxx.deck.Deck;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Player {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	private Deck hand;
	private int currentPlays;
	private int maxPlays;
	private Deck keepers;
	private Card currentCard;
	private int cardsDrew;
	private int cardsPlayed;
	private int keepersPlayed;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Player() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 * @param card
	 */
	public void playCard( Card card ) {

	}

	/**
	 *
	 * @param card
	 */
	public void selectCard( Card card ) {

	}

	/**
	 *
	 * @param card
	 */
	public void discard( Card card ) {

	}

	/**
	 *
	 */
	public void lookAtDiscardPile() {

	}

	/**
	 *
	 */
	public void lookAtKeepers() {

	}

	/**
	 *
	 */
	public void lookAtGoals() {

	}

	/**
	 *
	 */
	public void lookAtRules() {

	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	/**
	 *
	 * @return
	 */
	public Deck getHand() {
		return hand;
	}

	/**
	 *
	 * @param hand
	 */
	public void setHand( Deck hand ) {
		this.hand = hand;
	}

	/**
	 *
	 * @return
	 */
	public int getCurrentPlays() {
		return currentPlays;
	}

	/**
	 *
	 * @param currentPlays
	 */
	public void setCurrentPlays( int currentPlays ) {
		this.currentPlays = currentPlays;
	}

	/**
	 *
	 * @return
	 */
	public int getMaxPlays() {
		return maxPlays;
	}

	/**
	 *
	 * @param maxPlays
	 */
	public void setMaxPlays( int maxPlays ) {
		this.maxPlays = maxPlays;
	}

	/**
	 *
	 * @return
	 */
	public Deck getKeepers() {
		return keepers;
	}

	/**
	 *
	 * @param keepers
	 */
	public void setKeepers( Deck keepers ) {
		this.keepers = keepers;
	}

	/**
	 *
	 * @return
	 */
	public Card getCurrentCard() {
		return currentCard;
	}

	/**
	 *
	 * @param currentCard
	 */
	public void setCurrentCard( Card currentCard ) {
		this.currentCard = currentCard;
	}

	/**
	 *
	 * @return
	 */
	public int getCardsDrew() {
		return cardsDrew;
	}

	/**
	 *
	 * @param cardsDrew
	 */
	public void setCardsDrew( int cardsDrew ) {
		this.cardsDrew = cardsDrew;
	}

	/**
	 *
	 * @return
	 */
	public int getCardsPlayed() {
		return cardsPlayed;
	}

	/**
	 *
	 * @param cardsPlayed
	 */
	public void setCardsPlayed( int cardsPlayed ) {
		this.cardsPlayed = cardsPlayed;
	}

	/**
	 *
	 * @return
	 */
	public int getKeepersPlayed() {
		return keepersPlayed;
	}

	/**
	 *
	 * @param keepersPlayed
	 */
	public void setKeepersPlayed( int keepersPlayed ) {
		this.keepersPlayed = keepersPlayed;
	}
}
