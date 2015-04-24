package com.cse326.fluxx.card;

import android.media.Image;
/**
 * Created by Thomas on 4/24/2015.
 */
public class RuleCard extends FluxxCard {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public RuleCard() {
		super();
		super.setType( CARD_TYPE.RULE );
	}

	/**
	 *
	 * @param name
	 */
	public RuleCard( String name ) {
		super( name );
		super.setType( CARD_TYPE.RULE );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected RuleCard( String name, String use, String effect, Image image ) {
		super( name, use, effect, image );
		super.setType( CARD_TYPE.RULE );
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	@Override
	public void play() {

	}

	@Override
	public void discard() {

	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
