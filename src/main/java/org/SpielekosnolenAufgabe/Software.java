package org.SpielekosnolenAufgabe;
/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 *
 * Software has a Name and computingUsage(Rechenverbrauch)
 */
public class Software {

    private String name;
    private double computingUsage;

    public Software(String name, double computingUsage) {
            this.name = name;
            this.computingUsage = computingUsage;

            if (computingUsage < 1.0 || computingUsage > 50.0){
                throw new IllegalArgumentException(" Value is not within the right range of 1.0 and 50.0");
            }
    }
    /**
     * WARNING: the computingUsage needs to be between 1.0 und 50.0
     */
    public double getComputingUsage() {
        return computingUsage;
    }

    public String getName() {
        return name;
    }


}
