import java.util.Scanner;
public class Draw {
    public static void main(String[] args) {
                rectangle(4,7);
                rightTriangle(6);
    }

    public static void rectangle(int a, int b) {
        int count = 0;
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print("*");
                count++;
            }
            System.out.print("\r\n");
        }
        System.out.println("Số dấu sao được in ra: "+count);
    }
    public static void rightTriangle(int num) {
        int count = 0;
        for(int i = 0; i < num; i++){
            for (int j = 0; j < num - i; j++){
                System.out.print("*");
                count++;
            }
            System.out.print("\r\n");
        }
        System.out.println("Số dấu sao được in ra: "+count);
    }
}
