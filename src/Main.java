import com.sun.source.tree.SwitchTree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число число:");
        int num2 = scanner.nextInt();

        int res;

        System.out.println("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат:" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат:" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат:" + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("error");
                else {
                    res = num2 / num1;
                    System.out.println("Результат:" + res);
                }
                break;
            default:
                System.out.println("Вы не правильно ввели что-то");
        }
    }
}
