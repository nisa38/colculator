import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        String adi="Nisa";
        String sifre="1234";

        Scanner sc=new Scanner(System.in);
        System.out.println("kullanıcı adı giriniz:");
        String adGiris=sc.next();
        System.out.println("şifre giriniz:");
        String sifreGiris=sc.next();

        if (adi.equals(adGiris) && sifre.equals(sifreGiris)){

            System.out.println("giriş başarılı");

        }else if(adi.equals(adGiris) || sifre.equals(sifreGiris)){

            System.out.println("kullanıcı adı veya sifre hatalı");
        }

    }
}
