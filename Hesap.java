import java.util.Scanner;
public class Hesap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        int say1 = sc.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        int say2 = sc.nextInt();
        System.out.println("******************************");
        System.out.println("1. Toplama\n" +
                "2. Çıkarma\n" +
                "3. Çarpma\n" +
                "4. Bölme\n" +
                "İşlem türü seçiniz(1,2,3,4,5):");
        System.out.println("*******************************");
        int sonuc;
        while (true) {
            int islem = sc.nextInt();
                if (islem == 1) {
                    sonuc = say1 + say2;
                    System.out.println("Sonuç=" + sonuc);
                }
                if (islem == 2) {
                    sonuc = (say1 - say2);
                    System.out.println("Sonuç=" + sonuc);
                }
                if (islem == 3) {
                    sonuc = say1 * say2;
                    System.out.println("Sonuç=" + sonuc);
                }

                if (islem == 4) {
                    sonuc = say1 / say2;
                    System.out.println("Sonuç=" + sonuc);
                }
                 if(islem==5) {
                System.out.println("Hatalı giriş yeniden işlem seçiniz:");
            }
                if(islem==6)
                    break;
        }
    }
}