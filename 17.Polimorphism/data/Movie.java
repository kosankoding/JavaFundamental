package data;

public class Movie{
  private String judul;
  private int tahun;
  private String negara;


  public void genre(){
    System.out.println("Comedy");
  }
  

  public String getJudul(){
    return judul;
  }

  public void setJudul(String judul){
    this.judul = judul;
  }

  public int getTahun(){
    return tahun;
  }

  public void setTahun(int tahun){
    this.tahun = tahun;
  }

  public String getNegara(){
    return negara;
  }

  public void setNegara(String negara){
    this.negara = negara;
  }


}
