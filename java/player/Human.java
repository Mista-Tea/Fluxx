package fluxx.player;

import java.util.ArrayList;

import fluxx.card.Card;

/**
 * Created by Thomas on 4/25/2015.
 */
public class Human implements Playable {

	public Player choosePlayer( ArrayList<Player> players ) {
		// TODO
		// return this.menu.getPlayerSelection();
		return players.get( (int) Math.random() * players.size() );
	}

	public Card chooseCard( ArrayList<Card> cards ) {
		// TODO
		// return this.menu.getCardSelection();
		return cards.get( (int) Math.random() * cards.size() );
	}

}
