import informasi.Kampus;
import informasi.Kampus.*;
public class program{
  public static void main(String [] args){
    Kampus objekUtama = new Kampus();
    Dosen objekInnerDosen = objekUtama.new Dosen();
    Mahasiswa objekInnerMahasiswa = objekUtama.new Mahasiswa();

    System.out.println("Dosen");
    objekInnerDosen.setNama("Ardian");
    System.out.println(objekInnerDosen.getNama());
    objekInnerDosen.setNIP("1234567890");
    System.out.println(objekInnerDosen.getNIP ());
    System.out.println();
    System.out.println("Mahasiswa");
    objekInnerMahasiswa.setNama("Rifqi");
    System.out.println(objekInnerMahasiswa.getNama());
    objekInnerMahasiswa.setNIM("0987654321");
    System.out.println(objekInnerMahasiswa.getNIM());
  }
}
