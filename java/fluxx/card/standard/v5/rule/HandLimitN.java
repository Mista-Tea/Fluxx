package fluxx.card.standard.v5.rule;

import fluxx.Game;
import fluxx.player.Player;
/**
 * Created by Thomas on 4/26/2015.
 */
public class HandLimitN extends LimitHandRule {

	public HandLimitN(int maxCardsInHand) {
		super( maxCardsInHand );
	}

	@Override
	public void triggerRule( Game game ) {
		Player ply = game.getCurrentPlayer();

		while ( ply.getMainHand().size() > this.maxCardsInHand ) {
			game.getPlayerController().chooseDiscardFromMainHand( ply );
		}
	}

}
