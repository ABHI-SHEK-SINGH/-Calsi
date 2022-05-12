import java.util.Scanner;

public class Calculator {
    double a,b;
    Scanner s = new Scanner(System.in);

    double addition()
    {
        System.out.println("Enter 2 numbers for addition");
        a = s.nextDouble();
        b = s.nextDouble();
        return(a+b);
    }
    double subtraction(){
        System.out.println("Enter 2 number for subtraction :");
        a = s.nextDouble();
        b = s.nextDouble();
        return(a-b);
    }
        double multiplication(){
            System.out.println("Enter 2 number for multiplication :");
            a = s.nextDouble();
            b = s.nextDouble();
            return(a*b);

        }

    double division() {
        System.out.println("Enter 2 number for division:");
        a = s.nextDouble();
        b = s.nextDouble();
        return (a / b);
    }

    void normal(){
        System.out.println("1; Addition");
        System.out.println("2; Subtraction");
        System.out.println("3; Multiplication");
        System.out.println("4; Division");
        System.out.println("5; Enter the number : ");
        int choice = s.nextInt();

        Calculator obj = new Calculator();
        double ans =0;
        switch(choice) {
            case 1:
                ans = obj.addition();
                break;
            case 2:
                ans = obj.subtraction();
                break;
            case 3:
                ans = obj.multiplication();
                break;
            case 4:
                ans = obj.division();
                break;

            default:
                System.out.println("wrong selection please select valid selection");
        }
        System.out.println("answer = "+ans);

        }

        int power(){
            System.out.println("Enter 2 number ");
        a = s.nextInt();
            b = s.nextInt();
         return ( (int)Math.pow(a,b));
        }

     int squareRoot(){
         System.out.println("Enter the number for square root");
         a = s.nextInt();
         return((int)Math.sqrt(a));

     }
     int maximum(){
         System.out.println("Enter the number ");
         a = s.nextInt();
         b = s.nextInt();
         return ((int)Math.max(a,b));
     }

    int minimum(){
        System.out.println("Enter the number ");
        a = s.nextInt();
        b = s.nextInt();
        return ((int)Math.min(a,b));
    }

    int logValue(){
        System.out.println("Enter the number ");
        a = s.nextInt();
       // b = s.nextInt();
        return ((int)Math.log(a));
    }




        void scientific(){
            System.out.println("1: Power");
            System.out.println("2: Square root");
            System.out.println("3: Maximum ");
            System.out.println("4: Minimum ");
            System.out.println("5: log");

            System.out.println("Enter the choice");
           int choice = s.nextInt();
           int ans =0;

           switch(choice){
       case 1:
         ans = power();
         break;
        case 2:
            ans = squareRoot();
            break;
       case 3:
           ans = maximum();
           break;
       case 4:
           ans = minimum();
           break;

               case 5:
                   ans =logValue();
                   break;
    default:
        System.out.println("Wrong Selection !");


}
            System.out.println("Answer = "+ans);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            Calculator obj = new Calculator();

            System.out.println("1: Normal calculator");
            System.out.println("2: Scientific calculator");
            System.out.println("Enter the choice");
        int choice = sc.nextInt();
       switch(choice){
           case 1:
               obj.normal();
               break;
           case 2:
               obj.scientific();
               break;

               default:
                   System.out.println("Wrong input type correct input");
       }


        }

}
