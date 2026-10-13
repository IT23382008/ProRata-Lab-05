import java.util.Scanner;

public class IT23382008Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;
        final int MINIMUM_DAY = 1;
        final int MAXIMUM_DAY = 31;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < MINIMUM_DAY
                || startDate > MAXIMUM_DAY
                || endDate < MINIMUM_DAY
                || endDate > MAXIMUM_DAY) {

            System.out.println(
                    "Error: Days must be between 1 and 31"
            );
            input.close();
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println(
                    "Error: Start Date must be less than End Date"
            );
            input.close();
            return;
        }

        int numberOfDays = endDate - startDate;
        double totalAmount =
                numberOfDays * ROOM_CHARGE_PER_DAY;

        if (numberOfDays >= 5) {
            totalAmount =
                    totalAmount - (totalAmount * DISCOUNT_20);
        } else if (numberOfDays >= 3) {
            totalAmount =
                    totalAmount - (totalAmount * DISCOUNT_10);
        }

        System.out.println();
        System.out.println(
                "Room Charge Per Day: Rs. "
                + ROOM_CHARGE_PER_DAY + "/="
        );
        System.out.println(
                "Number of Days Reserved: " + numberOfDays
        );
        System.out.println(
                "Total Amount to be Paid: " + totalAmount
        );

        input.close();
    }
}