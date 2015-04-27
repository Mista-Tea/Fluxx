package fluxx.card.standard.v5.rule;

import fluxx.Game;
import fluxx.player.Player;

/**
 * Created by Thomas on 4/26/2015.
 */
public class KeeperLimitN extends LimitKeeperRule {

	public KeeperLimitN( int maxKeepersInPlay ) {
		super( maxKeepersInPlay );
	}
	
	public void triggerRule( Game game ) {
		Player ply = game.getCurrentPlayer();

		while ( ply.getKeepers().size() > this.maxKeepersInPlay ) {
			game.getPlayerController().chooseDiscardKeeper( ply );
		}
	}

}
