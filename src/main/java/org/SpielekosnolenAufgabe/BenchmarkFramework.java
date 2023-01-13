package org.SpielekosnolenAufgabe;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * A benchmarkFramework sets an amount of software per "benchmark" and outputs the results to the console
 *
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
  */

public class BenchmarkFramework {

        private ProcessingUnit studyStationUnit;
        private ProcessingUnit learnDitchUnit;

        private Software software;

    public void runBenchmark() {
        ProcessingUnit studyStationUnit = new ProcessingUnit("StudyStationUnit", 25.0);
        ProcessingUnit learnDitchUnit = new ProcessingUnit("LearnDitchUnit", 30.0);



      /*  List<Benchmark> benchmarks = new ArrayList<>();
        benchmarks.add(new Benchmark(studyStationUnit, new Software("T1", 13.0)));
        benchmarks.add(new Benchmark(studyStationUnit, new Software("T2", 24.0)));
        benchmarks.add(new Benchmark(studyStationUnit, new Software("T3", 30.0)));
        benchmarks.add(new Benchmark(learnDitchUnit, new Software("T1", 13.0)));
        benchmarks.add(new Benchmark(learnDitchUnit, new Software("T2", 24.0)));
        benchmarks.add(new Benchmark(learnDitchUnit, new Software("T3", 30.0)));



          for(Benchmark benchmark: benchmarks) {
            benchmark.executeBenchmark();
            System.out.println(benchmark.getName() + " - " + benchmark.getResult());
        }
        */

        List<CheatBenchmark> benchmarks = new ArrayList<>();
        benchmarks.add(new CheatBenchmark(studyStationUnit, new Software("T1", 13.0)));
        benchmarks.add(new CheatBenchmark(studyStationUnit, new Software("T2", 24.0)));
        benchmarks.add(new CheatBenchmark(studyStationUnit, new Software("T3", 30.0)));
        benchmarks.add(new CheatBenchmark(learnDitchUnit, new Software("T1", 13.0)));
        benchmarks.add(new CheatBenchmark(learnDitchUnit, new Software("T2", 24.0)));
        benchmarks.add(new CheatBenchmark(learnDitchUnit, new Software("T3", 30.0)));


        for(CheatBenchmark benchmark: benchmarks) {
            benchmark.executeBenchmark();
            System.out.println(benchmark.getName() + " - " + benchmark.getResult());
        }

    }
    }





