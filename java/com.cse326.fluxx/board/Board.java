package com.cse326.fluxx.board;

import com.cse326.fluxx.card.Card;
import com.cse326.fluxx.card.RuleCard;
import com.cse326.fluxx.deck.Deck;
import com.cse326.fluxx.player.Player;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Board {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	private Player[] players;
	private Player[] playerOrder;
	private RuleCard[] rules;
	private Deck drawPile;
	private Deck discardPile;
	private Card[] goals;

	private int currentPlayer;

	private boolean drawRule;
	private boolean handLimitRule;
	private boolean playRule;
	private boolean keeperLimitRule;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Board() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 */
	public void startGame() {

	}

	/**
	 *
	 */
	public void playGame() {

	}

	/**
	 *
	 */
	public void victoryScreen() {

	}

	/**
	 *
	 */
	public void endGame() {

	}

	/**
	 *
	 */
	public void endPhase() {

	}

	/**
	 *
	 * @param ply
	 */
	public void startTurn( Player ply ) {

	}

	/**
	 *
	 */
	public void shuffleDiscardPileIntoDrawPile() {

	}

	/**
	 *
	 * @return
	 */
	public boolean checkWin() {
		return false;
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

	/**
	 *
	 * @return
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 *
	 * @param players
	 */
	public void setPlayers( Player[] players ) {
		this.players = players;
	}

	/**
	 *
	 * @return
	 */
	public Player[] getPlayerOrder() {
		return playerOrder;
	}

	/**
	 *
	 * @param playerOrder
	 */
	public void setPlayerOrder( Player[] playerOrder ) {
		this.playerOrder = playerOrder;
	}

	/**
	 *
	 * @return
	 */
	public RuleCard[] getRules() {
		return rules;
	}

	/**
	 *
	 * @param rules
	 */
	public void setRules( RuleCard[] rules ) {
		this.rules = rules;
	}

	/**
	 *
	 * @return
	 */
	public Deck getDrawPile() {
		return drawPile;
	}

	/**
	 *
	 * @param drawPile
	 */
	public void setDrawPile( Deck drawPile ) {
		this.drawPile = drawPile;
	}

	/**
	 *
	 * @return
	 */
	public Deck getDiscardPile() {
		return discardPile;
	}

	/**
	 *
	 * @param discardPile
	 */
	public void setDiscardPile( Deck discardPile ) {
		this.discardPile = discardPile;
	}

	/**
	 *
	 * @return
	 */
	public Card[] getGoals() {
		return goals;
	}

	/**
	 *
	 * @param goals
	 */
	public void setGoals( Card[] goals ) {
		this.goals = goals;
	}

	/**
	 *
	 * @return
	 */
	public int getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 *
	 * @param currentPlayer
	 */
	public void setCurrentPlayer( int currentPlayer ) {
		this.currentPlayer = currentPlayer;
	}

	/**
	 *
	 * @return
	 */
	public boolean isDrawRule() {
		return drawRule;
	}

	/**
	 *
	 * @param drawRule
	 */
	public void setDrawRule( boolean drawRule ) {
		this.drawRule = drawRule;
	}

	/**
	 *
	 * @return
	 */
	public boolean isHandLimitRule() {
		return handLimitRule;
	}

	/**
	 *
	 * @param handLimitRule
	 */
	public void setHandLimitRule( boolean handLimitRule ) {
		this.handLimitRule = handLimitRule;
	}

	/**
	 *
	 * @return
	 */
	public boolean isPlayRule() {
		return playRule;
	}

	/**
	 *
	 * @param playRule
	 */
	public void setPlayRule( boolean playRule ) {
		this.playRule = playRule;
	}

	/**
	 *
	 * @return
	 */
	public boolean isKeeperLimitRule() {
		return keeperLimitRule;
	}

	/**
	 *
	 * @param keeperLimitRule
	 */
	public void setKeeperLimitRule( boolean keeperLimitRule ) {
		this.keeperLimitRule = keeperLimitRule;
	}
}
