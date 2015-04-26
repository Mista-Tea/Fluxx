package fluxx.card;

import android.media.Image;

import fluxx.Game;
/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Action extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	public Action() {
		super();
	}

	public Action( String name, String use, String effect, Game game ) {
		super( name, use, effect, game );
	}

	public Action( String name, String use, String effect, Image image, Game game ) {
		super( name, use, effect, image, game );
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public abstract void doAction();

	public void play() {
		this.doAction();
		this.discard();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
