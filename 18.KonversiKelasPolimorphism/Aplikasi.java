import data.Kampus;
import data.Mahasiswa;

public class Aplikasi{
  public static void main(String[] args) {
    Kampus k = new Mahasiswa();
    Mahasiswa m = (Mahasiswa) k;
    m.setNim("1233");
    System.out.println(m.getNim());
  }
}
