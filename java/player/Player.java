package fluxx.player;

import java.util.ArrayList;

import fluxx.card.Card;
/**
 * Created by Thomas on 4/24/2015.
 */
public interface Player {

	/* ------------------------------------ Instance Variables ---------------------------------- */


	/* ---------------------------------------- Constructors ------------------------------------ */


	/* ------------------------------------------- Methods -------------------------------------- */

	public Player choosePlayer( ArrayList<Player> players );

	public Card chooseCard( ArrayList<Card> cards );

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
