package fluxx.card;

import android.media.Image;

import fluxx.card.Card;
/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Goal extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */



	/* ------------------------------------------- Methods -------------------------------------- */

	public abstract void addGoal();

	public void play() {
		this.addGoal();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
