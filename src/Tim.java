public class Tim {
    private String nama;
    private Pemain[] arrofpemain;
    public int peringkat;
    public int jumlahmenang;
    public int jumlahkalah;
    public int jumlahpoin;
    public int jumlahgol;
    public int jumlahkebobolan;

    public Tim(String namatim, Pemain[] arrpemain) {
        this.arrofpemain = arrpemain;
        this.nama = namatim;
    }

    public void PrintTim() {
        System.out.println(String.format("Tim %s berisi %s anggota", this.nama, this.arrofpemain.length));
    }

    public void PrintAnggota() {
        for (Pemain x : this.arrofpemain) {
            x.PrintPemain();
        }
    }

}
// TODO: peringkat, jumlah menang, jumlah kalah, jumlahseri, jumlahpoin, jumlahgol, jumlah kebobolan