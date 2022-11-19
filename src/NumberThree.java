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

        MahasiswaList.set(4, new Mahasiswa(6, "Lisa", "TIF 2", 20));

        MahasiswaList.add(3, new Mahasiswa(8, "Billie", "DKV 2", 31));

        System.out.println(MahasiswaList.contains(new Mahasiswa(1, "William", "TIF 1", 27)));
        System.out.println(MahasiswaList.indexOf(new Mahasiswa(9, "Billie", "TIF 2", 03)));

        MahasiswaList.remove(2);
        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa));

    }
}