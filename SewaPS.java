import java.util.Scanner;

/**
 * Sewa
 */
public class SewaPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int nim, LamaPinjam, seri;
        int harga_akhir;
        byte hps2 = 2, hps3 = 4, hps4 = 6;
        
        System.out.print("Masukkan nama anda: ");
        nama = sc.next();
        System.out.print("Masukkan NIM anda: ");
        nim = sc.nextInt();
        System.out.println("Seri PS");
        System.out.println("1. PlayStation 2");
        System.out.println("2. PlayStation 3");
        System.out.println("3. PlayStation 4");
        System.out.println("Masukkan nomor seri yang ingin anda sewa (1-3)");
        seri = sc.nextInt();
        System.out.println("Masukkan lama bermain (jam)");
        LamaPinjam = sc.nextInt();

        harga_akhir = seri*LamaPinjam;
        if (seri < 2){
            harga_akhir = LamaPinjam*hps2;
        } else if (seri > 1 && seri < 3){
            harga_akhir = LamaPinjam*hps3;
        } else if(seri > 2){
            harga_akhir = LamaPinjam*hps4;
        }
        System.out.print("Harga yang harus anda bayar adalah Rp" +harga_akhir+ "000,00");
    }
}