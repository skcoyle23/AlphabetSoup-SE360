package com.csse360.alphabetsoup;

import com.badlogic.gdx.graphics.Texture;

/**
 * Creates the individual tiles for the 2048 game which are images getting
 * imported from the assets folder
 *
 * @author Shannon Coyle
 * @version December 6, 2021
 */

public class GameTile {

    int value; // Keeps track of the value of the tile in numbers
    Texture tileImg; // Gets the alphabet tile image

    /**
     * Constructs a basic tile
     */
    public GameTile() {
        value = 0;
    }

    public GameTile(int num) {
        value = num;
    }

    /**
     * Gets the numerical value of the tile
     *
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the tile's numerical value
     *
     * @param val - value to set tile to
     */
    public void setValue(int val) {
        this.value = val;
    }

    public void setImage() {
        if(this.getValue() == 2) {
            tileImg = new Texture("A.png");
        }
        else if(this.getValue() == 4) {
            tileImg = new Texture("B.png");
        }
        else if(this.getValue() == 8) {
            tileImg = new Texture("C.png");
        }
        else if(this.getValue() == 16) {
            tileImg = new Texture("D.png");
        }
        else if(this.getValue() == 32) {
            tileImg = new Texture("E.png");
        }
        else if(this.getValue() == 64) {
            tileImg = new Texture("F.png");
        }
        else if(this.getValue() == 128) {
            tileImg = new Texture("G.png");
        }
        else if(this.getValue() == 256) {
            tileImg = new Texture("H.png");
        }
        else if(this.getValue() == 512) {
            tileImg = new Texture("I.png");
        }
        else if(this.getValue() == 1024) {
            tileImg = new Texture("J.png");
        }
        else if(this.getValue() == 2048) {
            tileImg = new Texture("K.png");
        }
        else if(this.getValue() == 4096) {
            tileImg = new Texture("L.png");
        }
        else if(this.getValue() == 8192) {
            tileImg = new Texture("M.png");
        }
        else if(this.getValue() == 16384) {
            tileImg = new Texture("N.png");
        }
        else if(this.getValue() == 32768) {
            tileImg = new Texture("O.png");
        }
        else if(this.getValue() == 65536) {
            tileImg = new Texture("P.png");
        }
        else if(this.getValue() == 131072) {
            tileImg = new Texture("Q.png");
        }
        else if(this.getValue() == 262144) {
            tileImg = new Texture("R.png");
        }
        else if(this.getValue() == 524288) {
            tileImg = new Texture("S.png");
        }
        else if(this.getValue() == 1048576) {
            tileImg = new Texture("T.png");
        }
        else if(this.getValue() == 2097152) {
            tileImg = new Texture("U.png");
        }
        else if(this.getValue() == 4194304) {
            tileImg = new Texture("V.png");
        }
        else if(this.getValue() == 8388608) {
            tileImg = new Texture("W.png");
        }
        else if(this.getValue() == 16777216) {
            tileImg = new Texture("X.png");
        }
        else if(this.getValue() == 33554432) {
            tileImg = new Texture("Y.png");
        }
        else if(this.getValue() == 67108864) {
            tileImg = new Texture("Z.png");
        }
    }

    /**
     * Gets the image based on the setImage()
     * @return tile
     */
    public Texture getTileImg() {
        this.setImage();
        return tileImg;
    }
}
