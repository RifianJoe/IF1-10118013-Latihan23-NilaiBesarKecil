/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan23.nilaibesarkecil;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Nilai Besar dan Kecil
 */
public class IF110118013Latihan23NilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        String namaPetugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        System.out.print("Masukkan Nilai Mahasiswa Ke-" + 1 + " = ");
        nilaiMahasiswa[0] = scanner.nextInt();
        int nilaiTerbesar = nilaiMahasiswa[0], nilaiTerkecil = nilaiMahasiswa[0];
        for ( int i = 1; i < jumlahMahasiswa; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
            if (nilaiMahasiswa[i] > nilaiTerbesar)
                nilaiTerbesar = nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] < nilaiTerkecil)
                nilaiTerkecil = nilaiMahasiswa[i];
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        System.out.println(Arrays.toString(nilaiMahasiswa));

        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("Petugas : " + namaPetugas );
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
