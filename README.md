Berikut adalah penjelasan kode Java tersebut baris per baris:

1. Import Library Scanner
java
Salin
Edit
import java.util.Scanner;
Mengimpor library Scanner untuk mengambil input dari pengguna.
2. Deklarasi Kelas dan Metode Main
java
Salin
Edit
public class uas1 {
    public static void main(String[] args) {
public class uas1: Mendefinisikan kelas bernama uas1.
public static void main(String[] args): Metode utama yang akan dieksekusi pertama kali ketika program dijalankan.
3. Deklarasi Variabel
java
Salin
Edit
Scanner input = new Scanner(System.in);
int menu;
        
int maxData=100;
int index=0; 
String[] namaMahasiswa = new String[maxData];
String[] jenisPrestasi = new String[maxData];
String[] tingkatPrestasi = new String[maxData];
long[] nimMahasiswa = new long[maxData];
int[] tahunPrestasi = new int[maxData];
Scanner input = new Scanner(System.in); → Membuat objek Scanner untuk membaca input dari pengguna.
int menu; → Variabel untuk menyimpan pilihan menu.
int maxData=100; → Maksimum jumlah data yang bisa disimpan.
int index=0; → Indeks untuk menyimpan jumlah data yang telah diinput.
String[] namaMahasiswa, jenisPrestasi, tingkatPrestasi → Array untuk menyimpan nama, jenis, dan tingkat prestasi mahasiswa.
long[] nimMahasiswa → Array untuk menyimpan NIM mahasiswa.
int[] tahunPrestasi → Array untuk menyimpan tahun prestasi.
4. Perulangan do-while untuk Menu Program
java
Salin
Edit
do {
    System.out.println("======= PENCATATAN PRESTASI MAHASISWA =======");
    System.out.println("1. Tambah Data Prestasi");
    System.out.println("2. Tampilkan Semua Prestasi");
    System.out.println("3. Analisis Prestasi Berdasarkan Nama");
    System.out.println("4. Analisis Prestasi Berdasarkan Jenis");
    System.out.println("5. Analisis Prestasi Berdasarkan Tingkat");
    System.out.println("6. Analisis Prestasi Berdasarkan Tahun");
    System.out.println("7. Keluar");
    System.out.print("Pilih menu: ");
    menu = input.nextInt();
    input.nextLine();
Program menampilkan daftar menu pilihan.
menu = input.nextInt(); → Menerima input pilihan menu dari pengguna.
input.nextLine(); → Membersihkan buffer input agar tidak terjadi error saat membaca nextLine().
5. Menambahkan Data Prestasi (menu==1)
java
Salin
Edit
if (menu==1) {
    System.out.print("Masukan Nama Mahasiswa: ");
    namaMahasiswa[index] = input.nextLine();
    System.out.print("Masukan NIM Mahasiswa: ");
    nimMahasiswa[index] = input.nextLong();
    input.nextLine();
Menerima input nama dan NIM mahasiswa.
Memvalidasi input jenis prestasi (juara 1-3):

java
Salin
Edit
do {
    System.out.print("Masukan Jenis Prestasi (juara 1-3): ");
    jenisPrestasi[index] = input.nextLine();
    if (jenisPrestasi[index].equalsIgnoreCase("juara 1") || 
        jenisPrestasi[index].equalsIgnoreCase("juara 2") || 
        jenisPrestasi[index].equalsIgnoreCase("juara 3")) {
        break;
    } else {
        System.out.println("Jenis prestasi tidak valid. Coba lagi");
    }
} while (true);
Memastikan pengguna hanya bisa memasukkan juara 1, juara 2, atau juara 3.
Memvalidasi input tingkat prestasi (Lokal/Nasional/Internasional):

java
Salin
Edit
do {
    System.out.print("Masukan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
    tingkatPrestasi[index] = input.nextLine();
    if (tingkatPrestasi[index].equalsIgnoreCase("lokal") ||
        tingkatPrestasi[index].equalsIgnoreCase("nasional") ||
        tingkatPrestasi[index].equalsIgnoreCase("internasional")) {
        break;
    } else {
        System.out.println("Tingkat prestasi tidak valid. Coba lagi");
    }
} while (true);
Memastikan pengguna hanya bisa memasukkan lokal, nasional, atau internasional.
Memvalidasi input tahun prestasi (2010-2024):

java
Salin
Edit
do {
    System.out.print("Masukan Tahun Prestasi (2010-2024): ");
    tahunPrestasi[index] = input.nextInt();
    if (tahunPrestasi[index]>=2010 && tahunPrestasi[index]<=2024) {
        break;
    } else {
        System.out.println("Tahun prestasi tidak valid. Coba lagi");
    }
} while (true);
Memastikan tahun yang dimasukkan berada dalam rentang 2010-2024.
Menambahkan data ke dalam array:

java
Salin
Edit
System.out.println("Data prestasi berhasil ditambahkan");
System.out.println();
index++;
Menampilkan pesan bahwa data berhasil ditambahkan.
index++ → Menambah jumlah data yang tersimpan.
6. Menampilkan Semua Data Prestasi (menu==2)
java
Salin
Edit
if (menu==2) {
    if (index==0) {
        System.out.println("Belum ada data prestasi");
    } else {
        System.out.println("=========== DAFTAR SEMUA PRESTASI ===========");
        for(int i=0; i<index ; i++) {
            System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" | Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" | Tahun: "+tahunPrestasi[i]);
        }
    }
}
Jika tidak ada data (index == 0), menampilkan pesan "Belum ada data prestasi".
Jika ada data, menampilkan semua data prestasi yang tersimpan.
7. Analisis Berdasarkan Nama (menu==3)
java
Salin
Edit
if (menu==3) {
    if (index==0) {
        System.out.println("Belum ada data prestasi");
    } else {
        System.out.print("Masukan Nama Prestasi Yang Ingin Di Analisis: ");
        String cek = input.nextLine();
        for (int i = 0; i < index; i++) {
            if (cek.equalsIgnoreCase(namaMahasiswa[i])) {
                System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" | Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" | Tahun: "+tahunPrestasi[i]);
            }
        }
    }
}
Meminta input nama mahasiswa.
Menampilkan data prestasi yang sesuai dengan nama mahasiswa yang dimasukkan.
8. Analisis Berdasarkan Jenis (menu==4)
Mirip dengan menu sebelumnya, tetapi berdasarkan jenis prestasi (juara 1, juara 2, juara 3).

9. Analisis Berdasarkan Tingkat (menu==5)
Mirip dengan menu sebelumnya, tetapi berdasarkan tingkat prestasi (lokal, nasional, internasional).

10. Analisis Berdasarkan Tahun (menu==6)
java
Salin
Edit
if (menu==6) {
    if (index==0) {
        System.out.println("Belum ada data prestasi");
    } else {
        System.out.print("Masukan Tahun Prestasi Yang Ingin Di Analisis: ");
        int cek = input.nextInt();
        for (int i = 0; i < index; i++) {
            if (cek==tahunPrestasi[i]) {
                System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" | Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" | Tahun: "+tahunPrestasi[i]);
            }
        }
    }
}
Meminta input tahun dan menampilkan data yang sesuai.
11. Keluar dari Program (menu==7)
java
Salin
Edit
if (menu==7) {
    break;
}
Menghentikan perulangan dan keluar dari program.
Kode ini adalah sistem pencatatan prestasi mahasiswa yang berbasis menu dengan validasi input agar data yang dimasukkan benar.












Cari

Menalar