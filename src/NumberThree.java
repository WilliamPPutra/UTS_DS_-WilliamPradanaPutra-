import java.util.ArrayList;
import java.util.List;

public class NumberThree {

    public static void main(String[] args) {

        List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(1, "William", "TIF 1", 12));
        MahasiswaList.add(new Mahasiswa(2, "Taylor", "TIF 2", 13));
        MahasiswaList.add(new Mahasiswa(3, "Drake", "TIF 3", 14));
        MahasiswaList.add(new Mahasiswa(4, "Andrew", "DKV 1", 15));
        MahasiswaList.add(new Mahasiswa(5, "Jennie", "DKV 2", 16));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
        MahasiswaList.remove(2);

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
    }
}