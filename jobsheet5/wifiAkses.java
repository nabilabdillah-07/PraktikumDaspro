import java.util.Scanner;

public class wifiAkses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cek Akses Wifi");
        
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenis = sc.nextLine();
        
        System.out.print("Masukkan jumlah SKS: ");
        int sks = sc.nextInt();
    
        if (jenis.equals("dosen")) {
            System.out.println("Selamat! Akses WiFi diberikan untuk dosen");
        } 
        else if (jenis.equals("mahasiswa")) {
            if (sks >= 12) {
                System.out.println("Selamat! Akses WiFi diberikan untuk mahasiswa aktif");
            } else {
                System.out.println("Maaf, akses WiFi ditolak");
                System.out.println("SKS Anda kurang dari 12");
            }
        } 
        else {
            System.out.println("Maaf, akses WiFi ditolak");
            System.out.println("Jenis pengguna tidak dikenali");
        }
        
    }
}