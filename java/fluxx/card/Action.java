package fluxx.card;

/**
 * Created by Thomas on 4/24/2015.
 */
public class Action extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected ActionEffect effect;

	/* ---------------------------------------- Constructors ------------------------------------ */

	public Action( String name, String desc, ActionEffect effect ) {
		super( name, desc, CARD_TYPE.ACTION );
		this.effect = effect;
	}


	/* ------------------------------------------- Methods -------------------------------------- */

	public void play() {
		this.discard();
		this.effect.doEffect( game );
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
