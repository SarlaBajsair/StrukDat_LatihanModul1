import java.util.Scanner;

public class Segitiga<T> {
    public T tinggi;
    public T alas;

    public Segitiga(T tinggi, T alas) {
        this.tinggi = tinggi;
        this.alas = alas;
    }
    public T getTinggi() {
        return this.tinggi;
    }

    public T getAlas() {
        return this.alas;
    }

    public int getResultAsInt() {
        return (int) (0.5 * (double) (Integer) this.getAlas() * (double) (Integer) this.getTinggi());
    }

    public double getResultAsDouble() {
        return 0.5 * (Double) this.getAlas() * (Double) this.getTinggi();
    }

    public static void main(String[] args) {
        String[] inputNilai;
        String nilai, pilihan;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("===== HITUNG LUAS SEGITIGA =====");
            System.out.println();
            System.out.println("Mau menampilkan hasil luas dalam bentuk? ");
            System.out.println("1. Hasil to Integer");
            System.out.println("2. Hasil to Double");
            System.out.println("Masukkan pilihan 1 / 2 : ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan : ");
                nilai = input.nextLine();
                inputNilai = nilai.split(" ");
                Segitiga<Integer> luasTipeInt = new Segitiga<>(Integer.valueOf(inputNilai[0]), Integer.valueOf(inputNilai[1]));
                System.out.println("Luas Segitiga Dalam Integer : " + luasTipeInt.getResultAsInt());
            } else if (pilih == 2) {
                System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan : ");
                nilai = input.nextLine();
                inputNilai = nilai.split(" ");
                Segitiga<Double> luasTipeDouble = new Segitiga<>(Double.valueOf(inputNilai[0]), Double.valueOf(inputNilai[1]));
                System.out.println("Luas Segitiga Dalam Double : " + luasTipeDouble.getResultAsDouble());
            }
            System.out.println();
            System.out.println("Apakah Anda ingin melanjutkan program? (y/n)");
            pilihan = input.nextLine();

        } while (pilihan.equals("y"));
    }
}