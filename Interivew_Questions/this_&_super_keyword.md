# Q. What is this & super keyword?
->
 - Both this & super keyword is used in constructor chaining to call another constructor.
 - If we use them inside constructor then this & super must be 1st statement otherwise compiler will complain.
 - this is used to invoke another constructor in same class.
 - super is used to invoke another constructor in other class.
 
       class A{
           A(){  // this is default constructor.
             System.out.println("A no argument constructor");
           }
           A(String arg){
             System.out.println("A one arg constructor");
           }
       }
       class B extends A{
           B(){
             this("");  // call one argument constructor in class B.
             System.out.println("B no argument constructor");
           }
           B(String arg){
             super("");  // call one argument constructor of class A.
             System.out.println("B one arg constructor");
           }
       }
       public class Main{
       public static void main(String[] args){
           B b = new B();
        }
       }
       
      Output - 
      - A one arg constrcutor
      - B one arg constructor
      - B no arg constructor
