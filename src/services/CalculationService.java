package services;

import java.util.List;

public class CalculationService {

    public static <Generics extends Comparable<? super Generics>> Generics max(List<Generics> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        Generics max = list.get(0);
        for (Generics item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
