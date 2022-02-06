# Java_Coding_Questions
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
   
   ## Valid & array declaration -
    int a[] = new int[5];  
    int a[][] = new int[2][2];
     
