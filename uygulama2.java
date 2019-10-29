import java.util.Scanner;

public class uygulama2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç kere zar atılıyor");
        int kacKere=sc.nextInt();
        for(int i=0; i<kacKere; i++){
            int zar1=(int)(Math.random()*6)+1;
            System.out.println(zar1);
        }

    }
}
