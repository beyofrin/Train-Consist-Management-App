import java.util.LinkedHashSet;
import java.util.Set;

public class UC5PreserveInsertionOrderOfBogies {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Preserve Insertion Order of Bogies");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("Final formation order: " + trainFormation);
        System.out.println("Total unique bogies: " + trainFormation.size());
    }
}
