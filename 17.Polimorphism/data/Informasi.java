package data;

public class Informasi extends Movie{
  public void info(Movie m){
    System.out.println(m.getJudul());
    System.out.println(m.getTahun());
    System.out.println(m.getNegara());
  }
}
