package p2;
import p1.A;

class D extends A
{
  D()
  {//javac implicitly invokes a  default super cls constr : super();
     System.out.println("D 's state "+i+" "+j+" "+k+" "+l);
  }
}