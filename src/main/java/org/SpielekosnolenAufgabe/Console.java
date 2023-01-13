package org.SpielekosnolenAufgabe;
/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 *
 *  The class "Console" contains a versionNumber, a producer, a processingUnit, some sort of Software, performanceValue and computingUsage
 *
 */
public class Console {
        private Producer producer;
        private String versionNumber;
        private ProcessingUnit processingUnit;
        private Software software;
        private double performanceValue;
        private double computingUsage;


        /**
         * This constructor sorts as a manual to create Console objects
         */
        public Console(Producer producer, String versionNumber, ProcessingUnit processingUnit, Software software) {
                this.producer = producer;
                this.versionNumber = versionNumber;
                this.processingUnit = processingUnit;
                this.software = software;
        }

        /**
        * The Following code consist of get and set functions
         *      each returning the needed value/Object
         */
        public String getVersionNumber() {
                return versionNumber;
        }

        public void setVersionNumber(String versionNumber) {
                this.versionNumber = versionNumber;
        }

        public ProcessingUnit getProcessingUnit() {
                return processingUnit;
        }

        public void setProcessingUnit(ProcessingUnit processingUnit) {
                this.processingUnit = processingUnit;
        }

        public Software getSoftware() {
                return software;
        }

        public void setSoftware(Software software) {
                this.software = software;
        }

        public Producer getProducer() {
                return producer;
        }

        public void setProducer(Producer producer) {
                this.producer = producer;
        }


        public double getPerformanceValue() {
                return performanceValue;
        }

        public void setPerformanceValue(double performanceValue) {
                this.performanceValue = performanceValue;
        }

        public double getComputingUsage() {
                return computingUsage;
        }

        public void setComputingUsage(double computingUsage) {
                this.computingUsage = computingUsage;
        }
}
