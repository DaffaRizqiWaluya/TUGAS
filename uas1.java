import java.util.Scanner;

public class uas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        
        int maxData=100;
        int index=0; 
        String[] namaMahasiswa = new String[maxData];
        String[] jenisPrestasi = new String[maxData];
        String[] tingkatPrestasi = new String[maxData];
        long[] nimMahasiswa = new long[maxData];
        int[] tahunPrestasi = new int[maxData];

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
            if (menu==1) {
                System.out.print("Masukan Nama Mahasiswa: ");
                namaMahasiswa[index] = input.nextLine();
                System.out.print("Masukan NIM Mahasiswa: ");
                nimMahasiswa[index] = input.nextLong();
                input.nextLine();
                do {
                    System.out.print("Masukan Jenis Prestasi (juara 1-3): ");
                jenisPrestasi[index] = input.nextLine();
                    if (jenisPrestasi[index].equalsIgnoreCase("juara 1")) {
                        break;
                    } else if (jenisPrestasi[index].equalsIgnoreCase("juara 2")) {
                        break;
                    } else if (jenisPrestasi[index].equalsIgnoreCase("juara 3")) {
                        break;
                    } else {
                        System.out.println("Jenis prestasi tidak valid. Coba lagi");
                    }
                } while (true);

                do {
                    System.out.print("Masukan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
                    tingkatPrestasi[index] = input.nextLine();
                    if (tingkatPrestasi[index].equalsIgnoreCase("lokal")) {
                        break;
                    } else if (tingkatPrestasi[index].equalsIgnoreCase("nasional")) {
                        break;
                    } else if (tingkatPrestasi[index].equalsIgnoreCase("internasional")) {
                        break;
                    } else {
                        System.out.println("Tingkat prestasi tidak valid. Coba lagi");
                    }
                } while (true);

                do {
                    System.out.print("Masukan Tahun Prestasi (2010-2024): ");
                    tahunPrestasi[index] = input.nextInt();
                    if (tahunPrestasi[index]>=2010 && tahunPrestasi[index]<=2024) {
                        break;
                    } else {
                        System.out.println("Tahun prestasi tidak valid. Coba lagi");
                    }
                } while (true);

                System.out.println("Data prestasi berhasil ditambahkan");
                System.out.println();
                index++;

            } else if (menu==2) {
                if (index==0) {
                    System.out.println("Belum ada data prestasi");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("=========== DAFTAR SEMUA PRESTASI ===========");
                    for(int i=0; i<index ; i++) {
                        System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" |Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" |Tahun: "+tahunPrestasi[i]);
                    }
                    System.out.println();
                }
                
            } else if (menu==3) {
                if (index==0) {
                    System.out.println("Belum ada data prestasi");
                    System.out.println(); 
                } else {
                    System.out.print("Masukan Nama Prestasi Yang Ingin Di Analisis: ");
                    String cek = input.nextLine();
                    System.out.println();
                    System.out.println("============= ANALISIS PRESTASI=============");
                    for (int i = 0; i < index; i++) {
                        if (cek.equalsIgnoreCase(namaMahasiswa[i])) {
                            System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" |Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" |Tahun: "+tahunPrestasi[i]);
                        } 
                    }
                    System.out.println();
                }
            } else if (menu==4) {
                if (index==0) {
                    System.out.println("Belum ada data prestasi");
                    System.out.println(); 
                } else {
                    System.out.print("Masukan Jenis Prestasi Yang Ingin Di Analisis: ");
                    String cek = input.nextLine();
                    System.out.println();
                    System.out.println("============= ANALISIS PRESTASI=============");
                    for (int i = 0; i < index; i++) {
                        if (cek.equalsIgnoreCase(jenisPrestasi[i])) {
                            System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" |Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" |Tahun: "+tahunPrestasi[i]);
                        } 
                    }
                    System.out.println();
                }
            } else if (menu==5) {
                if (index==0) {
                    System.out.println("Belum ada data prestasi");
                    System.out.println(); 
                } else {
                    System.out.print("Masukan Tingkat Prestasi Yang Ingin Di Analisis: ");
                    String cek = input.nextLine();
                    System.out.println();
                    System.out.println("============= ANALISIS PRESTASI=============");
                    for (int i = 0; i < index; i++) {
                        if (cek.equalsIgnoreCase(tingkatPrestasi[i])) {
                            System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" |Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" |Tahun: "+tahunPrestasi[i]);
                        } 
                    }
                    System.out.println();
                }
            } else if (menu==6) {
                if (index==0) {
                    System.out.println("Belum ada data prestasi");
                    System.out.println(); 
                } else {
                    System.out.print("Masukan Nama Prestasi Yang Ingin Di Analisis: ");
                    int cek = input.nextInt();
                    System.out.println();
                    System.out.println("============= ANALISIS PRESTASI=============");
                    for (int i = 0; i < index; i++) {
                        if (cek==tahunPrestasi[i]) {
                            System.out.println("Nama: "+namaMahasiswa[i]+" | NIM: "+nimMahasiswa[i]+" |Jenis: "+jenisPrestasi[i]+" | Tingkat: "+tingkatPrestasi[i]+" |Tahun: "+tahunPrestasi[i]);
                        } 
                    }
                    System.out.println();
                }
            } else if (menu==7) {
                break;
            }

        } while (true);
        
    }
}
