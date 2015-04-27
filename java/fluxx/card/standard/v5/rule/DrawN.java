package fluxx.card.standard.v5.rule;

import fluxx.Game;
import fluxx.player.Player;
/**
 * Created by Thomas on 4/26/2015.
 */
public class DrawN extends DrawRule {

	public DrawN( int i ) {
		super( i );
	}
	
	@Override
	public void triggerRule( Game game ) {
		Player ply = game.getCurrentPlayer();

		while ( game.getCardController().getCardsDrawn() < this.numToDraw ) {
			game.getPlayerController().drawToMainHand( ply );
		}
	}

}
