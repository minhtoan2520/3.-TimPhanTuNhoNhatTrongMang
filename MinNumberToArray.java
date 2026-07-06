import java.util.Scanner;

//BT tim phan tu nho nhat trong mang 1 chieu
public class MinNumberToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int size = input.nextInt();
        while (size <= 0) {
            System.out.print("So luong phan tu phai lon hon 0! \nVui long nhap lai: ");
            size = input.nextInt();
        }

        int num;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            num = input.nextInt();
            array[i] = num;
        }

        System.out.print("Mang ban vua tao la : [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");

        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nPhan tu nho nhat trong mang la: " + min);
        System.out.println("Nam o vi tri: " + minIndex);
        input.close();
    }
}