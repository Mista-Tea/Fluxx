package fluxx.card.standard.v5.rule;

import fluxx.card.Rule;
import fluxx.card.RuleEffect;
/**
 * Created by Thomas on 4/26/2015.
 */
public abstract class LimitKeeperRule implements RuleEffect {

	protected int maxKeepersInPlay;

	protected Rule.RULE_TYPE ruleType = Rule.RULE_TYPE.LIMIT_KEEPER;
	
	public LimitKeeperRule( int maxKeepersInPlay ) {
		this.maxKeepersInPlay = maxKeepersInPlay;
	}
	
	public int getMaxKeepersInPlay() {
		return maxKeepersInPlay;
	}

	public void setMaxKeepersInPlay( int maxKeepersInPlay ) {
		this.maxKeepersInPlay = maxKeepersInPlay;
	}
}
