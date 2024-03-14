import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // deklarasi objek
        Mahasiswa datamahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);

        // inisialisasi value
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println(" 1. tambah data mahasiswa");
            System.out.println(" 2. tampilkan data mahasiswa");
            System.out.println(" 3. keluar");
            System.out.print("Masukkan pilihan anda (1-3) : ");

            Scanner objInput = new Scanner(System.in);
            pilihan = objInput.nextInt();

            switch (pilihan) {
                case 1:
                    datamahasiswa.inputData(); // Menggunakan objek datamahasiswa untuk memanggil metode inputdata
                    break;
                case 2:
                    System.out.println("Data mahasiswa\n" + datamahasiswa.tampilUniversitas() +
                            datamahasiswa.tampilDataMahasiswa());
                    break;
                case 3:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
                    break;
            }
        }
    }
}