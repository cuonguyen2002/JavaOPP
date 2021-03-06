package lesson29.Ex1.Comparator;

import lesson29.Ex1.Animal;

import java.util.Comparator;

public class SortByHeightDown implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return -1;
        } else if (o1.getHeight() == o2.getHeight()){
            return 0;
        } else {
            return 1;
        }
    }
}
