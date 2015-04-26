package fluxx.card;

import android.media.Image;
/**
 * Created by Thomas on 4/24/2015.
 */
public class GoalCard extends FluxxCard {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public GoalCard() {
		super();
		super.setType( CARD_TYPE.GOAL );
	}

	/**
	 *
	 * @param name
	 */
	public GoalCard( String name ) {
		super( name );
		super.setType( CARD_TYPE.GOAL );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected GoalCard( String name, String use, String effect, Image image ) {
		super( name, use, effect, image );
		super.setType( CARD_TYPE.GOAL );
	}

	/* ------------------------------------------- Methods -------------------------------------- */



	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
