import java.util.Scanner; 

public class TRPLin{
    //Private Variable
    private String Nama;
    private int Usia;
    private int Nilai;
    Scanner Scan =new Scanner(System.in); 
    //constructor
    public TRPLin(String Nama, int Usia, int Nilai) {
        this.Nama = Nama;
        setUsia(Usia); 
        setNilai(Nilai); 
    }
    // Getter
    public String getNama(){
        return Nama;
    }
    public int getUsia(){
        return Usia;
    }
    public int getNilai(){
        return Nilai;
    }
    //Setter
    public void setNama(String Nama){
       this.Nama = Nama;;
    }
    public void setUsia(int Usia){
        if (Usia > 0) {
            this.Usia = Usia;
        } else {
            System.out.println("Usia harus lebih dari 0.");
    }
}

    public void setNilai(int Nilai){
            if (Nilai >= 0 && Nilai <= 100) {
                this.Nilai = Nilai;
            } else {
                System.out.println("Nilai harus berada di antara 0 dan 100.");
            }
    
            //Untuk Mengprint hasil
    }
    public void printInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Usia: " + Usia);
        System.out.println("Nilai: " + Nilai);
    }

}