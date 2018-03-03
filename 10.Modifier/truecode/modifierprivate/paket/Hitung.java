//class satu hitung
public class Hitung{
  private static int a,b,c,d,e,f,g,h,i,j;
  private static int hasil;
  public static void main (String []args){
    c=2;d=3;e=4;f=5;
    System.out.println(hitungan(c,d,e,f));

    //coba ambil data dari luar class
    Hitungan objek = new Hitungan();
    System.out.println(objek.hitungan());
  }

  private static int hitungan(int g,int h,int i,int j){
    hasil = a+b+c+d;
    return hasil;
    }
}
