
class Arithematic
{
    public int No1;
    public int No2;
    
    public Arithematic() // constructor 
    {
        System.out.println("Inside default Constructor ");
    }

    public Arithematic(int A, int B)
    {
        System.out.println("Inside parameterised constructor"); // SOP
        this.No1 = A; // Without this it can work 
        this.No2 = B;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }

    public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
}

class Encapsulation
{
    public static void main(String meow[])
    {
        System.out.println("Inside main function");

        Arithematic aobj1 = new Arithematic(); // new use for dynamic memory allocation 
        Arithematic aobj2 = new Arithematic(11,10);

        int Ret = 0; // Gharchi Pishavi 

        Ret = aobj2.Addition();
        System.out.println("Addition is :"+Ret); // + --> concatination 

        Ret = aobj2.Substraction();
        System.out.println("Substraction is :"+Ret);

    }
}