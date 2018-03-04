import data.Batman;
import data.Movie;
import data.Pemain;

public class Aplikasi{
  public static void main(String[] args) {
    Batman objek = new Batman();
    objek.namaPemain();
    objek.judulMovie();
    System.out.println(objek.tahunPembuatan());
  }
}
