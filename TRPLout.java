
public class TRPLout {
    public static void main(String[] args) {
        // Membuat objek Siswa
        TRPLin siswa1 = new TRPLin("Andi",0,0);

        // Menampilkan informasi siswa
        siswa1.printInfo();

        // Mengubah atribut menggunakan setter
        siswa1.setUsia(20);
        siswa1.setNilai(95);

        // Menampilkan informasi setelah perubahan
        System.out.println("\nSetelah perubahan:");
        siswa1.printInfo();
    }
}