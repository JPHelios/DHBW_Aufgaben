package de.dhbw.programmieren.java.exercise.documentation;

/**
 * Diese Dokumentation dient den Übungszwecken für die Programmiervorlesung an der DHBW
 *
 * @author Johannes Peters
 * @version 1.0
 * @since 1.0
 */


public class Radio {

    /**
     * Globale Definition der Variablen
     */

    boolean on;
    int volume;
    double frequenzy;

    /**
     * Hauptprogramm
     *
     * @param args Kommandozeilen-Parameter
     */

    public static void main(String[] args) {

        Radio radio = new Radio(false, 7, 93.5);
        System.out.println(radio);
        radio.turnOn();
        System.out.println(radio);
        radio.incVolume();
        radio.incVolume();
        System.out.println(radio);
        radio.incVolume();
        radio.incVolume();
        System.out.println(radio);
        radio.decVolume();
        System.out.println(radio);
        radio.setFrequency(97.8);
        System.out.println(radio);
        radio.setFrequency(112.7);
        System.out.println(radio);
        radio.turnOff();
        System.out.println(radio);
    }







    public Radio() {
        on = false;
        volume = 0;
        frequenzy = 90;
    }

    Radio(boolean on, int volume, double frequency){
        this.on = on;
        this.volume = volume;
        this.frequenzy = frequency;

    }

    void incVolume(){

        int tmp = this.volume;
        if(on){
            if(tmp < 10) {
                this.volume += 1;
            }
        }
    }

    void decVolume(){

        int tmp = volume;
        if(on){
            if(tmp > 0) {
                this.volume -= 1;
            }
        }
    }

    void turnOn(){
        this.on = true;
    }

    void turnOff(){
        this.on = false;
    }

    void setFrequency(double frequency){

        if(frequency < 85.0 & frequency > 110.0) {
            this.frequenzy = frequency;
        } else {
            this.frequenzy = 99.9;

        }
    }

    public String toString() {
        return "Radio: " + on + " Laut=" + volume + "Freq=" + frequenzy ;
    }



}
