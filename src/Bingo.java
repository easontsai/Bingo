import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import java.util.*;

public class Bingo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter num: ");
        int n = scanner.nextInt();
        System.out.println("output: ");

        Integer[] numbers = new Integer[n*n];

        // Populating numbers.
        for (int i = 0; i < n*n; i++)
            numbers[i] = i + 1;

        // Shuffling them to make them in random order.
        List<Integer> list = Arrays.asList(numbers);
        Collections.shuffle(list);

        // Print any 6 of them. I chose first 6 ones for simplicity.
        for (int i = 0; i < n*n; i++){
            System.out.print(list.get(i) + " ");
            if(i != 0 && (i%n) == n-1){
                System.out.println();
            }
        }
    }
}

