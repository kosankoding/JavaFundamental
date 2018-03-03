import paket.MethodStatic;
public class TentangStatic{
    public static String nama ="fadil";
    public static double nim =115094;
    public static String kelas ="Kelas A";
    public static void main(String [] args ){

    //object Biasa
    String alamat;
    alamat="kuningan";
    MethodStatic objek = new MethodStatic();
    objek.DataAlamat(alamat);

    //object Dengan Static
    MethodStatic.DataDiri(nama,nim,kelas);
  }
}
