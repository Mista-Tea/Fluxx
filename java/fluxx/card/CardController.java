package fluxx.card;

import java.util.ArrayList;
import java.util.Collections;
import fluxx.Game;
import fluxx.card.standard.v5.rule.BasicDrawRule;
import fluxx.card.standard.v5.rule.BasicPlayRule;
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
/**
 * @author Thomas
 *
 */
public class CardController {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	Goal currentGoal;

	protected Rule basicDrawRule;
	protected Rule basicPlayRule;
	
	protected Rule drawRule;
	protected Rule playRule;
	protected Rule handRule;
	protected Rule keeperRule;
	
	protected Goal goal;
	protected ArrayList<Card> discardPile;
	protected ArrayList<Card> drawPile;

	protected int cardsDrawn;
	protected int cardsPlayed;

	protected Game game;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public CardController( Game game ) {
		this.game = game;
		
		discardPile = new ArrayList<>();
		drawPile = new ArrayList<>();

		basicDrawRule = new Rule( "Basic Draw Rule", "Draw 1", new BasicDrawRule(), Rule.RULE_TYPE.BASIC_DRAW );
		basicDrawRule.setGame( game );
		basicPlayRule = new Rule( "Basic Play Rule", "Play 1", new BasicPlayRule(), Rule.RULE_TYPE.BASIC_PLAY );
		basicPlayRule.setGame( game );
		
		StandardV5CardFactory.createCards( drawPile );
		Collections.shuffle( drawPile );
				
		for ( Card c : drawPile ) {
			c.setGame( game );
		}
	}


	/* ------------------------------------------- Methods -------------------------------------- */

	public void playFromMainHand( Player player, Card card ) {
		System.out.println( "\t\tPlayer " + player + " has played a card (main hand): " + card );
		game.wait( 1000 );
		card.play();
		this.addCardsPlayed( 1 );
	}

	public void playFromSubHand( Player player, Card card ) {
		System.out.println( "\t\tPlayer " + player + " has played a card (sub hand): " + card );
		game.wait( 1000 );
		card.play();
	}

	public void discardFromMainHand( Player player, Card card ) {
		discard( player, card, player.getMainHand() );
	}

	public void discardFromSubHand( Player player, Card card ) {
		discard( player, card, player.getSubHand() );
	}

	public void discardFromKeepers( Player player, Card card ) {
		discard( player, card, player.getKeepers() );
	}

	private Card draw( Player player, boolean incrementCardsDrawn ) {
		if ( drawPile.isEmpty() ) {
			drawPile.addAll( discardPile );
			Collections.shuffle( drawPile );
			discardPile.clear();
		}

		if ( incrementCardsDrawn ) {
			this.addCardsDrawn( 1 );
		}

		Card card = drawPile.remove( 0 );
		card.setPlayer( player );
		
		System.out.println( "\t\tPlayer " + player + " has drawn a card: " + card );
		game.wait( 1000 );
		return card;
	}

	public Card drawTo( Player player, ArrayList<Card> destination, boolean incrementCardsDrawn ) {
		Card card = draw( player, incrementCardsDrawn );
		destination.add( card );
		card.setSource( destination );
		return card;
	}

	/**
	 *
	 * @param player
	 * @param card
	 */
	public void discard( Player player, Card card, ArrayList<Card> source ) {
		source.remove( card );
		card.setPlayer( null );
		discard( card );
	}

	/**
	 *
	 * @param card
	 */
	public void discard( Card card ) {
		discardPile.add( card );
		card.setSource( discardPile );
	}

	/**
	 *
	 * @param rule
	 */
	public void addRule( Rule rule ) {
		switch( rule.getRuleType() ) {
			case DRAW: 			if ( drawRule != null ) discard( drawRule ); drawRule = rule; break;
			case PLAY: 			if ( playRule != null ) discard( playRule ); playRule = rule; break;
			case LIMIT_HAND: 	if ( handRule != null ) discard( handRule ); handRule = rule; break;
			case LIMIT_KEEPER: 	if ( keeperRule != null ) discard( keeperRule ); keeperRule = rule; break;
			default:
		}
		
		rule.getSource().remove( rule );
	}

	/**
	 *
	 * @param type
	 */
	public void triggerRule( Rule.RULE_TYPE type ) {
		switch( type ) {
			case DRAW:
				if ( drawRule != null ) drawRule.triggerRule();
				else 					basicDrawRule.triggerRule();
				break;
			case PLAY: 			
				if ( playRule != null ) playRule.triggerRule();
				else 					basicPlayRule.triggerRule();
				break;
			case LIMIT_HAND: 	
				if ( handRule != null ) handRule.triggerRule();
				break;
			case LIMIT_KEEPER: 	
				if ( keeperRule != null ) keeperRule.triggerRule();
				break;
			default:
		}
	}
	
	public void replaceGoal( Goal goal ) {
		if ( this.goal != null ) {
			discard( this.goal );
		}
		
		this.goal = goal;
		goal.getSource().remove( goal );
		goal.setPlayer( null );
		goal.setSource( null );
	}

	public void addCardsDrawn( int i ) {
		this.cardsDrawn += i;
	}

	public void addCardsPlayed( int i ) {
		this.cardsPlayed += i;
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

	public Game getGame() {
		return game;
	}

	public void setGame( Game game ) {
		this.game = game;
	}

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	
}
