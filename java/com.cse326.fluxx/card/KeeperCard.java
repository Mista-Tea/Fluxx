package com.cse326.fluxx.card;

import android.media.Image;
/**
 * Created by Thomas on 4/24/2015.
 */
public class KeeperCard extends FluxxCard {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public KeeperCard() {
		super();
		super.setType( CARD_TYPE.KEEPER );
	}

	/**
	 *
	 * @param name
	 */
	public KeeperCard( String name ) {
		super( name );
		super.setType( CARD_TYPE.KEEPER );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected KeeperCard( String name, String use, String effect, Image image ) {
		super( name, use, effect, image );
		super.setType( CARD_TYPE.KEEPER );
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
