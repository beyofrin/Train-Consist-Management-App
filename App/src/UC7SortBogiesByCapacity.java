import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7SortBogiesByCapacity {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7: Sort Bogies by Capacity");

        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Bogies sorted by capacity:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }

    private static class Bogie {
        private final String name;
        private final int capacity;

        private Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        private int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }
}
