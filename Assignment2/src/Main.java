//Q1 ( Exercises )
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//    for (int i=1 ;i <= 10 ;i++)
//        System.out.println(i);
//    }}



//Q2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num =input.nextInt() ;
//        if (num %2 ==0){
//            System.out.println(num + " is Even");
//        }
//        else {
//            System.out.println(num+ " is Odd");
//        }
//
//    }}




//Q3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number (1-7) to get the day name (Saturday = 1): ");
//        int day = input.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Saturday");
//                break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//            case 3:
//                System.out.println("Monday");
//                break;
//            case 4:
//                System.out.println("Tuesday");
//                break;
//            case 5:
//                System.out.println("Wednesday");
//                break;
//            case 6:
//                System.out.println("Thursday");
//                break;
//            case 7:
//                System.out.println("Friday");
//                break;
//            default:
//                System.out.println("Invalid input. Please enter a number from 1 to 7");
//        }
//    }
//}



//  Q4
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the num :");
//        int num = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + num + " = " + (i * num));
//        }
//    }
//}



//Q5
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the num :");
//      // double num = input.nextDouble();
//        long num = input.nextLong();
//        int counter=0 ;
//        while (num != 0) {
//            num = num / 10;
//            counter ++ ;
//        }
//        System.out.println("Digits count: " + counter);
//
//        }
//    }



// Q6
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        int reversed = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num = num / 10;
//        }
//        System.out.println("Reversed number: " + reversed);
//    }
//}



//        Q7
//import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Scanner user=new Scanner(System.in);
//        System.out.println("enter the number of the students ");
//        int number= user.nextInt();
//
//        String[] name = new String[number];
//        double[] AVG = new double[number];
//        char[] grades = new char[number];
//
//        for(int i=0;i<number;i++ ) {
//            System.out.println(" Student " + (i + 1));
//            System.out.println("Enter name: ");
//            name[i] = user.next();
//            System.out.println("Enter your score in the exam 1: ");
//            double score_1 = user.nextInt();
//            System.out.println("Enter your score in the exam 2: ");
//            double score_2 = user.nextInt();
//            System.out.println("Enter your score in the exam 3: ");
//            double score_3 = user.nextInt();
//            AVG[i] = (score_1 + score_2 + score_3) / 3;
//
//            if(AVG[i] >= 85)
//                grades[i] = 'A';
//            else if(AVG[i] >= 70)
//                grades[i] = 'B';
//            else if(AVG[i] >= 50)
//                grades[i] = 'C';
//            else{
//                grades[i] = 'F';}
//            System.out.println("================================");
//        }
//        for(int j=0;j<number;j++)
//        {
//            System.out.println("student --"+ (j+1) +"--");
//            System.out.println("Name: "+name[j]);
//            System.out.println("agverage grades: "+AVG[j]);
//            System.out.println( "your grade is: "+grades[j]);
//            System.out.println("========================");
//        }
//    }
//}

// //////// lec assignment
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String correctPass = "1234";
//        String enteredPass;
//        int attempts = 3;
//        do {
//            System.out.print("Enter your password: ");
//            enteredPass = input.nextLine();
//            if (enteredPass.equals(correctPass)) {
//                System.out.println("Access Granted");
//                break;
//            } else {
//                attempts--;
//                System.out.println("Wrong password. Attempts left: " + attempts);
//
//            }
//        } while (attempts > 0);
//
//        if (attempts == 0 && !enteredPass.equals(correctPass)) {
//            System.out.println("Access Denied");
//        }
//    }
//}