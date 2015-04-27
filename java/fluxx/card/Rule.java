package fluxx.card;
/**
 * Created by Thomas on 4/24/2015.
 */
public class Rule extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected RuleEffect effect;
	
	public static enum RULE_TYPE {
		DRAW,
		PLAY,
		LIMIT_HAND,
		LIMIT_KEEPER,
		BASIC_DRAW,
		BASIC_PLAY,
	}

	protected RULE_TYPE ruleType;
	
	/* ---------------------------------------- Constructors ------------------------------------ */

	public Rule( String name, String description, RuleEffect effect, RULE_TYPE type ) {
		super( name, description, CARD_TYPE.RULE );
		this.effect = effect;
		this.ruleType = type;
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public void addRule() {
		this.game.getCardController().addRule( this );
	}

	public void play() {
		this.addRule();
	}

	public void triggerRule() {
		this.effect.triggerRule( game );
	}
	
	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public RULE_TYPE getRuleType() {
		return ruleType;
	}

	public void setRuleType( RULE_TYPE ruleType ) {
		this.ruleType = ruleType;
	}
}
