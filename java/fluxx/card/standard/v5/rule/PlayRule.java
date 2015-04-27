package fluxx.card.standard.v5.rule;

import fluxx.card.Rule;
import fluxx.card.RuleEffect;
/**
 * Created by Thomas on 4/26/2015.
 */
public abstract class PlayRule implements RuleEffect {

	protected int numToPlay;

	protected Rule.RULE_TYPE ruleType = Rule.RULE_TYPE.PLAY;

	public PlayRule() {
		this( 1 );
	}
	
	public PlayRule( int numToPlay ) {
		this.numToPlay = numToPlay;
	}
	
	public int getNumToPlay() {
		return numToPlay;
	}

	public void setNumToPlay( int numToPlay ) {
		this.numToPlay = numToPlay;
	}
}
