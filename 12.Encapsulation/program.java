import data.Mahasiswa;
public class program{
  public static void main (String[]args){
    Mahasiswa objek = new Mahasiswa();
    objek.modifikasiNama("Ardian");
    System.out.println("Nama : "+objek.getNama());
    objek.modifikasiUmur(20);
    System.out.println("Umur : "+objek.getUmur());
  }
}
