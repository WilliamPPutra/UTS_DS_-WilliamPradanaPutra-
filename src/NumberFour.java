import java.util.Scanner;
import java.util.LinkedList;

public class NumberFour {
        public static void main(String[] args) {
            LinkedList<Mahasiswa> MahasiswaList = new LinkedList<>();
            MahasiswaList.add(new Mahasiswa(1234, "William P Putra", "TIF 1", 112022));
            MahasiswaList.add(new Mahasiswa(2345, "Billie Eilish", "TIF 2", 112022));
            MahasiswaList.add(new Mahasiswa(3456, "Taylor Swift", "TIF 3", 112022));
            MahasiswaList.add(new Mahasiswa(4567, "Joe Alwyn", "TIF 4", 112022));
            MahasiswaList.add(new Mahasiswa(5678, "Chris Evans", "TIF 5", 112022));

            Scanner valueId = new Scanner(System.in);
            Scanner valueName = new Scanner(System.in);
            Scanner valueKelas = new Scanner(System.in);
            Scanner valueTanggal = new Scanner(System.in);
            Scanner value = new Scanner(System.in);
            System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
            System.out.print("Masukan ID Mahasiswa : ");
            int id = valueId.nextInt();
            System.out.print("Masukan Nama Mahasiswa : ");
            String name = valueName.nextLine();
            System.out.print("Masukan Kelas Mahasiswa : ");
            String kelas = valueKelas.nextLine();
            System.out.print("Masukan Tanggal Masuk : ");
            int tanggal = valueTanggal.nextInt();

            MahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

            MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

            System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
            System.out.print("Masukan Nama Mahasiswa : ");
            String nameRemove = value.nextLine();
            MahasiswaList.removeIf(Mahasiswa -> Mahasiswa.getname().contains(nameRemove));
            MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

        }

    }