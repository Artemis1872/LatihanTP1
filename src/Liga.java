import java.util.Arrays;
import java.util.Comparator;

public class Liga {
    private Tim[] teams;

    public Liga(Tim[] arrofteam) {
        this.teams = arrofteam;
    }

    public Tim[] update(Tim[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(o -> o.jumlahpoin));
        return arr;
    }
}
// TODO: arr of team (sorted by posisi), update every game, update by selisih gol jika poin sama