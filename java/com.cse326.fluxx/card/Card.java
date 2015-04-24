package com.cse326.fluxx.card;

import android.media.Image;

/**
 * Created by Thomas on 4/24/2015.
 */
public class Card {

	/* ------------------------------------ Instance Variables ---------------------------------- */

	private Image picture;
	private String name;
	private String useDescription;
	private String effectDescription;
	private int type;

	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 */
	public Card() {

	}

	/* ------------------------------------------- Methods -------------------------------------- */



	/* ------------------------------------- Getters & Setters ---------------------------------- */

	/**
	 *
	 * @return
	 */
	public Image getPicture() {
		return picture;
	}

	/**
	 *
	 * @param picture
	 */
	public void setPicture( Image picture ) {
		this.picture = picture;
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
	public int getType() {
		return type;
	}

	/**
	 *
	 * @param type
	 */
	public void setType( int type ) {
		this.type = type;
	}
}
