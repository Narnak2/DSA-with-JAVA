package OOPS_CONCEPTS;

public class constructors {
   static class Student{
        String name;
        int roll;
        Student(String name)//this is OOPS_CONCEPTS.constructors created and this has also value
        {
            this.name=name;
        }
    }
    public static void main(String args[])
    {
        Student p1=new Student("naran");
        System.out.println(p1.name);


/* the type of constructor is
        non parameter
                        copy OOPS_CONCEPTS.constructors*/
    }
}

