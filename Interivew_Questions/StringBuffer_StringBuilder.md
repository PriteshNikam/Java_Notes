# Q. What is StringBuffer & StringBuilder?
->
  ## StringBuffer - 
  - it is synchronized(thread safe).
  - It means two threads cannot call the method of StringBuffer simultaneously.
  
  ## StringBuilder - 
  - it is non-synchronized(not thread safe).
  - It means two thread can call methods of StringBuilder simultaneously.
  
  ### StringBuffer is less efficient than StringBuilder becacuse StringBuffer is synchronized.
  
    int a = 12345;
    StringBuffer sb = new StringBuffer(String.valueOf(a));
    sb.reverse();
    System.out.println(sb); // 54321
    
    //same syntax for StringBuilder.
    //String.valueOf() because StringBuffer & StringBuilder accept String only.
    
   ## some extra methods - 
   - sb.setCharAt(o,'d'); // to change char at index 0.
   - sb.insert(2,'y'); // to insert char at index 2.
   - sb.deleteCharAt(2); // to delete char at index 2.
   - sb.append('a'); // to add char at last.
