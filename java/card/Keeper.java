package fluxx.card;

import android.media.Image;

import fluxx.card.Card;
import fluxx.card.CardType;
/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Keeper extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */



	/* ------------------------------------------- Methods -------------------------------------- */

	public abstract void addKeeper();

	public void play() {
		this.addKeeper();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
