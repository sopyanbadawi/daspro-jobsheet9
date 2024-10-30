import java.util.Scanner;
public class Tugas204{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrPesanan, totalBayar = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        arrPesanan = sc.nextInt();
        sc.nextLine();

        String namaMakanan[] = new String [arrPesanan];
        int harga[] = new int [arrPesanan];
        
 
        for(int i = 0; i < arrPesanan; i++) { 
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            namaMakanan[i] = sc.nextLine();
            System.out.print("Harga " + namaMakanan[i] + " : ");
            harga[i] = sc.nextInt();
            sc.nextLine();

            totalBayar += harga[i];
        
        }

        System.out.println("\nPesanan anda adalah sebagai berikut:");
        for(int i = 0; i < namaMakanan.length; i++){
            System.out.println((i+1) + ". " + namaMakanan[i] + " - Rp " + harga[i]);
        }
        System.out.println("\nTotal Bayar: Rp " + totalBayar);
    }   
}