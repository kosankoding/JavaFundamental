import data.Movie;
import data.BlackPanther;
import data.Informasi;

public class Aplikasi{
  public static void main(String[] args) {

    //Movie m = new Movie();
    //Movie m = new BlackPanther();
    //m.setJudul("Black Panther");
    //m.genre();
    //System.out.println(m.getJudul());

    //untuk class Informasi
    Movie m = new Movie();
    m.setJudul("StarWars");
    m.setNegara("Amerika");
    m.setTahun(2018);

    Informasi i = new Informasi();
    i.info(m);

  }
}
