# String - 
- Strings are used to store data of non-primitive type,To make optimized java developers introduced area to store strings.
  1) Heap Memory(normal memory) - *every variable get stored here* 
  2) String pool area(it utilize old strings) - *caching*
  ex - Suppose you store "github" string in it, so it will 1st find "github" in it, if it is alredy present in it, it will not create new String
       it will assign that to current string else it will create new one.
       This makes more optimization.
       
 ## Difference in - 
 - String s = "github";
 - String ss = new String("youtube");
 
 So String s = "github"; can refer to old string where as String ss = new String("youtube"); create new object whether this string exits or not.
