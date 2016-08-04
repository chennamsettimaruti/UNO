/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.uno;

/**
 *
 * @author Kishore
 */
public class UnoCard {
    private String color;
    private String type;
    private int cardvalue;
    private String cardImage;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the cardvalue
     */
    public int getCardvalue() {
        return cardvalue;
    }

    /**
     * @param cardvalue the cardvalue to set
     */
    public void setCardvalue(int cardvalue) {
        this.cardvalue = cardvalue;
    }

    /**
     * @return the cardImage
     */
    public String getCardImage() {
        return cardImage;
    }

    /**
     * @param cardImage the cardImage to set
     */
    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }
    
}
