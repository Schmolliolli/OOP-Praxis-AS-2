package org.SpielekosnolenAufgabe;


/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 */
/*
This class represents a ProcessingUnit it consists of:
    - a Name/title
    - and a Performance Value witch can be ranked in between 1.0 and 50.0
 */
class ProcessingUnit {

    private String name;
    private double performanceValue;

    public ProcessingUnit(String name, double performanceValue) {
        this.name = name;
        this.performanceValue = performanceValue;
    }

    public double getPerformanceValue() {
        return this.performanceValue;
    }
    public String getName() {
        return name;
    }

}
