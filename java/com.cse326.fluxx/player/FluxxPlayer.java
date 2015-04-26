package fluxx.player;

import java.util.ArrayList;

import fluxx.card.Card;
/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class FluxxPlayer {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected String name;
	protected ArrayList<Card> mainHand;
	protected ArrayList<Card> subHand;
	protected ArrayList<Card> keepers;

	protected Player player;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public FluxxPlayer() {
		this( "Player", null );
	}

	public FluxxPlayer( String name ) {
		this( name, null );
	}

	public FluxxPlayer( Player player ) {
		this( "Player", player );
	}

	public FluxxPlayer( String name, Player player ) {
		this.name = name;
		this.player = player;
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public Player choosePlayer( ArrayList<Player> players ) {
		// TODO
		// return this.menu.getPlayerSelection();
		//return players.get( (int) Math.random() * players.size() );
		return this.player.choosePlayer( players );
	}

	public Card chooseCard( ArrayList<Card> cards ) {
		// TODO
		// return this.menu.getCardSelection();
		//return cards.get( (int) Math.random() * cards.size() );
		return this.player.chooseCard( cards );
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
