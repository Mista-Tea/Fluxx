package fluxx.card.standard.v5.rule;

import fluxx.card.Rule;
import fluxx.card.RuleEffect;
/**
 * Created by Thomas on 4/26/2015.
 */
public abstract class LimitHandRule implements RuleEffect {

	protected int maxCardsInHand;

	protected Rule.RULE_TYPE ruleType = Rule.RULE_TYPE.LIMIT_HAND;
	
	public LimitHandRule( int maxCardsInHand ) {
		this.maxCardsInHand = maxCardsInHand;
	}
	
	public int getMaxCardsInHand() {
		return maxCardsInHand;
	}

	public void setMaxCardsInHand( int maxCardsInHand ) {
		this.maxCardsInHand = maxCardsInHand;
	}
}
