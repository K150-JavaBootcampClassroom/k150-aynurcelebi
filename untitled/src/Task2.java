import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        int i = 0;
        int sayac = 0;
        Random random = new Random();

        while(true) {
            i = random.nextInt(500);
            if (i >= 50 && i <= 100) {
                System.out.println("" + i + " sayısı " + sayac + ". seçimde bulundu");
                return;
            }

            ++sayac;
            }
        }
    }


