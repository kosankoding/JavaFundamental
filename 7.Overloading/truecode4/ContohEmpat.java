class ContohEmpat{
  //Tipe Data Promotion
   void disp(int a, double b){
	    System.out.println("Singa");
   }
   void disp(int a, double b, double c){
	    System.out.println("Buaya");
   }

   //Jika dihapus akan Pindah Ke Singa
   void disp(int a, float b){
     System.out.println("Kuda");
   }

   //jika ini di buka maka akan salah
   // void disp(int a, double b){
   //   System.out.println("Panda");
   // }

    public static void main(String args[]){
    	ContohEmpat obj = new ContohEmpat();
    	obj.disp(100, 20.67f);

   }
}

// Tipe data yang dapat di Promosi :
// byteshort int long
// short int long
// int long float double
// float double
// long float double
