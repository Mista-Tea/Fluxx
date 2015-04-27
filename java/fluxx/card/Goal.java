package fluxx.card;

/**
 * Created by Thomas on 4/24/2015.
 */
public class Goal extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected GoalEffect effect;

	/* ---------------------------------------- Constructors ------------------------------------ */

	public Goal( String name, String description, GoalEffect effect ) {
		super( name, description, CARD_TYPE.GOAL );
		this.effect = effect;
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public void play() {
		game.getCardController().replaceGoal( this );
	}
	
	public void checkGoal() {
		this.effect.checkGoal( game );
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
