
import java.util.Scanner;
class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Scanner sc = new Scanner (System.in);
        String nama;
        System.out.print("masukkan nama anda: ");
        nama = sc.nextLine();
        System.out.println("Nama anda adalah: " + nama);
        int usia;
        System.out.print("masukkan usia anda: ");
        usia = sc.nextInt();
        System.out.println("Usia anda adalah: " + usia);
        int panjang,lebar ;
        System.out.print("masukkan Panjang:");
        panjang = sc.nextInt();
        System.out.print("masukkan lebar:");
        lebar = sc.nextInt();
        System.out.println("Nilai dari panjang + lebar = " + (panjang+lebar));
        
    }
    
}
