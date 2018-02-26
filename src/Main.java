

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deputat first = new Deputat(120, 178, "Yanukovich", "Viktor", 55, true, 4000 );
        Deputat second = new Deputat(90, 180, "Poroshenko", "Petya", 58, false, 6000 );
        Fraction.deputats.add(first);
        Fraction.deputats.add(second);


        Scanner scanner = new Scanner(System.in);
        menu:
        System.out.println("**********************Menu**********************");
        System.out.println("1 - Верховна рада");
        System.out.println("2 - Фракція");
        System.out.println("3 - Дупутат");
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                rada:
                System.out.println("1 - Додати фракцію");
                System.out.println("2 - Вивести всі фракції");
                System.out.println("3 - Вивести найбільшого хабарника");
                break;
            case 2: {
                fraction:
                {
                    System.out.println("1 - Додати депутата");
                    System.out.println("2 - Вивести всіх депутатів");
                    System.out.println("3 - Вивести найбільшого хабарника");
                    System.out.println("4 - Вивести суму всіх хабарів");
                    System.out.println("5 - Видалити депутата");
                    System.out.println("6 - Видалити всіх негідників які брали хабар");
                    System.out.println("7 - Видалити всіх хабарників");
                    int fract = scanner.nextInt();
                    switch (fract) {
                        case 1:
                            Fraction.addDep();
                            break;
                        case 2:
                            Fraction.soutAll();
                            break;
                        case 3:
                            System.out.println("Error");
                            break;
                        case 4:
                            Fraction.sumOfhabar();
                            break;
                        case 5:
                            Fraction.delDep();
                            break;
                        case 6:
                            Fraction.delNegidnuk();
                            break;
                        case 7:
                            Fraction.delAll();
                            break;
                    }
                }
            }
            case 3:
                break;
        }

    }
}
