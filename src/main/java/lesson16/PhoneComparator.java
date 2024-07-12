package lesson16;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone a1, Phone a2) {
        return a1.getName().toUpperCase()
                .compareTo(a2.getName().toUpperCase());
    }
}
