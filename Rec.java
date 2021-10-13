interface Drawable
{
  void print();
}

interface printable
{
  void print();
}

class Rec implements Drawable,printable
{
 public void print()
{
 System.out.println("Drawing Rectangle");

}

public static void main(String args[])
{
 Rec r=new Rec();
 r.print();
 


}
}