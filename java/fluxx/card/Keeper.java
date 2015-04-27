package fluxx.card;

/**
 * Created by Thomas on 4/24/2015.
 */
public class Keeper extends Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */
	
	public Keeper( String name, String description ) {
		super( name, description, CARD_TYPE.KEEPER );
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	public void addKeeper() {
		game.getPlayerController().addKeeper( game.getCurrentPlayer(), this );
	}

	public void play() {
		this.addKeeper();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
