import java.util.Scanner;
public class Ex4_Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от месяца: ");
        int a = sc.nextInt();
        if (a==1 || a==2 || a==12) {
            System.out.println("Зима");
        }
        else if (a==3 || a==4 || a==5) {
            System.out.println("Весна");
        }
        else if (a==6 || a==7 || a==8) {
            System.out.println("Лето");
        }
        else if (a==9 || a==10 || a==11) {
            System.out.println("Осень");
        }
        else {
            System.out.println("Ошибка! Введено число не от 1 до 12");
        }
    }
}
