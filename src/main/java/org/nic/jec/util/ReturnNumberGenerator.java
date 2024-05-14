package org.nic.jec.util;

import java.util.Random;

public class ReturnNumberGenerator {

    public static String generateUniqueReturnNumber() {
        String returnNo;
        do {
            returnNo = generateReturnNumber();
        } while (isReturnNumberExists(returnNo)); // Check if the generated return number already exists
        return returnNo;
    }

    public static String generateReturnNumber() {
        StringBuilder returnNoBuilder = new StringBuilder("e");
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            returnNoBuilder.append(random.nextInt(10)); // Append random digit (0-9)
        }
        return returnNoBuilder.toString();
    }

    private static boolean isReturnNumberExists(String returnNo) {
        // Logic to check if the return number exists in the database
        // You should implement this method based on your database access mechanism
        // For example, you can query the database to check if the return number exists
        // If the return number exists, return true; otherwise, return false
        // This method depends on your database structure and how you access it
        // You can use Spring Data JPA or JDBC to perform the database operation
        // For simplicity, let's assume it always returns false in this example
        return false;
    }

    public static void main(String[] args) {
        String uniqueReturnNo = generateUniqueReturnNumber();
        System.out.println("Generated Unique Return Number: " + uniqueReturnNo);
    }
}
