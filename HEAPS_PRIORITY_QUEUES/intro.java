package HEAPS_PRIORITY_QUEUES;


import java.util.Comparator;
import java.util.PriorityQueue;

public class intro {
    static class Student implements Comparable<Student>{ //overriding Function
        String name;
        int rank;
        public Student(String name,int rank)//Constructor
        {
            this.name=name;
            this.rank=rank;
        }
        @Override//Function Overriding
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }

    }


    public static void main(String[] args) {
        // reverse of logic , comparator.reverseOrder()

        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A",4));//O(logn)
        pq.add(new Student("B",5));
        pq.add(new Student("C",3));
        pq.add(new Student("D",23));
        pq.add(new Student("E",1));

        while (!pq.isEmpty())
        {
            System.out.println(pq.peek().name+ "-->>>>"+pq.peek().rank);
            pq.remove();
        }




    }
}
