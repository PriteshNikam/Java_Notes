# Q. What is Overloading & Overriding?
-> 
 ## Overloading - (Static binding) 
 - Occurs during compile time.
 - it is faster because they are bonded during compile time & no check or binding is required during runtime.
 - two overloaded methods must have difference signature(arguments) name should be same.
 - What does signature means? -
   - no. of arguments to a method.
   - type of arguements to a method.
   - order of arguments to a method.
   - return type of method is not part of signature.
 
 ## Overriding - (Dynamic binding)
 - you can only override method in subclass, you cannot override method in same class.
 - Name & signature must be same in super & subclass.
 - if overriden method is protected then the overriding method can be protected or public.
 - you cannot override private,static & final because they are bonded during complie time.
 
# *Note - 
can you overload static method?
->
 - YES, because overload is static binding.

*can you override staitc method?
-> 
 - NO, because override is dynamic binding.*

*Can you overload & override main method?
-> 
- main() method is special method because it is the entry point of code.
- YES, you can overload main method but JVM always call original method.
- NO, you cannot override main method because main method is static method.
  
