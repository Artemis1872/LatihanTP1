public class Pemain {
    private String nama;
    private int nomor;

    public Pemain(String nama, int nomor) {
        this.nama = nama;
        this.nomor = nomor;
    }

    public void PrintPemain() {
        System.out.println(String.format("No. %s dengan nama %s", this.nomor, this.nama));
    }

}
// TODO: Nomor pemain, nama pemain, jumlahgol, jumlah pelanggaran, jumlah kartu kuning, jmlah kartu merah