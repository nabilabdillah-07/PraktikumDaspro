import java.util.Scanner;

public class sistemPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CEK IZIN MASUK KAMPUS");
        
        System.out.print("Bawa kartu mahasiswa? (ya/tidak): ");
        String kartu = sc.nextLine();
        
        System.out.print("Sudah registrasi online? (ya/tidak): ");
        String registrasi = sc.nextLine();
        
        if (kartu.equals("ya") || registrasi.equals("ya")) {
            System.out.println("Izin masuk diberikan");
        } else {
            System.out.println("Akses ditolak");
        }
        
    }
}