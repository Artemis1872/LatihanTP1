import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static String pop(ArrayList<String> arr) {
        int index = new Random().nextInt(arr.size());
        try {
            return arr.get(index);
        } finally {
            arr.remove(index);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayOfTeamName = new ArrayList<>(Arrays.asList("Gajah", "Rusa", "Belalang", "Kodok", "Kucing",
                "Tupai", "Rajawali", "Siput", "Kumbang", "Semut", "Ular", "Harimau",
                "Kuda", "Serigala", "Panda", "Kadal", "Ayam", "Bebek"));

        ArrayList<String> arrayOfPlayerName = new ArrayList<>(Arrays.asList("Arnold", "Kaidou", "Chopper", "Pica", "Enel",
                "Zoro", "Pedro", "Beckman", "Ace", "Shiryu", "Sakazuki", "Marco",
                "Garp", "Dadan", "Sengoku", "Sanji", "Magellan", "Dragon", "Sabo",
                "Smoker", "Luffy", "Franky", "Borsalino", "Buggy", "Crocodile",
                "Shanks", "Yasopp", "Coby", "Burgess", "Usopp", "Law", "Kid", "Bege",
                "Yonji", "Doffy", "Edward", "Mihawk", "Shanks", "Jinbei", "Killer",
                "Robin", "Roger", "Shiki", "Rayleigh", "Robb", "Kuma", "Moriah",
                "Teach", "Pagaya", "Conis", "Hachi", "Brook", "Kinemon", "Vergo",
                "Caesar", "Momo", "Mohji", "Cabaji", "Jozu", "Vista", "Doma", "Augur",
                "Drake", "Ivankov", "Charlotte", "Bellamy", "Demaro", "Dorry",
                "Brogy", "Kuro", "Zeff", "Gin", "Pearl", "Alvide", "Apoo", "Kuzan",
                "Nami", "Brook", "Hancock", "Koala"));

        List<Tim> timpemain = new ArrayList<>();

        Game game = new Game();
        System.out.println("WELCOME...");

        while (!game.isFinished()) {
            Scanner input = new Scanner(System.in);
            System.out.print("[LIGAF12]=> ");
            String[] perintah = input.nextLine().split("\\s+");

            if (perintah[0].toUpperCase().equals("INIT")) {

                for (int i = 0; i < (Integer.parseInt(perintah[1])); i++) {

                    Pemain[] pemains = new Pemain[5];
                    for (int j = 0; j < 5; j++) {

                        ArrayList<String> dummyplayer = new ArrayList<>(arrayOfPlayerName);
                        int nomorpemain = ThreadLocalRandom.current().nextInt(1, 100);

                        pemains[j] = new Pemain(pop(dummyplayer), nomorpemain);
                    }
                    timpemain.add(new Tim(pop(arrayOfTeamName), pemains));
                }

                System.out.println(timpemain);
                for (Tim x : timpemain) {
                    x.PrintTim();
                    x.PrintAnggota();
                }
            }
        }
    }
}
