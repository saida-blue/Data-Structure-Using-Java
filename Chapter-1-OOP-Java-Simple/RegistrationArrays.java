import java.util.Arrays;

public class RegistrationArrays {
    public static void main(String[] args) {
        // I put the student information in separate arrays first.
        String[] ids = {"S1001", "S1002"};
        String[] names = {"Hawa", "Ali"};
        String[] majors = {"CS", "IT"};
        int[] credits = {45, 30};

        System.out.println("Before sorting:");
        printRecords(ids, names, majors, credits);

        // Ali changes his major.
        majors[1] = "CS";

        // Only the names are sorted, not the other arrays.
        Arrays.sort(names);

        System.out.println("\nAfter sorting names only:");
        printRecords(ids, names, majors, credits);
    }

    private static void printRecords(String[] ids, String[] names, String[] majors, int[] credits) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(ids[i] + " | " + names[i] + " | " + majors[i] + " | " + credits[i]);
        }
    }
}
