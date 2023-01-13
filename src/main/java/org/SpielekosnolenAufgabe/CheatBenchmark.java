package org.SpielekosnolenAufgabe;

/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 *
 * This class is used to Cheat!
 * Specifically to manipulate the Result of the Benchmark results of the Console named: "Ninadanolo"
 * The Result of Ninadanolo needs to be 30% higher than the original result
 */
public class CheatBenchmark extends Benchmark {

    public CheatBenchmark(ProcessingUnit unit, Software software) {
        super(unit, software);
    }

    public void executeBenchmark() {
        // with equals we make sure the "Nindandolo" Producer is the needed one
        if (unit.getName().equals("Nindandolo")) {
            // increase the result by 30%
            result = (unit.getPerformanceValue() / software.getComputingUsage()) * 1.3;
        } else {
            result = unit.getPerformanceValue() / software.getComputingUsage();
        }
    }

}