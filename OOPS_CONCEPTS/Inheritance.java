package OOPS_CONCEPTS;

public class Inheritance {
     //Base class
    //parents class
    class Animal{
        String color;
        void eat()
        {
            System.out.println("eats");
        }
        void  breaths()
        {
            System.out.println("breaths");
        }


    }
    //derived class
    // child class

    class Fish extends Animal{
         int fins;
         void swim()
         {
             System.out.println("Swims");
         }

    }

    public static void main(String args[])
    {
        Inheritance inheritance = new Inheritance();
        Fish sc=inheritance.new Fish();
         sc.eat();
         sc.breaths();
    }

}
