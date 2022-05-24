# What is Abstract & Interface ?
->
# Abstract - 
- 1st we need to see what is ahstraction? - 
- Abstraction is a technique by which we can hide the data which is not required to user by which user can only work with required data.
- Two ways to achieve abstraction.
  - 1) abstract class.
  - 2) interface. 

 ## abstract class - 
 - it is declared with abstract keyword.
 - we cannot create object of abstract class.
 - abstract class can have zero or more abstract method.
 
 ## abstract method - 
 - decalred with abstract keyword.
 - donot have body.
 - abstract method cannot be static or private.
 
 ## when to use abstract class -
 - when we need to share some methods to all non-abstract sub class with thier own specific implimentation.
 
 ## when to use abstract method - 
 - when same method has to perform diff. task depending in object calling it.
 - when you need to be overriden in its non-abstract subclasses.
 
# Interface - 
- it is used to achieve abstraction & multiple inheritance.
- it kind of class which contain only constraints & abstract methods.
- cannot create object for interface class.
- method with empty bodies have only abstract methods.
- interface is keyword used to declare class no keyword for method as abstract by default they are abstract(method).
- used to achieve fully abstraction.
- we can achieve the functionally miltiple inheritance.
