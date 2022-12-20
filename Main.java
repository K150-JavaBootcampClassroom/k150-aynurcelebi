import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Bankamıza Hoşgeldiniz..\n" +
                    "**************************************************\n" +
                    "Yapılacak işlemler için aşağıda verilen numaraları kullanın lütfen. Farklı bir numara kullanmanız halinde işleminiz geçersiz sayılacaktır !\n" +
                    "1- Para çekme \n" +
                    "2- Para yatırma\n" +
                    "3- Bakiye sorgulama \n" +
                    "4- Çıkış\n" +
                    "**************************************************\n");
            System.out.println("İşlem numaranızı girin: \t");
            Scanner scan = new Scanner(System.in);

            int miktar = scan.nextInt();
            int bakiye = 100;

            switch (miktar) {
                case 1:
                    System.out.println("Çekmek istediğiniz miktarı girin: \t");
                    int tutar = scan.nextInt();
                    if (tutar > bakiye) {
                        System.out.println("Bakiyeniz yetersiz..");
                    } else {
                        bakiye = bakiye - tutar;
                        System.out.println(tutar + " tl çekildi. Bakiyeniz: " + bakiye);
                    }
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz tutarı girin: \t");
                    tutar = scan.nextInt();
                    bakiye = bakiye + tutar;
                    System.out.println(tutar + " tl yatırıldı. Bakiyeniz: " + bakiye);
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + bakiye + " tl");
                    break;
                case 4:
                    System.out.println("Sistemden çıkılıyor..");
                    break;
                default:
                    System.out.println("Geçersiz işlem yaptınız.. Lütfen Yukarıda bulunan rakamlardan birini seçin!");
            }

        }
    }
}
