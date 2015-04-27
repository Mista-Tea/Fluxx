package fluxx.card.standard.v5.rule;

import fluxx.Game;
import fluxx.player.Player;
/**
 * Created by Thomas on 4/26/2015.
 */
public class PlayN extends PlayRule {

	public PlayN( int i ) {
		super( i );
	}
	
	public void triggerRule( Game game ) {
		Player ply = game.getCurrentPlayer();

		while ( game.getCardController().getCardsPlayed() < this.numToPlay && ply.getMainHand().size() > 0 ) {
			game.getPlayerController().choosePlayFromMainHand( ply );
		}
	}
}
