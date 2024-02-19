package OOPS_CONCEPTS;//import OopsinJavaOneshort.getters_setters_this;

public class get {

        class Pen{
            private String Color;
            private int tip;
            String getColor(){
                return  this.Color;
            }
            void setColor(String newColor)
            {
                this.Color=newColor;
            }
            int setTip(int tip){
                return this.tip= tip;
            }
        }
        public static void main(String args[])
        {
//        getters_setters_this outerInstance=new getters_setters_this();
           //OopsinJavaOneshort.getters_setters_this.Pen p1=new OopsinJavaOneshort.getters_setters_this().new  Pen();
            Pen p1=new get().new Pen();
            p1.setColor("yellow");
            System.out.println(p1.getColor());
            p1.setTip(3);




        }
    }


