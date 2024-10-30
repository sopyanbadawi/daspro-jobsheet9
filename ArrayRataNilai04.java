import java.util.Scanner;
public class ArrayRataNilai04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();

    int[] nilaiMhs = new int[jmlMhs]; 
    int jmlLulus = 0, jmlTdkLulus = 0, totLulus = 0, totTdkLulus = 0;
    double total = 0, rata2, rata2Lulus, rata2TdkLulus;
    


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                jmlLulus++;
                totLulus += nilaiMhs[i];
            } else{
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus!");
                jmlTdkLulus++;
                totTdkLulus += nilaiMhs[i];
            }
        }
        if (jmlLulus>0) {
            rata2Lulus = (double)  totLulus / jmlLulus;
            System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        }
        if (jmlTdkLulus>0){
            rata2TdkLulus = (double) totTdkLulus / jmlTdkLulus;
            System.out.println("Rata-rata nilai tidak lulus = "+rata2TdkLulus);  
        }
        rata2 = (totLulus+totTdkLulus)/ jmlMhs;
        System.out.println("Rata-rata nilai seluruh = "+rata2); 
        System.out.println("Jumlah Mahasiswa yang Lulus : "+jmlLulus);
        System.out.println("Jumlah Mahasiswa yang tidak Lulus : "+jmlTdkLulus);
    }
}
