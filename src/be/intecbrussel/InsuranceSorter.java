package be.intecbrussel;

import java.util.Comparator;


    public class InsuranceSorter implements Comparator<Patient> {
        @Override
        public int compare(Patient o1, Patient o2) {
            return Boolean.compare(o1.isEnsured(), o2.isEnsured());
        }
    }

