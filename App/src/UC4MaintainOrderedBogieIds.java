import java.util.LinkedList;

public class UC4MaintainOrderedBogieIds {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: Maintain Ordered Bogie IDs");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final ordered train consist: " + trainConsist);
    }
}
