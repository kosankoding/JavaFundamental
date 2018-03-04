package informasi;
public class Kampus{
  public class Mahasiswa{
    private String nama;
    private String NIM;

    public String getNama(){
      return nama;
    }

    public void setNama(String nama){
      this.nama=nama;
    }

    public String getNIM(){
      return NIM;
    }

    public void setNIM(String NIM){
      this.NIM=NIM;
    }
  }

  public class Dosen{
    private String nama;
    private String NIP;

    public String getNama(){
      return nama;
    }

    public void setNama(String nama){
      this.nama=nama;
    }

    public String getNIP(){
      return NIP;
    }

    public void setNIP(String NIP){
      this.NIP=NIP;
    }
  }
}
