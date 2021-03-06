# Java_notes_for_Interview_Preparation
This repository contain coding questions and solutions to practice. This may help you for clearing basic concepts of java and will also help you for your interview preparation.

# Java_History
Java was developed by James Gosling & released in 1995, at first it was known as "Oak" afterward developers decided to give it a unique name as "Java".
Java is an island in Indonesia where the first coffee was produced (called Java coffee).

# Java
Java contain three main components - 
  1. Java Development Kit (JDK).
  2. Java Runtime Environment (JRE).
  3. Java Virtual Machine (JVM).

 ### *1) Java Development Kit (JDK)* :
- Collection of all tools used for developing & running java program.
- Provide envirnoment to develop java program.
- JRE to execute java program.
 
 ### *2) Java Runtime Environment (JRE)* :
- It provide Envirnoment to execute java program.

 ### *3) Java Virtual Machine (JVM)* :
- Compiler converts program into machine language which is byte code & JVM provides runtime envirnoment to execute this byte code.
- Here it execute program line by line which is also known as interpreter.

![image](https://user-images.githubusercontent.com/83751098/145342850-ed6599a3-a20a-4a49-9c5b-9c836a588042.png)


### Some important points -   
- Java is Hybrid language which means it is both Compiled & Interpreter language.
- Because converting .java file to .class file, java becomes platform independent which means we could run java code on any machine(Mac, Windows, Linux).


# Object-Oriented Programming(OOPs)
- OOPs is a methodology to design a program using classes and objects.
- Here we create objects to interact with each other to change data in those objects & to work in a way that user want.
- It help developers by allowing code to be easily reused by other part of program.It simplifies software development & maintenance.
- OOPs provides clear structure for program.
- Makes complex code easier, more reliable, more maintainable.
- OOPs languages - C++, Java, Python, Ruby, Perl, PHP.

### Object - 
- Any entity that has state & behaviour is known as object. It can by physical or logical.
- Any object can be defined as instance if class.
- When object is created memory is allocated for it.(takes some space in memory)
- Object can be defined as instance of class.

### Class - 
- Collection of object is called as Class.
- It is logical entity.
- Memory is not allocated when class is created.(donot comsume any space)

### Example for object and class - 
lets consider calculator & it's different operations such as additon, substraction, multiplication & division.
- Here we could see that calculator is class & operations are object, so calculator is collection of objects.

## Four pillars of OOPs -
1. Inheritance
2. Polymorphism
3. Abstraction
4. Encapsulation

### 1) Inheritance - 
 - When one object acquires all properties & behaviours of parent object.
 - It provide code reusability.
 - used to achieve runtime polymorphism (overriding).
 - Example - Human is best example for inheritance because Children acquire properties (colour of hair, height, skin colour) from parents.
 - Types of Inheritance - 
   #### *Single level inheritance -
   
   Here child class gets all methods from single parent class.
   ![image](https://user-images.githubusercontent.com/83751098/145678568-8db93cba-1c74-4f17-8aca-822b324954de.png)

   #### *Multi-level inheritance -
   
   Here child class gets method from its parents classes which is in linear order.
   ![image](https://user-images.githubusercontent.com/83751098/145678576-d065aa4d-36e5-486f-a10f-808a6dc0cfba.png)

   #### *Hierarchical inheritance -
   
   Here different child classes gets methods from common parent class.
   ![image](https://user-images.githubusercontent.com/83751098/145678581-0374049e-c0fa-4f7c-b2de-dca82f280d36.png)

   #### *Multiple inheritance -
   
   java do not support multiple inheritance, child class will get confused to retrive method(common methods) from which parent class.
   In this example common method might be calling function.
   ![image](https://user-images.githubusercontent.com/83751098/145678586-c50f4ed9-4b27-422d-b6cb-39e527d8023e.png)
   
   Notes -
     - Java do not supports *Multiple inheritance*, so for this *Interface* is used to achieve multiple inheritance. (we will see interface in up coming notes)

### 2) Polymorphism - 
 - Here one task is performed in differnet ways.
 - Object is able to perform multiplle tasks.
 - Two types of polymorphism - 
    #### I. *Compile time polymorphism (Static binding) -
      - which method to call is deccided at compile time.
      - Example - Method Overloading.
    #### II. *Runtime polymorphism (Dynamic binding) -
      - Method call is decided by JVm in runtime.
      - Example - Method Overriding.
 - Example - Mobile. It can be used to make call, used as calculator, used as mp3 player, used as video player, etc.
 
 ![image](https://user-images.githubusercontent.com/83751098/145679123-fca06ebc-e1e7-4eec-8b4b-d46d803d3b24.png)


### 3) Abstraction -
 - Hiding internal details & showing functionality is known as abstraction.
 - It is technique by which we can hide the data which is not required to user by which user can only work with required data.
 - Two ways to achieve abstration -
   #### I. *Abstract class.
   #### II. *Interface.
 - Example - Sending message from mobile, user should not worry about backend process he have just type message and click on send button.
           - ATM.

### 4) Encapsulation -
 - Binding or wrapping code & data together into a single unit are known as encapsulation.
 - It helps to keep releated fields & methods together, which makes our code cleaner & easy to read.
 - Helps to control modification of data fields.
 - It also provide data hiding, means not accesable to other class & if then some ristriction such as wirte only or read only by using getters & setters.
 - It helps to decouple components of a system, these decoupled components can be developed, tested & debugged independently & concurrently & any changes in a particular
   component do not have effect on other.
 - public, private, final, static are keywords used for encapsulation.
 - Example - Bag (consist of differnt books)
           - Bank account - your account balance is only visible to you, it's not public.


# Function & Method - 
- Both are same things depend on how we declare & call them.
- They are group of code which need to be used again & again, so we declared them once and call as required.

## Function - 
   - It is nothing but a particular task to be performed when called/invoked.
   - It can be called/invoked without object
   - Java is Object Oriented Programming language so function need to be declared inside the class so it is called as method.
   - In C, Python function can ne declared outside class.
   - Example
      - function(); 
      - fun(x,y); // x & y are arguments. 

## Method - 
   - It is member of class or we could say it is object of class.
   - Method need to be declared inside class so it need object to invoke.
   - Example - 
      - Math.pow(x,y); // x and y are arguments.
      - class.method(a);  // a is argument.

# Naming Convention - 
  - All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
  - After the first character, identifiers can have any combination of characters.
  - A keyword cannot be used as an identifier, because keywords are reserved words for some function.
  - Examples of legal identifiers: age, $salary, _value, __1_value.
  - Examples of illegal identifiers: 123abc, -salary.
  - For *class* Pascal Convetion is used, name should start from a capital case letter and long names should use camel casing. 
    - For example: AddTwoNumbers
  - For *Object* camel case convention is used, name should start from lower case letter and long names should use camel casing. 
    - For example: addTwoNumbers
   
  ### Note - 
  Why do we nedd Naming convention??
  - So basically their are some reserved keyword, so they can't be used again.
  - Make's easy to understand & read code. 


# Data Types - 
1. Primitive data type.
2. Non - primitive data type.

- Java is statical type language, variables must be declared before use.

![image](https://user-images.githubusercontent.com/83751098/146010840-4d607c40-bf2f-49ab-8b10-608ccd7a3247.png)

## *Primitive data types* - 
There are 8 primitive data types. byte, int, short, long, double, float, char, boolean.
- byte -   1 byte is equals to 8 bit.
- short -  1 short is equals to 2 bytes.
- int -    1 int is equals to 4 bytes. 
- long -   1 long is equals to 8 bytes.
- double - 1 double is equals to 8 bytes.
- char -   1 char is equals to 2 bytes.
- boolean - size depend on JVM.

## *Non primitve data types* - 
Array, String, class, interface are non primitive data types.

# Precedence Of Operators -
 - Basically it means giving priority to perform operations on operands.
 Here are some operartor precedence - 
 - Addition(+), Substract(-) has precedence of 11.
 - Multiplication(*), Division(/), Modulus(%) has precedence of 12.
 - Increment(++), Decrement(--) has precedence of 13.
 - Parenthesis (), square bracket [], has presedence of 14.

# Increment & Decrement - 
  ## Increment (++) :
  - Increase value of variable by one.
  - example: i++
       - int a = i++;     // 1st assign value of i to a & then increment the i value by one.
       - int b = ++i;    // 1st increment the value of i by one & then assign to b.
     
  ## Decrement (--) : 
  - Decrement value of variable by one.
  - example: i--
       - int a = j--;    // 1st assign value of j to a & then decrement the j value by one.
       - int b = --j;    // 1st decrement the value of j by one & then assign to b.
 
# String - 
  - Strings are non-primitive data types.
  - Strings are immutable(cannot be changed).
  - " " data written inbetween in this double quotes are considered as String.
  - String pool area is storage area for strings.
  *note - By using some operations string data can be change but it creates new String in memory & assign new edited value.*
  
  ## What is difference in String name = "Vijay"; & String newName = new String("joseph"); 
  --> String are used to store non primitive data types to make optimized java developers introduced area to store Strings which is String pool area.
   ### Heap area - every variable get stored here.
   ### String pool area - it utilize old strings.
   example - suppose you store "Apple", it will 1st find whether same kind of data is present in string pool area or not if yes then it will directly assign old "Apple" address             to new one & if not then create new String of this.
   
      String fruit1 = "Apple";  // stored in heap are.
      
      String fruit2 = new String("Mango");  // stored in String pool area.
      
      So, 
         fruit1 != fruit2  // they are not equal because one is stored in heap area and other in string pool area.(address is not same). 
         fruit1.equals(fruit2) // here they are equal because data is same which is "Apple". 
  
  #### *Note - you can find String operations & programs code in String folder*
   - Java_Coding_Questions/Basic_Codes/String/
  
# Conditional statements - 
## if-else statement - 
   - It check for condition in if statement, if it satisfies that then it execute if block code & if not satisfied then it execute code in else block.
   - If user want multiple checks then simply use else if, you will under this example below.
   
   Syntax 1- 
        
      if(condition){
         // if condition is satisfied then this block code is executed.
      }else{
         //when if condition is not satisfied.
      }
   
   Syntax 2-
       
      if(condition 1){
          // condition 1 is satisfied.
      }else if(condition 2){
          // condition 2 is satisfied.
      }else if(condition 3){
          // condition 3 is satisfied.     
      }else{
          // when all condition are not satisfied.
      }
      
 ## Switch statement - 
   - It is used when user have to make choice between number of alternatives.
   
   Syntax -
      
     switch(expression) {
         case a:
              // block of code
              break;
         case b:
              // block of code
              break;
         default:
              // block of code
        }
     
   - In switch case break keyword is very important because if any case is satisfied then that code block is executed & it should exit after that else it will check for other        cases, for this break keyword is used after particullar code in case.
     
  # Loops - 
   
   ## 1. while loop - 
   - while loop execute block of code till some specific condition is satisfied.
   - In while loop 1st condition is check then code is executed.
   
   Syntax - 
        
        while(condition){
              // block of code
        }
        
   ## 2. do-while loop -
   - It is same as while loop just it executed code 1st and then check for condition, so at least once code is executed.
   
   Syntax - 
       
       do{
         // block of code
       }while(condition)
       
   ## 3. for loop - 
   - In for loop we know how many number of times loop will run, basically here we specify number of times.
   
   Syntax - 
   
     for(initialize; upto; inrement/decrement){
          // block of code
     }
      
   ### for-each loop -
   - for-each loop is used for traverse over a array without initializing & declaring loop counter variable.
   - Here you simply declare a single variable same as array data type and traverse over it.
   - it is commonly used to traverse over a array or collections.
   
   Syntax -
      
       for(data_type var: ar){   // here ar is array and data_type is same as array data_type.
            // block of code 
       }
  
  # Arrray - 
   - It is Collections of simillar type of data.
   - Elements are stored in continious memory location.
   - Array is static( unchangable in size), it means it has fix length.
   - In array we cannot directly add elements, we need to specify index in array.

   ## *3 types declaration of array* - 
   
   1. Here declaration & memory allocation is done at same time.
   
    int[] marks = new int[5];   
   
   2. Here 1st array is declared & after memory allocated.  
     
    int[] marks;
    marks = new int[5];
   
   3. Here declaration,initilization,memory allocation is done at same time.
     
     int[] marks = {1,2,3,4,5};
   
   
   Note - Suppose you want to print array in one line of code then use - 
   Arrays.toString(marks);
    
    example -
      System.out.println(Arrays.to String(marks));
   
   # Multi dimentionla Array - 
   - it is array of array.
   - this type is mainly used for matrix.
   
    example - 
     int[][] mat = new int[3][3]; // it is 2x2 matrix(2D array).
     int[][][] mat2 = new int[3][3][3]; // it is 3x3 matrix(3D array).
   
   ## Valid & invalid array declaration -
    int a[] = new int[5];           // valid
    int a[][] = new int[2][2];      // valid
    int a[][] = new int[3][];       // valid
    int a[][][] = new int[4][3][];  // valid
    int a[][] = new int[][3];       // invalid because you need to 1st declare 1st row size.
    int a[][][] = new int[][2][2];  // invalid 
    int a[][][] = new int[3][][3];  // invalid
    
   # Function, Method & Constructor -  
   
   ## 1. Function -       
   - no need of object to invoke you can simply call function anywhere.   
     ex.- fun(); 
          fun(x,y);
   
   ## 2. Method - 
   - method need object to invoke.
     ex.- class_name.method_name(a,b);
        - Math.pow(x,y);
   
   ## 3. Constructor - 
   - It is used to initialize the instance variables.
   - It has same name as class name.
   - It donot has return type.
   - It is automatically called when object of class is created.
   ## *Types* - 
   1. Default constructor(no parameter) - 
   2. Parametrized constructor - 
   
   ## Constructor Inheritance - 
   - When it comes to inheritate constructor two keywords are mainly used which are this & super.
   - this keyword is used to invoke constructor in same class.
   - super keyword is used to invoke constructor from other class.
   example - 
          
    class Base{
           Base(){// default constructor }
           Base(int a){ // Parameterized constructor}
    }
    class Derived(){
           Derived(){
              // default constructor 
              super(0); // this will invoke Base(int a) constructor.
           }
           Derived(int x,int y){// Parameterized constructor }
    }
           
   ### Notes - 
   - In java method should be inside a class.
   - In C it may be out side of class & called as function.
   - Python is OOP & procedural language so it can hace both fun & method. 
    
    
   # Method Overloading - (Static binding)
   - Methods having same name with different signature in a same class.
   - Signature includes number of arguments, types of arguments, order of arguments, return type is not part of signature.
   - Overloading occures during compile time.
   - It is faster because they are bonded during compile time & no check or binding is required during runtime.
   - example - 
       
         class Calculator{
               public int add(int a,int b){
                    return a+b;   // this fun perform addtion for 2 numbers
               }
               public int add(int x,int y,int z){   // this fun perform addtion for 3 numbers
                    return x+y+z;
               }
         }
         class Main{
            public static void main(String[] args){
                  int a=1;
                  int b=2;
                  int x=3;
                  int y=4;
                  int z=5;
                  Calculator cal = new Calculator();
                  int r1 = cal.add(a,b); // it will call method with 2 parameters.
                  System.out.println(r1);
                  int r2 = cal.add(x,y,z); // it will call method with 3 parameters.
                  System.out.println(r2);
            }
         }
    
   # Method overrinding - (Dynamic binding)
   - Methods having same name & signature in different class.
   - Overrring occurs during runtime.
   - Here we can inherit properties of parent class and can even change them in base class.
   - example - 
           
           import java.util.*; 
           class A{ 
              public void run(){ 
                     System.out.println("1st method of A"); 
              }
              public void speed(){ 
                     System.out.println("2nd method of A"); 
              } 
           } 

           class B extends A{ 
              public void run(){ 
                     System.out.println("overring method of A in B"); 
              } 
              public void slow(){ 
                     System.out.println("2nd method of B"); 
              } 
           } 
           class Main { 
                 public static void main(String[] args) { 
                           A a = new B(); 
                           B b = new B(); 
                           a.run(); // it calls method from base class because it is overridding method.
                           a.speed(); 
                        // a.slow();   // this method has error because it donot exists in class A so it need another objet to invoke. 
                           b.slow(); 
                 } 
           } 

   # Recursion - 
   - Function which calls itself.
   - It has base condition where function get breaked.
   - And if that condition is not statisfied then function call itself again.
   - example - 
            
         public int fun(int n){
          int temp = n;
          if(temp==1){  // base condition.
              return 1;
           }
          return temp* fun(n-1);
         }
    
    
   - Above example is of find factorial of n number by using recursion.
   - Function call it self until base condtion is not satisfied which is (temp == 1). 
   - Until temp becomes 1 function decrease temp value by 1 & multiply with temp.
   - you may refer below video link for better understanding of recursion -
   - https://youtu.be/Mr9MVpSoTGk 
    
   
   # Dynamic Method Dispatch - 
   - One object work for two different class.
   - All methods can be called in super class.
   - Only overriding methods in sub class can be called.
    
   - example - 
        
         class A{
               Method(){
                   // some line of code.
               }
               Method2(){
                   // some line of code. 
               }
         }
         class B extends A{
               Method(){   // overriding method from A.
                     // method can modified from class A.
               }
               Method3{
                     // some line of code.
               }
         }
         
         public class Main{
           public static void main(String[] args){
                  A p = new B();
                  p.method();    // method from class B.(because overriding)
                  p.method2();   // method from class A.
                  p.method3();   // this will throw error because it is not overrinding method. 
           }
         }
    
   # Abstract - 
   - It is used to achieve *Inheritance*.
   - abstract keyword is used to declare class & method as abstract.
   - Abstract class can contain abstract & non-abstract method so that's why anstract cannot be used for 100% abstraction.
   - More suitable for code reusable and evolution prespective.
   - multiple abstract cannot be used to create single class.
   - When we use inheritance we use *extends* keyword.
    
   *abstract method* -
        Method is declared without implementation.
   
   *abstract class* - 
        - Class have abstract methods & it self declared as abstract.
        - it can also have non-abstract method.(complete methods)
         
   - example - 
         
         abstract class Animal{
               
               public abstract color();   // abstract method.
               
               public void type(){       // non-abstract method.
                    System.out.println("Domestic");
               }
         }
         
         class Dog extends Animal{
               public void color(){
                   System.out.println("color of dog is black");
               }
         }
         
         public class Main{
                public static void main(String[] args){
                       Dog d = new Dog();
                       d.color();
                       d.type();
                }
         
         }
      
     
   # Interface - 
   - Java donot supprort multiple inheritance so to achieve this developers introduced interface.
   - This can be used to achieve multiple inheritance & 100% abstraction.
   - 100% abstraction because it interface only has abstract methods.
   - Multiple interfaces can be used to create single class.
   - to achieve interface we use *implements* keyword.
     
   example - 
     
         interface Bike{
                void speedUp();
                void speedDown();
         }
         interface Car{
                void color();
                void name();
         }
         classs Vehicle implements Bike, Car{
                  
                  // here all method declaration should be public.
                  
                  public void speedUp(){ 
                      System.out.println("Increase  speed");
                  }
                  public  void speedDown(){
                      System.out.println("Decrease speed");
                  }
                  public void color(){
                      System.out.println("Color of vehicle is white");  
                  }
                  public void name(){
                      System.out.println("name of car is Bike_Car"); 
                  }
         }
         public class Main{
             public  static void main(String[] args){
                 Vehicle v = new Vehicle();
                 v.speedUp();
                 v.speedDown();
                 v.color();
                 c.name();
             }
         }
   
  # Access Modifiers - 
   - It determine wether other class can use a particullar file or invoke a particullar method.
   - this can be done using keywords such as public,private,protected,defalut(no need to define).
   
   ### private - 
   - access only in particullar class.
   ### protected  - 
   - only in particullar package but can be accessed by using chilg class.
   ### public - 
   - from any where any how you can access.       
   ### default  -
   - can be accessed in class & package but particullar package & class.
          
   ### *Note* -
   -  A class cannot be private or protected except nested class.
   -  outside package you can access protected & public by using subclass(child class).    
    
   # Multithreading - 
   - Multiprocessing & multithreading both are used to achieve multitasking.
   - Thread uses shared memory area.
   - A thread is light weight where as process in heavyweight.
    
    
![image](https://user-images.githubusercontent.com/83751098/169544487-9c689562-ffdb-4938-aa29-a93584cc670d.png)

![image](https://user-images.githubusercontent.com/83751098/169544550-cfefed04-433a-4102-a341-3d49f41793a0.png)

![image](https://user-images.githubusercontent.com/83751098/169544587-9cbf73f3-175b-4085-8106-ba70ce24cd31.png)

![image](https://user-images.githubusercontent.com/83751098/169544643-aed634c0-1b65-4178-bb2c-e867824523ef.png)

    
 ### Thread can be created by two ways - 
   - 1) By extending thread class.
   - 2) By implementing Runnable interface.

![image](https://user-images.githubusercontent.com/83751098/169553617-bf57af26-c92a-4158-b0c5-b7d862c7ffa4.png)


# Error & Exception - 
  ## Errors : 
  - Because of error program behave abnormal, show's error or wrong output.
   
   *Some main types of errors-*
   
   ### Syntax error -
   - Missing things or extra things in code.
   - ex - ;,{,} or extra declaration.
   
   ### Logical error - 
   - Code runs but theirs is some something missing / not running.
   - program get compiled but wrong output.
   - ex - 
       - wrong calculation.
       - bug in software.
   
   ### Runtime error - 
   - Program is correct get compiled but while getting input or input become invalid & program shows error.
   - ex - adittion of two no. & 1st no. is int & 2nd no. is char. 
    
   ## Exception - 
   - An exception is an event that occurs when a program os execited disniting the normal flow of instructions.
   - two types of exception - 
     - 1) Checked Exception (compile time exception)
     - 2) Unchecked Exception (run time exception)
   - Exceptions are handled by using try-catch block.
   
   Syntax - 
   
    try{
      // code which might have error.
    }
    catch(Exception e){
      // if code has error then it will be catched here and programer can handle that error.
    }
       
    
   Example - 
   
    try{
     // code which might have error.
    }
    catch(ArithmeticException e){
       System.out.println(e); // this will print arithmetic exception.
    }
    catch(IndexOutOfBoundException e){
       System.out.println); // this will print IndexOutOfBoundException exception.
    }
    catch(Exception e){  // this will catch any kind of error.
       System.out.println(e); 
    }
     
     
   ## Exception in class - 
   - Here throw keyword is used to throw exception in class to handle the error.
   - ex - 
      throw new MyException();
   - By this you can display what you want when error occurs.

   ### Throw & Throws keyword - 
   ### *throw -*
   - Throw keyword is used when you know some error is gonna occur.
   - So for this you create a class of that Exception which is extends by Exception & you display your exception or own error.
     
    class MyException extends Exception{
       public string toString(){
          return "Radius cannot be neative";
       }
       public String getMessage(){
          return "Radius cannot be negative"; 
       }
    }
    public class Main{
      public static void main(String[] args){
        if(r<0){
           throw new MyException();
        }
        double result = Math.PI*r*r;
        return result;
      }
    }
    
  ### *throws -* 
  - Throws keyword is used to declare an exception this gives info. to prgrammer that there can be exception so it better to be prepared with catch block.
 
 - ex - 
  
        public void Calculate(int a,int b) throws MyEception{
            // code
        }
     
  ### finally block - 
  - it is used when you want to execute particullar block of code at end of code not matters it gives error or not.
  - Syntax - 
    
        finally{
          //code
        }
   - If you donot want to execute finally block use *System.exit(0)* then code gets breaked at that line of code & finally block is not executed. 
    
  
  # Collection Framework - 
  -  A collection represents a group of object collections provide classes & interfaces for us to be able to write data quickly & efficiently.
  
  *Why we need collection?*
  -> We need collection for efficent storage & better manipulation of data in java.
  ex - 
    we use array to store data, but what if we want to - 
     - resize array?
     - insert element?
     - delete element?
     apply certain operartions to change?
   - So that's why we use collection framework.
   - Collections are available as classes & interface.
  
  - commonly used collections in java ->
    - Array list - for variable size collection.
    - Set - for distinct collection.
    - Stack - A LIFO data structure.
    - hash Map - for storing key-value pairs. 
  
  - Collection is available in java util package(import java.util.Collection).
  - It also provides some static methods for sorting,Searching, etc.
  
  ![image](https://user-images.githubusercontent.com/83751098/169748091-68db5857-1a97-4355-bb7f-e93a6cb70797.png)
  ![image](https://user-images.githubusercontent.com/83751098/169748116-6eb39c9f-ca4e-4738-a143-46f0bdfb598c.png)
  ![image](https://user-images.githubusercontent.com/83751098/169748133-0bdf4aec-821d-4aed-8aa2-7ac4205ee906.png)
  ![image](https://user-images.githubusercontent.com/83751098/169748176-96772b29-6be2-46ec-8dfa-a3f59445a600.png)

 ### Below are mostly used collections in competitive coding and interview perspective -
  ## ArrayList - 
  - import java.util.ArrayList;
  - Elements are stored in contiguous location.
  - You could directly access elements.
  - ArrayList size incerease by 1.5 times.
  - better to access data with O(1) time complexity.
  ![image](https://user-images.githubusercontent.com/83751098/169748600-be77be4e-75d4-460d-b173-97bc37e89c2b.png)

  - Syntax - 
    
        ArrayList<Integer> ar = new ArrayList<>();
  - Data type can be of Float,Boolean,String.
  - This data type declaration is known as generics, if this is not decalred then that ArrayList can store any kind of data.
  - Syntax - 
       
        ArrayList<> ar = new Aarraylist<>();
  - But this can give many problems, so generics are important.
  
  ## LinkedList -
  - import java.util.LinkedList;
  - Elements are not store in contiguous location.
  - Element have data & address part.
  - To access element need to traverse from 1st node.
  - deletion & insertion is fast.
  - Better to manipulate data.
  - To access element time complexity O(n/2).
  
![image](https://user-images.githubusercontent.com/83751098/169750525-6e53ef9d-e37d-4ed2-9d16-b70ffe775198.png)

  - Syntax - 
     
        LinkedList<String> l = new LinkedList<>();
  
   ## Vector - 
   - Same as ArrayList, but it is Synchronized.
   - Methods are synchronized which means suppose add method is executed on vector V by a thread 1 then it is locked, so other threads are not able to perform 
     add function until thread 1 has completely executed it. 
   - By this we could say vector is thread safe.
   - Syntax - 
       
         Vector<Float> V = new Vector<>();
  
   ## Stack - 
   - It is Last In First Out(LIFO).
   - it extends vector.
   
   ![image](https://user-images.githubusercontent.com/83751098/169748929-8ce69f4c-1541-4984-a358-5d4b1a070a83.png)

   - *Methods of stack -*
      - push(); -> to add element.
      - pop(); -> to delete element.
      - peek(); -> return top element/head/last element added.
      - search(); -> to search element in stack.
      - empty(); -> to check stacj is empty or not.
    
   ## Queue -
   - It is First In First Out(FIFO).
   
![image](https://user-images.githubusercontent.com/83751098/169750258-6d7d6757-5442-4bc6-b2d3-6557400a1646.png)

   - *Methods of Queue ->*
       - *Throw exception ->* 
        - add(); ->  add element.
        - remove(); -> delete element.
        - element(); -> to see head.
       - *return false/null methods ->*
        - offer(); -> to add element.
        - poll(); -> delete 1st element.
        - peek(); -> to see head.
    
   ## ArrayDeque - 
   - Array double ended queue.
   - It allows to add or remove an element from both sides.
   - This implement queue.
   - So if we use other methods it behave like queue.
   - Faster than stack because it is not synchronized.
   
![image](https://user-images.githubusercontent.com/83751098/169750156-6da26b6d-4931-4b2b-b313-afde87724899.png)

   - *methods of ArrayDeque ->*
     - addFirst(); -> add from front.
     - removeFirst(); -> remove from front.
     - getFirst(); -> see 1st element from front.
     - addLast(); -> add from rear.
     - remove(); -> remove element from rear.
     - getLat(); -> see 1st element from rear.
    
   ## Priority Queue -
   - Here every element is provided with priority.
   - If priority of element are same then they are served as queue.
   - Here element with highest priority is removed 1st.
   - When data is added such as String,char,int etc in priority queue it donot maintain inserting order & when you remove element from it,
     it removes according order(chronological order).
   - This happens because predefined comparator in priority queue.
   - To remove element according to user need to define comparator.
   
![image](https://user-images.githubusercontent.com/83751098/169750019-26af97e5-5601-4899-86f7-4aea3ecefc12.png)

   ## Set Interface - 
   - Donot allowed duplicate value.
   - Constant time for insertion & delection.
   - here insertion & delection is constant time.
   - *Methods of Set ->*
     - add(ele);
     - addAll(Collection);
     - remove(ele);
     - removeAll();
     - clear();
     - size();
     - contains();
     - containsAll();
     - isEmpty();
     - toArray();
     
   ## HashMap -
   - It contains two elements one is key other is value.
   - Syntax - 
       
         Map<Integer,Integer> map = new HashMap<>();
         
         Map<String,Integer> map2 = new HashMap<>();
   
   ![image](https://user-images.githubusercontent.com/83751098/169749360-7428e000-0ffb-453f-8d42-c2783a7ce95d.png)
     
  - methods in HashMap - 
    - put(key,value);
    - putAll();
    - putIfAbsent(key,value);
    - get(k);
    - getOrDefault(key,DefaultValue);
    - containsKey(key);
    - containValue(value);
    - replace(key,value);
    - replace(key,oldValue,newValue);
    - remove(key);
    - remove(key,value);
    - clear();
   
        
        
