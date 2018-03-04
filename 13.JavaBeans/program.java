import informasi.Mahasiswa;
public class program{
  public static void main(String [] args){
    Mahasiswa objek = new Mahasiswa();
    objek.setNama("Ardian");
    System.out.println(objek.getNama());
    objek.setAlamat("Jln Cipadung");
    System.out.println(objek.getAlamat());
    objek.setUmur(20);
    System.out.println(objek.getUmur());
    objek.setNim("1157050141");
    System.out.println(objek.getNim());
    objek.setNilai(100);
    System.out.println(objek.getNilai());
    objek.setJenisKelamin("Laki-Laki");
    System.out.println(objek.getJenisKelamin());
    objek.setLulus(false);
    System.out.println(objek.isLulus());
  }
}
