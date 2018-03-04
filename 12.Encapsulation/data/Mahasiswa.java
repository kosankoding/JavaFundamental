package data;

public class Mahasiswa{
  private String nama;
  private int umur=0;

  public String getNama() {
    if (this.nama==null){
      System.out.println("Nama Belum diisi");
    }
    return this.nama;
  }

  public void modifikasiNama(String nama){
    this.nama=nama;
    if(nama.isEmpty()){
      System.out.println("Nama yang diinputkan kosong");
    }
  }

  public int getUmur() {
    if (this.umur==0){
      System.out.println("Umur Belum diisi");
    }
    return this.umur;
  }

  public void modifikasiUmur(int umur){
    this.umur=umur;
  }
}
