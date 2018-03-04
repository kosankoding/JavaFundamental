package informasi;
public class Mahasiswa{
  private String nama;
  private String alamat;
  private int umur;
  private String nim;
  private int nilai;
  private String jenisKelamin;
  private boolean lulus;

  public String getNama(){
    return nama;
  }

  public void setNama(String nama){
    this.nama=nama;
  }

  public String getAlamat(){
    return alamat;
  }

  public void setAlamat(String alamat){
    this.alamat=alamat;
  }

  public int getUmur(){
    return umur;
  }

  public void setUmur(int umur){
    this.umur=umur;
  }

  public String getNim(){
    return nim;
  }

  public void setNim(String nim){
    this.nim=nim;
  }

  public int getNilai(){
    return nilai;
  }

  public void setNilai(int nilai){
    this.nilai=nilai;
  }

  public String getJenisKelamin(){
    return jenisKelamin;
  }

  public void setJenisKelamin(String jenisKelamin){
    this.jenisKelamin=jenisKelamin;
  }

  public boolean isLulus(){
    return lulus;
  }

  public void setLulus(boolean lulus){
    this.lulus=lulus;
  }
}
