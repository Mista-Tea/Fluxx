package fluxx.card.standard.v5.rule;

import fluxx.Game;
import fluxx.card.Rule;
import fluxx.card.RuleEffect;
/**
 * Created by Thomas on 4/26/2015.
 */
public class BasicPlayRule implements RuleEffect {
	
	protected Rule.RULE_TYPE ruleType = Rule.RULE_TYPE.BASIC_PLAY;

	@Override
	public void triggerRule( Game game ) {
		game.getPlayerController().choosePlayFromMainHand( game.getPlayerController().getCurrentPlayer() );
	}

}
