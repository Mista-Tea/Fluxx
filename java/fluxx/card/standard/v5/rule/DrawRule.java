package fluxx.card.standard.v5.rule;

import fluxx.card.Rule;
import fluxx.card.RuleEffect;
/**
 * Created by Thomas on 4/26/2015.
 */
public abstract class DrawRule implements RuleEffect {

	protected int numToDraw;

	protected Rule.RULE_TYPE ruleType = Rule.RULE_TYPE.DRAW;

	public DrawRule( int numToDraw ) {
		this.numToDraw = numToDraw;
	}
	
	public int getNumToDraw() {
		return numToDraw;
	}

	public void setNumToDraw( int numToDraw ) {
		this.numToDraw = numToDraw;
	}
}
