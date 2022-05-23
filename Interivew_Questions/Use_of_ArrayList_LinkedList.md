# Q. What is use of Arraylist & LinkedList?
->
   ## Common things in ArrayList & LinkedList - 
   - both implements list interface.
   - both are not synchronized (cannot share single list for multiple threads).
   - both are ordered collection.
   - eg . maintain insertion order of elements.
   - both allows duplicate,null values / elements.
   
   ## ArrayList - 
   - It is better to access data.
   - it has O(1) time complexity to access element via get and set methods.
  
  ## LinkedList - 
  - It is better to manipulate data.
  - it provide constant time for ass & remove operation.
  - it has O(n/2) time complexity to access element.
  - LinkedList also implements Dequeue interface (FIFO).
  
  *Note-*
     *- ArrayList O(1) & LinkedList O(n/2) because in ArrayList get(index), gives element by index no & in LinkedList need to traverse to that point.*
