import data.*;

public class Aplikasi {
  public static void main(String[] args) {
    Kampus objek = new Kampus();
    objek.nama();

    System.out.println("Umur mahasiswa: "+objek.umur());
    System.out.println("NIK: "+objek.NIK());
  }
}
