import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Enter 5 strings for List A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("List A: " + listA);

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Enter 5 strings for List B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("List B: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Combined List C: " + listC);

        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted List C by length: " + listC);
    }
}