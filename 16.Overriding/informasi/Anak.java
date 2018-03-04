package informasi;
public class Anak extends Keluarga{

  public void alamat(){
    System.out.println("Bandung");
  }

  public void tempatLahir(){
    super.tempatLahir();
  }
}
