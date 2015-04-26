package fluxx.card;

import android.media.Image;

/**
 * Created by Thomas on 4/24/2015.
 */
public abstract class FluxxCard implements Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	public enum CARD_TYPE {
		ACTION,
		GOAL,
		KEEPER,
		RULE,
	}

	protected String name;
	protected String useDescription;
	protected String effectDescription;
	protected Image image;
	protected CARD_TYPE type;
	protected CardAction play;
	protected CardAction discard;

	protected boolean discardRelated;
	protected boolean playRelated;
	protected boolean drawRelated;
	protected boolean swapRelated;
	protected boolean stealRelated;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	protected FluxxCard() {
		this( "Placeholder", "Placeholder", "Placeholder", null );
	}

	/**
	 *
	 * @param name
	 */
	protected FluxxCard( String name ) {
		this( name, "Placeholder", "Placeholder", null );
	}

	/**
	 *
	 * @param name
	 * @param use
	 * @param effect
	 * @param image
	 */
	protected FluxxCard( String name, String use, String effect, Image image ) {
		this.name = name;
		this.useDescription = use;
		this.effectDescription = effect;
		this.image = image;
	}

	/* ------------------------------------------- Methods -------------------------------------- */

	/**
	 *
	 * @throws NullCardActionException
	 */
	public void play() throws NullCardActionException {
		if ( this.play == null ) throw new NullCardActionException( "Attempt to call action on a null CardAction object!" );

		this.play.action();
	}

	/**
	 *
	 * @throws NullCardActionException
	 */
	public void discard() throws NullCardActionException {
		if ( this.discard == null ) throw new NullCardActionException( "Attempt to call action on a null CardAction object!" );

		this.discard.action();
	}

	/* ------------------------------------- Getters & Setters ---------------------------------- */

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

	/**
	 *
	 * @return
	 */
	public CardAction getPlay() {
		return play;
	}

	/**
	 *
	 * @param play
	 */
	public void setPlay( CardAction play ) {
		this.play = play;
	}

	/**
	 *
	 * @return
	 */
	public CardAction getDiscard() {
		return discard;
	}

	/**
	 *
	 * @param discard
	 */
	public void setDiscard( CardAction discard ) {
		this.discard = discard;
	}
}
