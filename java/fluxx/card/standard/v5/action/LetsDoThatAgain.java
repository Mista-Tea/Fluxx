package fluxx.card.standard.v5.action;

import fluxx.Game;
import fluxx.card.ActionEffect;
import fluxx.player.Player;

/**
 * Created by Thomas on 4/25/2015.
 */
public class LetsDoThatAgain implements ActionEffect {

	
	/**
	 *
	 */
	public void doEffect( Game game ) {
		Player ply = game.getCurrentPlayer();
		int numCardsInHand = ply.mainHandSize();


		game.getPlayerController().discardEntireMainHand( ply );

		for ( int i = 0; i < numCardsInHand; i++ ) {
			game.getCardController().drawTo( ply, ply.getMainHand(), false );
		}
	}
}
