package paket;
public class DataMahasiswa{
  String nama;
  int nim;
  String kelas;
  public void data (String nama,int nim,String kelas){
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    System.out.println(nama+" "+nim+" "+kelas);
    this.dataTambahan();
}
    public void dataTambahan(){
      System.out.println("Menjalankan Data Tambahan");
    }
  }
