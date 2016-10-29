import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr1 = scanner.nextLine();
        String arr2 = scanner.nextLine();
        char[] array1 = arr1.replaceAll(" ", "").toCharArray();

        char[] array2 = arr2.replaceAll(" ", "").toCharArray();
        //     int shorter = 0;

        int min = Math.min(array1.length, array2.length);
        for (int i = 0; i < min; i++) {
            if (array1[i] < array2[i] && i < min - 1) {
                for (int j = 0; j < array1.length; j++) {
                    System.out.print(String.valueOf(array1[j]));
                }
                System.out.println();
                for (int j = 0; j < array2.length; j++) {
                    System.out.print(String.valueOf(array2[j]));
                }
                System.out.println();
                break;
            } else if (array1[i] > array2[i] && i < min - 1) {
                for (int j = 0; j < array2.length; j++) {
                    System.out.print(String.valueOf(array2[j]));
                }
                System.out.println();
                for (int j = 0; j < array1.length; j++) {
                    System.out.print(String.valueOf(array1[j]));
                }

                break;
            } else {
                if (i == min - 1 && array1.length == min) {
                    for (int j = 0; j < array1.length; j++) {
                        System.out.print(String.valueOf(array1[j]));
                    }
                    System.out.println();
                    for (int j = 0; j < array2.length; j++) {
                        System.out.print(String.valueOf(array2[j]));
                    }
                    System.out.println();
                } else if (i == min - 1 && array2.length == min) {
                    for (int j = 0; j < array2.length; j++) {
                        System.out.print(String.valueOf(array2[j]));
                    }
                    System.out.println();
                    for (int j = 0; j < array1.length; j++) {
                        System.out.print(String.valueOf(array1[j]));
                    }
                    System.out.println();
                }

            }
        }
    }
}
