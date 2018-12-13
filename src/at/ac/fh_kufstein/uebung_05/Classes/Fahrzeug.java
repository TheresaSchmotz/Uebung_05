package at.ac.fh_kufstein.uebung_05.Classes;

import javax.swing.*;

public class Fahrzeug {

    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    void starten()
    {
    gestartet = true;
    }

    void stoppen ()
    {
        gestartet = false;
    }


    void beschleunigen(short geschwindigkeit)
    {
        if(gestartet == true)
        {
            if (this.geschwindigkeit + geschwindigkeit<=250)
            {
                this.geschwindigkeit= (short) (this.geschwindigkeit + geschwindigkeit);
            }
        }
    }


    void bremsen(short geschwindigkeit)
    {
        if(gestartet==true)
        {
            if (this.geschwindigkeit - geschwindigkeit >=0)
            {
                this.geschwindigkeit= (short) (this.geschwindigkeit - geschwindigkeit);
            }
        }
    }


}
