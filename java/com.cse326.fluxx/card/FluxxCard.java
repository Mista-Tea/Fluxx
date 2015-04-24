	 *
package com.cse326.fluxx.card;

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

	private String name;
	private String useDescription;
	private String effectDescription;
	private Image image;
	private CARD_TYPE type;

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



	/* ------------------------------------- Getters & Setters ---------------------------------- */

	/**
	 *
	 * @return
	 */
	public Image getPicture() {
		return image;
	}

	/**
	 *
	 * @param image
	 */
	public void setPicture( Image image ) {
		this.image = image;
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
}
