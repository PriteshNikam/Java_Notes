# Important concept you should know -

### * Concrete method - 
 - method which always has body.
 - complete method in java.

### * Can code get executed without main method in java?
 -> Without main method code will get compiled with no error, but it will show runtime error that main method donot includes.
 
### * What is dimond problem?
 -> Suppose two precents class have same method M1 & this both class are extended by one child class(this type of extends is not possible),
 then it will get confused that from which parent class method to be executed/implemented.
 
 ### * Why we cannot delete element from array?
  -> We know array is static & we cannot change size of array.
     you can replace zero at that position or simply create new array & add all elements from 1st array other then element you donot want.
 
 ### * What is vargs?
  -> Allows you to pass number of arrguments.
  
### * What is operand stack(OS) -
 -> JVM uses operand stack as workspace like rough work.
 
### * What is Time complexity of Array.sort(ar); & which algorithm is used for it?
 -> Time complexity is O(nlogn)
    Aalgorithm is Dual piot Quick sort which is faster than one pivot quick sort algorithm.
    
### * BufferReader & Scanner -  
   ### BufferReader -
   - can only read string using readline()
   - It is synchronnized.
   - eg - 
          InputStreamReader i = new InputStreamReader(System.in);
          BufferReader b = new bufferRreader(i);
          String s = b.readline();
   ### Scanner - 
   - It can parse userr input & read primitive data type.It can also read string.
   - Buffer size is 1KB.
   - It uses regular expression to read & parse primitive nextInt(), nextLong(), nextDouble(), nextFloat()
   - It is not synchronized.
   - eg - 
           Scanner s = new Scanner(System.in);
 
 ### * Why java is not 100% object oriented?
  ->
   - Because, we use primitive data types.
   - Which are byte, short, int, long, double, float, char, boolean.
   - We can make 100% object oriented programming in java by using wrapper classes
   - eg - 
   - 1) int a = 10;  to   Integer a = 10;
   - 2) double d = 20.0;   to  Double d = 20.0;          
  
 ###  * Difference in == & equals()?
  ->
   - equals() compare data.
   - == compare reference.
           
