# Q. What is programming complexity?
-> - It is a term that include many properties of a piece of software,all which affect internal interaction.
   - Complex describe the interactions between a number of enties.As no. of entities increases, the no. of interaction between them would increase.
   ## Time Complexity -
   - Time complexity of algorithm/code is not equal to actual time required to execute a particular code, but the number of times a statment executes.
   
   - 1) Single loop - 
       
         for(int i=1;i<=n;i++){ // n times
             x = y+2;  // constant time = C
         }
      Time complexity ->
                    C * n  // where c is constant so neglect it.
                    O(n)
   - 2) Nested loop - 
        
         for(int i=1;i<=n;i++){  // n times
            for(int j=1;j<=n;j++){  // n times
                x = y+2;  // constant time = C
            }
         }
       Time Complexity ->
                        C * n * n
                        C.n^2  (C is constant)
                        O(n^2)
    - 3) Sequential statements -
           
          a = a+b;  // constant time c1
          for(int i=0;i<=n;i++){  // n times
              x = y+2;  // constant time c2
          }
          for(int j=0;j<=n;j++){  // n times
              a=b+c;     // constant time c3
          }
        Time complexity ->
                         C1+C2.n+C3.n = n+n
                         O(n)
    - 4) If-else statement - 
             
            if(condition){
               // some code// consider time complexity O(n)
            }
            else{
               // some code // consider time complexity O(n^2)
            }
          Time complexity O(n^2)  
          -here in if else loop we take max complexity, because it is possible to run that max complexity code. 
        
      ## O(1) < O(logn) < O(nlogn) < O(n^c) < O(n!)
        
   ## Space complexity -
        - Amount of space required by algorithm/code.
          
              {
                int a,b,c;
                int z = a+b+c;
                return z;
              }
           int = 4 Byte
           So 4 interger no. will take 4 * 4 byte
           = 4 * 4 + 4  (+4 because return z)
           So, 20 Byte.
                        
