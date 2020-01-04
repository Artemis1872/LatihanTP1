import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayOfTeamName = new ArrayList<String>(Arrays.asList("Gajah", "Rusa", "Belalang", "Kodok", "Kucing",
                "Tupai", "Rajawali", "Siput", "Kumbang", "Semut", "Ular", "Harimau",
                "Kuda", "Serigala", "Panda", "Kadal", "Ayam", "Bebek"));


        Game game = new Game();

        while (!game.isFinished()) {
            Scanner input = new Scanner(System.in);
            System.out.println("WELCOME...");
            System.out.print("[LIGAF12]=> ");
            String[] perintah = input.nextLine().split("\\s+");
            for (int i = 0; i < (Integer.parseInt(perintah[1])); i++) {

            }


        }
    }
}
