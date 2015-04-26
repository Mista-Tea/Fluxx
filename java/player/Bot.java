package fluxx.player;

import java.util.ArrayList;

import fluxx.card.Card;

/**
 * Created by Thomas on 4/25/2015.
 */
public class Bot implements Playable {

	public Player choosePlayer( ArrayList<Player> players ) {
		return players.get( (int) Math.random() * players.size() );
	}

	public Card chooseCard( ArrayList<Card> cards ) {
		return cards.get( (int) Math.random() * cards.size() );
	}

}
