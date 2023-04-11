package com.example.fartos.Clases;

public class Casilla {
    private int posX;
    private int posY;
    private int jugadors;

    public Casilla(int posX, int posY, int jugadors) {
        this.posX = posX;
        this.posY = posY;
        this.jugadors = jugadors;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getJugadors() {
        return jugadors;
    }

    public void setJugadors(int jugadors) {
        this.jugadors = jugadors;
    }
}
