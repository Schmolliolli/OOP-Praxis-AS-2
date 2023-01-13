package org.SpielekosnolenAufgabe;

/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 * @invariant unit != null && software != null
 */
public class Benchmark {

    double result;
    ProcessingUnit unit;
    Software software;

    /**
     * The Benchmark class is responsible for performing a benchmark test on a given processing unit and software.
     * The result of the benchmark test is the performance value of the processing unit divided by the computing usage of the software.
     *
     * @param unit The processing unit to be tested in the benchmark.
     * @param software The software to be used in the benchmark test.
     *
     */
    public Benchmark(ProcessingUnit unit, Software software) {
        this.unit = unit;
        this.software = software;
    }

    public void executeBenchmark() {
        result = unit.getPerformanceValue() / software.getComputingUsage();
    }

    public double getResult() {
        return result;
    }

    public String getName() {
        return unit.getName() + ":" + software.getName();
    }
}
