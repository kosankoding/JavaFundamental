class TampilMethod
{
    public void tamp(char karakter)
    {
         System.out.println(karakter);
    }
    public void tamp(char karakter, int number)
    {
         System.out.println(karakter + " "+number);
    }
    public void tamp(char karakter, int number,float desimal)
    {
         System.out.println(karakter + " "+number +" "+desimal);
    }
}
class ContohSatu
{
   public static void main(String args[])
   {
       TampilMethod objek = new TampilMethod();
       objek.tamp('F');
       objek.tamp('A',1);
       objek.tamp('D',1,3.5f);
   }
}
