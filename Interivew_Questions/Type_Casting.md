# What is type casting?
->
 - Changing data type of primitive data.
 - process of changing data type to another is known as typecasting.
 
 ## converting char to int ->
 
    1) 
       char ch = '5';
       int a = ch - '0';
     
    2) 
       char ch = '5';
       int a = Integer.parseInt(String.valueOf(ch));
    
    3) 
       char ch = '2';
       int a = Character.getNumericValue(ch);
    
  ## converting char to string ->
  
    1) 
       char c = 's';
       String s = String.valueOf(c);
    
    2) 
      char c = 'M';
      String s = Chararcter.toString(c);
  
  ## converting char to double ->
  
    1) 
     char c = '5';
     double d = (double)(c-'0');
     
     
  ## char to float ->
  
    1)
      char c = '5';
      float f = (float)(c-'0');
      
  ## String to int ->
    
    1)
     String s = "pritesh";
     int i = Integer.parseInt(s);
    
    2) 
      String s = "pritesh";
      int i = Integer.valueOf(s);
   
   ## String to charArray() - >
     
    1) 
     String s = "pritesh"
     char[] ch = s.toCharArray();  // ['p','r','i','t','e','s','h']
   
   ## int to String ->
     
     1) 
       int i = 50;
       String s = String.valueOf(i);
     2) 
      int i = 4;
      String s  = Integer.toString(i);
    3)
     int i = 1;
     String s = String.format("%d",i);
     
   ## int to char ->
   
    1)
      int i=5;
      char c = (char)i;
    
    2)
      int i=2;
      char c = (char)(a+'0'); // if you add '0' to amy char int,float.it fet converted to char.
      
   ## int to float ->
   
    1)
      int i =5;
      float f = (float)i;
      
    2)
      int i=4;
      float f = i;
     
       
       
    
