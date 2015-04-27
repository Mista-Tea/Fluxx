package fluxx.card;

//import android.media.Image;

import java.util.ArrayList;

import fluxx.Game;
import fluxx.player.Player;

/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Card implements Playable {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	public static enum CARD_TYPE {
		ACTION,
		GOAL,
		KEEPER,
		RULE,
	}

	protected String name;
	protected String description;
	//protected Image image;
	protected CARD_TYPE type;
	protected Player player;
	protected ArrayList<Card> source;

	protected Playable card;

	protected Game game;

	/* ---------------------------------------- Constructors ------------------------------------ */

	protected Card( String name, String description, CARD_TYPE type ) {
		//this( name, use, effect, null );
		this.name = name;
		this.description = description;
		this.type = type;
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	/*protected Card( String name, String use, String effect, Image image ) {
		this.name = name;
		this.useDescription = use;
		this.effectDescription = effect;
		this.image = image;
	}*/

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 */
	public void play() {
		System.out.println( "Player [" + this.player.getName() + "] is playing: " + this.card );
		this.card.play();
	}

	/**
	 *
	 */
	public void discard() {
		this.game.getCardController().discard( this.player, this, this.source );
	}

	@Override
	public String toString() {
		return String.format( "%s [%s]", name, type ); 
	}
	
	/* ------------------------------------- Getters & Setters ---------------------------------- */

	public void setGame( Game game ) {
		this.game = game;
	}
	public Game getGame() {
		return this.game;
	}

	public void setPlayer( Player player ) {
		this.player = player;
	}
	public Player getPlayer() {
		return this.player;
	}

	/**
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 *
	 * @param name
	 */
	public void setName( String name ) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 *
	 * @param useDescription
	 */
	public void setDescription( String description ) {
		this.description = description;
	}
	
	/**
	 *
	 * @return
	 */
	public CARD_TYPE getType() {
		return type;
	}
	/**
	 *
	 * @param type
	 */
	public void setType( CARD_TYPE type ) {
		this.type = type;
	}

	/**
	 *
	 * @return
	 */
	/*public Image getImage() {
		return image;
	}*/
	/**
	 *
	 */
	/*public void setImage( Image image ) {
		this.image = image;
	}*/

	public ArrayList<Card> getSource() {
		return source;
	}

	public void setSource( ArrayList<Card> source ) {
		this.source = source;
	}
}
