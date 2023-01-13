package org.SpielekosnolenAufgabe;

/**
 * @author Alessia Sedelnikov, Alen Taitakiew
 * @version 13.01.2022
 */
/*
The class Producer represents the Producer  of the Gamconsole
It could contain properties like the Name and further Contactinformation
 */
public class Producer {
        private String name;

        public Producer(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

}
