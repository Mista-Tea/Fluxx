package fluxx.card;

import android.media.Image;

import fluxx.Game;
/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Rule extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	public Rule() {
		super();
	}

	public Rule( String name, String use, String effect, Game game ) {
		super( name, use, effect, game );
	}

	public Rule( String name, String use, String effect, Image image, Game game ) {
		super( name, use, effect, image, game );
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public abstract void addRule();

	public void play() {
		this.addRule();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
