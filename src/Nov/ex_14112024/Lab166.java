package Nov.ex_14112024;

public class Lab166 {


        // Define an enum to represent days of the week
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        public static void main(String[] args) {
            // Accessing an enum constant
            Day today = Day.MONDAY;
            System.out.println("Today is: " + today);

            // Using enum in a switch statement
            switch (today) {
                case MONDAY:
                    System.out.println("Start of the week!");
                    break;
                case FRIDAY:
                    System.out.println("Almost the weekend!");
                    break;
                case SUNDAY:
                    System.out.println("Weekend vibes!");
                    break;
                default:
                    System.out.println("Regular weekday.");
                    break;
            }

            // Loop through all enum constants
            System.out.println("\nAll Days of the Week:");
            for (Day day : Day.values()) {
                System.out.println(day);
            }
        }
    }


