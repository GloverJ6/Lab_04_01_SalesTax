public class Main
{

    public static void main(String[] args)
    {
        //Declarations
        double winterMaintenance;
        double springMaintenance;
        double summerMaintenance;
        double fallMaintenance;
        double totalMaintenanceCost;

        // Prompt the user for data entry
        System.out.println("What is the maintenance cost for the winter?");

        // Simulate user input
        System.out.println("10");
        winterMaintenance = 10;

        // Prompt the user for data entry
        System.out.println("What is the maintenance cost for the spring?");

        // Simulate user input
        System.out.println("7");
        springMaintenance = 7;

        // Prompt the user for data entry
        System.out.println("What is the maintenance cost for the summer?");

        // Simulate user input
        System.out.println("15");
        summerMaintenance = 15;

        // Prompt the user for data entry
        System.out.println("What is the maintenance cost for the fall?");

        // Simulate user input
        System.out.println("10");
        fallMaintenance = 10;

        //calculate and display the total maintenance cost.
        totalMaintenanceCost = winterMaintenance + springMaintenance + summerMaintenance + fallMaintenance;
        System.out.println("Here are the values of your maintenance for each season and the total. Winter: " + winterMaintenance + " Spring: " + springMaintenance + " Summer: " + summerMaintenance + " Fall: " + fallMaintenance + ". The total price for all four months is: " + totalMaintenanceCost );

    }
}








