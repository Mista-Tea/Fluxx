package fluxx.card;

import android.media.Image;

import fluxx.Game;
import fluxx.player.Player;

/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class Card implements Playable {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	protected String name;
	protected String useDescription;
	protected String effectDescription;
	protected Image image;
	protected CardType.CARD_TYPE type;
	protected Player player;

	protected Playable card;

	protected Game game;

	/* ---------------------------------------- Constructors ------------------------------------ */

	protected Card() {
		this( "Placeholder", "Placeholder", "Playerholder", null, null );
	}

	protected Card( String name, String use, String effect, Game game ) {
		this( name, use, effect, null, game );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected Card( String name, String use, String effect, Image image, Game game ) {
		this.name = name;
		this.useDescription = use;
		this.effectDescription = effect;
		this.image = image;
		this.game = game;
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 */
	public void play() {
		this.card.play();
	}

	/**
	 *
	 */
	public void discard() {
		this.game.getCardController().discard( this.player, this );
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
	public String getUseDescription() {
		return useDescription;
	}

	/**
	 *
	 * @param useDescription
	 */
	public void setUseDescription( String useDescription ) {
		this.useDescription = useDescription;
	}

	/**
	 *
	 * @return
	 */
	public String getEffectDescription() {
		return effectDescription;
	}

	/**
	 *
	 * @param effectDescription
	 */
	public void setEffectDescription( String effectDescription ) {
		this.effectDescription = effectDescription;
	}

	/**
	 *
	 * @return
	 */
	public CardType.CARD_TYPE getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 */
	public void setType( CardType.CARD_TYPE type ) {
		this.type = type;
	}

	/**
	 *
	 * @return
	 */
	public Image getImage() {
		return image;
	}

	/**
	 *
	 * @param image
	 */
	public void setImage( Image image ) {
		this.image = image;
	}
}
