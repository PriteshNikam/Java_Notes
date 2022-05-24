# Is Java Pass by value & Pass by reference?
## - Java is pass by value.
   - Call by value is nothing but passing the duplicate value not the actual value.
   - eg -
     
         public class Main{
            static void fun(int a,int b){
                 int x = a-10;
                 int y = b-20;
            }
          	public final static void main(String[] args){
		                int x = 10;
	                  int y = 20;
	                  fun(x,y);
		                System.out.printf("%d, %d",x,y);  // value is not changed.
	          }
          } 
     Here main fun x & y are local variable & a & b are instance variable means only for that method.
     
  ## Pass by reference - 
  - here passing reference/address of actual value.
  - because of this value becomes unsecure, because of pointer which stores actual address of variable.
        
        
