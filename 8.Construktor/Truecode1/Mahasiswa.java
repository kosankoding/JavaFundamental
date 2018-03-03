class Mahasiswa{
  Mahasiswa(){
    System.out.println("Mahasiswa Pertama");
  }

  Mahasiswa(String nim, String alamat ){
    System.out.println("Mahasiswa kedua");
    System.out.println(nim+" "+alamat);
  }

  Mahasiswa(String nim, char jk){
    System.out.println("Mahasiswa ketiga");
    System.out.println(nim+" "+jk);
  }
}
