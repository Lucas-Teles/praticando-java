package entities;

import entitiesEnums.Color;

import java.awt.*;

public abstract class Forma {

    private Color color;

    public Forma(){
    }

    public Forma(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
