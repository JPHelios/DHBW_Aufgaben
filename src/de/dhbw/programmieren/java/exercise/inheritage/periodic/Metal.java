package de.dhbw.programmieren.java.exercise.inheritage.periodic;

public class Metal extends Element{

    public boolean isMetaliod() {
        return metaliod;
    }

    public double getConductivity() {
        return conductivity;
    }

    boolean metaliod;
    double conductivity;

    public Metal(String name, String symbol, int ordinal, char shell, int phase, boolean main, boolean metaloid, double conductivity){
        super(name, symbol, ordinal, shell, phase, main);

        this.metaliod = metaloid;
        this.conductivity = conductivity;


    }


    @Override
    public String toString(){

        char sigma = 236;
        String phaseString = "";

        int phase = getPhase();
        if (phase == 1){
            phaseString = "fest";
        } else if (phase == 2){
            phaseString = "flüssig";
        } else {
            phaseString = "gasförmig";
        }

        return this.getName() + "(" + this.getSymbol() + "," + this.getOrdinal() + ") Schale: " + this.getShell() +
                ", " + phaseString + ", Gruppe: " + (this.isMain() ? "Hauptgruppe" : "Nebengruppe") + ", "+ (metaliod ? "Halbleiter, " : "") + sigma + ": " + this.conductivity;

    }
}
