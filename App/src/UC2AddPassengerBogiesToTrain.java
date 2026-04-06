import java.util.ArrayList;
import java.util.List;

public class UC2AddPassengerBogiesToTrain {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2: Add Passenger Bogies to Train");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removal: " + passengerBogies);

        System.out.println("Does Sleeper exist? " + passengerBogies.contains("Sleeper"));
        System.out.println("Final passenger bogie list: " + passengerBogies);
    }
}
