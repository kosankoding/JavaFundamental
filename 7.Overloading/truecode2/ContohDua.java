class Hewan {
  public void tamp(String hewan){
    System.out.println("Nama hewan : "+hewan);
  }
  public void tamp(int hewan){
    System.out.println("jumlah hewan :"+hewan);
  }
}

class ContohDua{
  public static void main (String []args){
    Hewan objek = new Hewan();
      objek.tamp(2);
      objek.tamp("Singa");
  }
}
