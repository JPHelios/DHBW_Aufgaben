package de.dhbw.programmieren.java.exercise.inheritage.periodic;

public class Element {

    private String name, symbol;
    private int ordinal;
    private char shell;
    private int phase; // Solid = 1, liquid = 2, gas = 3
    private boolean main;



    public Element(String name, String symbol, int ordinal, char shell, int phase, boolean main){

        this.name = name;
        this.symbol = symbol;
        this.ordinal = ordinal;
        this.shell = shell;
        this.phase = phase; // Solid = 1, liquid = 2, gas = 3
        this.main = main;


    }

    public String toString(){
        return this.name + "(" + this.symbol + "," + this.ordinal + " Schale: " + this.shell +
                ", " + phase + ", Gruppe: " + (this.main ? "Hauptgruppe)" : "Nebengruppe)");
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Element){
            Element e = (Element) o;
            return this.ordinal == e.ordinal;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public char getShell() {
        return shell;
    }

    public void setShell(char shell) {
        this.shell = shell;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }
}
