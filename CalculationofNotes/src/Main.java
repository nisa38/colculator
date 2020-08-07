import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your first exam results : ");
        int visa1 = sc.nextInt();

        System.out.println("Your second exam results : ");
        int visa2 = sc.nextInt();

        System.out.println("Your final exam results : ");
        int finalnote = sc.nextInt();

        System.out.print("Your School Average : ");
        double average = sc.nextDouble();

        double totalnote = (visa1 * 3 / 10.0 ) + (visa2 * 3 / 10.0 ) + (finalnote * 4 / 10.0 );

        if(totalnote >= 90){
            System.out.println("Your Note : AA");
        }
        else if(totalnote >= 85){
            System.out.println("Your Note : BA");
        }
        else if(totalnote >= 75){
            System.out.println("Your Note : BB");
        }
        else if(totalnote >= 70){
            System.out.println("Your Note : CB");
        }
        else if(totalnote >= 65){
            System.out.println("Your Note : CC");
        }
        else if(totalnote >= 60){
            System.out.println("Your Note : DC");
        }
        else if(totalnote >= 55) {
            System.out.println("Your Note : DD");
        }
        if (average < 2.50) {

            System.out.println("You've received DD, and your Grade average is low. You might want to think about taking this class again.");
        }

        else if(totalnote >= 50){
            System.out.println("Your Note : FD");
        }
        else {
            System.out.println("Your Note : FF");
        }
    }
}
