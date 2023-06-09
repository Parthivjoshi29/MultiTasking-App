import java.util.Scanner;
import java.time.*;
import java.util.*;
import java.text.DecimalFormat;
public class pro {
    public static void main(String[] args) {
        System.out.println("Enter The name Among This Options");
        System.out.println("OpenGame,OpenCalculator,OpenAgeCalculator,OpenCConvter");
        Scanner i = new Scanner(System.in);
        String ch = i.nextLine();
        switch (ch) {
            case "OpenGame":
                System.out.println("Enter number");
                int number = 1 + (int) (100 * Math.random());
                for (int k = 1; k <= 10; k++) {
                    int j = i.nextInt();
                    if (number > j) {
                        System.out.println("The number is greater than Entered Number");
                        System.out.println("Remaining chances" + (10 - k));
                        continue;
                    } else if (number < j) {
                        System.out.println("The number is less than Entered Number");
                        System.out.println("Remaining chances" + (10 - k));
                        continue;
                    } else if (number == j) {
                        System.out.println("Congratulations You guessed right number its" + number);
                        System.out.println("Remaining chances" + (10 - k));
                        continue;
                    }
                }
                System.out.println("The right number is" + number);
                break;
            case "OpenCalculator":
                System.out.println("Enter Values and Arithmetic Sign to perform Operation");
                String sign = i.nextLine();
                double a = i.nextDouble();
                double b = i.nextDouble();
                switch (sign) {
                    case "+":
                        System.out.println("Addition=" + (a + b));
                        break;
                    case "-":
                        System.out.println("Subtraction=" + (a - b));
                        break;
                    case "*":
                        System.out.println("Multiplication=" + (a * b));
                        break;
                    case "/":
                        System.out.println("Division=" + (a / b));
                        break;
                    case "%":
                        System.out.println("Modulo=" + (a % b));
                        break;
                    default:
                        System.out.println("Please Enter Valid sign to perfom the Operation");
                }
                break;

            case "OpenAgeCalculator":
                System.out.println("Enter (1)-Birthyear (2)-BirthMonth,(3)-BirthDate");
                int year = i.nextInt();
                int month = i.nextInt();
                int date = i.nextInt();
                LocalDate dob = LocalDate.of(year, month, date);
                LocalDate curDate = LocalDate.now();
                Period period = Period.between(dob, curDate);
                System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
                break;

            case "OpenCConvter":
                double amount;
                double rupee, dollar, pound, euro, yen, ringgit;
                int choice;

                DecimalFormat f = new DecimalFormat("##.##");

                Scanner sc = new Scanner(System.in);

                System.out.println("Following are the Choices:");
                System.out.println("Enter 1: Ruppe");
                System.out.println("Enter 2: Dollar");
                System.out.println("Enter 3: Pound");
                System.out.println("Enter 4: Euro");
                System.out.println("Enter 5: Yen");
                System.out.println("Enter 5: Ringgit");

                System.out.print("\nChoose from above options: ");
                choice = sc.nextInt();

                System.out.println("Enter the amount you want to convert?");
                amount = sc.nextFloat();

                switch (choice) {
                    case 1:  // Ruppe Conversion
                        dollar = amount / 70;
                        System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                        pound = amount / 88;
                        System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                        euro = amount / 80;
                        System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");

                        yen = amount / 0.63;
                        System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

                        ringgit = amount / 16;
                        System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
                        break;

                    case 2:  // Dollar Conversion
                        rupee = amount * 70;
                        System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");

                        pound = amount * 0.78;
                        System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                        euro = amount * 0.87;
                        System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                        yen = amount * 111.087;
                        System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                        ringgit = amount * 4.17;
                        System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
                        break;

                    case 3:  // Pound Conversion
                        rupee = amount * 88;
                        System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");

                        dollar = amount * 1.26;
                        System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                        euro = amount * 1.10;
                        System.out.println(amount + " pound = " + f.format(euro) + " Euro");

                        yen = amount * 140.93;
                        System.out.println(amount + " pound = " + f.format(yen) + " Yen");

                        ringgit = amount * 5.29;
                        System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
                        break;

                    case 4:  // Euro Conversion
                        rupee = amount * 80;
                        System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");

                        dollar = amount * 1.14;
                        System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                        pound = amount * 0.90;
                        System.out.println(amount + " euro = " + f.format(pound) + " Pound");

                        yen = amount * 127.32;
                        System.out.println(amount + " euro = " + f.format(yen) + " Yen");

                        ringgit = amount * 4.78;
                        System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
                        break;

                    case 5:  // Yen Conversion
                        rupee = amount * 0.63;
                        System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");

                        dollar = amount * 0.008;
                        System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

                        pound = amount * 0.007;
                        System.out.println(amount + " yen = " + f.format(pound) + " Pound");

                        euro = amount * 0.007;
                        System.out.println(amount + " yen = " + f.format(euro) + " Euro");

                        ringgit = amount * 0.037;
                        System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
                        break;

                    case 6:  // Ringgit Conversion
                        rupee = amount * 16.8;
                        System.out.println(amount + " ringgit = " + f.format(rupee) + " Ruppes");

                        dollar = amount * 0.239;
                        System.out.println(amount + " ringgit = " + f.format(dollar) + " dollar");

                        pound = amount * 0.188;
                        System.out.println(amount + " ringgit =: " + f.format(pound) + " pound");

                        euro = amount * 0.209;
                        System.out.println(amount + " ringgit = " + f.format(euro) + " euro");

                        yen = amount * 26.63;
                        System.out.println(amount + " ringgit = " + f.format(yen) + " yen");
                        break;


                    default:
                        System.out.println("Wrong Choice");
                        break;
                }

        }
    }
}