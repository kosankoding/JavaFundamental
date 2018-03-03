import java.util.*;
class Mobil{
  public void mobil(String warna,int jumlah){
    System.out.println(warna+" "+jumlah);
  }
  public void mobil(int jumlah,String warna) {
    System.out.println(jumlah+" "+warna);
  }
}

class ContohTiga{
public static void main (String [] args){
  System.out.println("Output Program : ");
  Mobil objek = new Mobil();
  objek.mobil (5,"kuning");
}
}
