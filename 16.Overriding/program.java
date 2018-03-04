import informasi.*;
public class program{
  public static void main(String[]args){
    Anak objekAnak = new Anak();
    Keluarga objekKeluarga = new Keluarga();

    System.out.println("Anak");
    objekAnak.alamat();
    objekAnak.tempatLahir();
    System.out.println();
    System.out.println("Keluarga");
    objekKeluarga.alamat();
    objekKeluarga.tempatLahir();
  }
}
