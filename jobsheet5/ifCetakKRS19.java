import java.util.Scanner;

public class ifCetakKRS19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (True/false): ");
        boolean uktLunas = sc.nextBoolean();

         String hasil = uktLunas 
            ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println(hasil);
        }
    }