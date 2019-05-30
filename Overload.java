package polymorphism;
class Overload{
  void sum(int a,int b)
  {
     System.out.println(a+b);
  }
  void sum(double a,double b,double c){
     System.out.println(a+b+c);
   }
  void sum(double a,double b){
	     System.out.println(a+b);
  }

  public static void main(String args[]){
  Overload ov=new Overload();
  ov.sum(11,34,99);
  ov.sum(12.4,4.9);
  ov.sum(2.3, 4.5);

  }
}
