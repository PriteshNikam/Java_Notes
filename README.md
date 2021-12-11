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
 - Abstract class & interface are used to achieve abstraction.
 - - It is technique by which we can hide the data which is not required to user by which user can only work with required data.
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










