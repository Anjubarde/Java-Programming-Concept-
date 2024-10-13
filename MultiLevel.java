
class Base
{
    public int A,B;

    public Base()
    {
        System.out.println("Inside Base Constructor");
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base        // class Derived : public Base (C++)
{
    public int X,Y;

    public Derived()
    {
        System.out.println("Inside Derived constructor");
    }
    public void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class DerivedX extends Derived 
{
    public int P,Q;

    public DerivedX()
    {
        System.out.println("Inside DerivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}

class MultiLevel 
{
    public static void main(String srgs[])
    {
        DerivedX dobj = new DerivedX();

        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
    }    
}
