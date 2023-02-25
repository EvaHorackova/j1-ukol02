package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

import static java.awt.Color.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        zofka.setLocation(300.0, 100.0);
        NakresliKolo(5, magenta);
        zofka.setLocation(290.0, 135.0);
        zofka.turnLeft(90);
        NakresliRovnostrannyTrojuhlenik(95, magenta);

        zofka.setLocation(1000, 100.0);
        NakresliKolo(5, blue);
        zofka.setLocation(1000, 220.0);
        NakresliKolo(7, blue);
        zofka.setLocation(1000, 385.0);
        NakresliKolo(10, blue);
        zofka.setLocation(890, 280.0);
        NakresliKolo(2, blue);
        zofka.setLocation(1105, 280.0);
        NakresliKolo(2, blue);

        zofka.setLocation(600, 300.0);
        NakresliObdelnik(150, 200, green);
        zofka.turnRight(90);
        zofka.setLocation(450, 500);
        NakresliObdelnik(150, 250, green);
        zofka.setLocation(600, 500.0);
        NakresliKolo(6.6, green);
        zofka.setLocation(400, 535.0);
        NakresliKolo(3, green);
        zofka.setLocation(300, 535.0);
        NakresliKolo(3, green);
        zofka.setLocation(200, 535.0);
        NakresliRovnostrannyTrojuhlenik(120, green);
    }

    public void NakresliRovnostrannyTrojuhlenik(double stranaA, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(120);
        }
    }

    public void NakresliKolo(double strana, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 72; i++) {
            zofka.move(strana);
            zofka.turnLeft(5);
        }
    }

    public void NakresliCtvrec(double stranaA, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(90);
        }
    }

    public void NakresliObdelnik(double stranaA, double stranaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(90);
            zofka.move(stranaB);
            zofka.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}

