package TestPackage;

import processing.core.PApplet;

public class Processing extends PApplet{
    public void settings() {
        size(700,700);
    }
    public void setup() {

    }
    public void draw() {
        ellipse(50,50,10,10);
    }
    public static void main(String[] args) {
        PApplet.main("Processing");
    }
}
