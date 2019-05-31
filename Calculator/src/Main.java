import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        System.out.println("Witaj w kalkulatorze zacznij od wyboru oeracji ktora chcesz przeprowadzic \n1: Dodawanie \n 2: Odejmowanie" +
                "\n 3: mnozenie \n 4: Dzielenie");

        int choice = scanner.nextInt();
        double resoult;
        switch (choice) {
            case 1:
                System.out.println("wybrałes dodawanie");
                System.out.println("podaj ile liczb czesz dodac do siebie");
                int amountOfNumbers = scanner.nextInt();
                double[] numbersToAdd = new double[amountOfNumbers];

                for (int i = 0; i < amountOfNumbers; i++){
                    System.out.println("Podaj liczbe nr "+(i+1)+ ":  ");
                    numbersToAdd[i] = scanner.nextDouble();
                }
                resoult = calculator.addingNumbers(numbersToAdd);

                System.out.println(resoult);
                break;


            case 2:
                System.out.println("Wybrałes odejmowanie");
                System.out.println("podaj ile liczb czesz odjac od siebie");
                amountOfNumbers = scanner.nextInt();
                double[] numbersToSubstrakt = new double[amountOfNumbers];

                for (int i = 0; i < amountOfNumbers; i++){
                    System.out.println("Podaj liczbe nr "+(i+1)+ ":  ");
                    numbersToSubstrakt[i] = scanner.nextDouble();
                }
                resoult = calculator.substractingNumbers(numbersToSubstrakt);

                System.out.println(resoult);
                break;

            case 3:
                System.out.println("wybrałes mnozenie");

                System.out.println("podaj ile liczb czesz pomnozyc");
                amountOfNumbers = scanner.nextInt();
                double[] numbersToMultiply = new double[amountOfNumbers];

                for (int i = 0; i < amountOfNumbers; i++){
                    System.out.println("Podaj liczbe nr "+(i+1)+ ":  ");
                    numbersToMultiply[i] = scanner.nextDouble();
                }
                resoult = calculator.multipliingNumbers(numbersToMultiply);

                System.out.println(resoult);

                break;


            case 4:
                System.out.println("wybrałs dzielenie");
                System.out.println("podaj ile liczb czesz podzielic");
                amountOfNumbers = scanner.nextInt();
                double[] numbersToDevide = new double[amountOfNumbers];

                for (int i = 0; i < amountOfNumbers; i++){
                    System.out.println("Podaj liczbe nr "+(i+1)+ ":  ");
                    numbersToDevide[i] = scanner.nextDouble();
                }
                resoult = calculator.dividingNumbers(numbersToDevide);

                System.out.println(resoult);

                break;





        }


    }

}

