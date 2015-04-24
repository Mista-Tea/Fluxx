package com.cse326.fluxx.card;

import android.media.Image;
/**
 * Created by Thomas on 4/24/2015.
 */
public class ActionCard extends FluxxCard {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public ActionCard() {
		super();
		super.setType( CARD_TYPE.ACTION );
	}

	/**
	 *
	 * @param name
	 */
	public ActionCard( String name ) {
		super( name );
		super.setType( CARD_TYPE.ACTION );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected ActionCard( String name, String use, String effect, Image image ) {
		super( name, use, effect, image );
		super.setType( CARD_TYPE.ACTION );
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
