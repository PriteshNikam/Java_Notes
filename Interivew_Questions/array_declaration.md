# Valid Array declaration - 
- int a[] = new int[5]; // valid
- int a[][] = new int[3][3];  // valid
- int a[][] = new int[3][];  // valid
- int a[][] - new int[][3];  // not valid
- int a[][][] = new int[3][3][3]; // valid
- int a[][][] = new int[][3][3];  // not valid
- int a[][][] = new int[3][3][]; // valid
- int a[][][] = new int[3][][3]; // not valid
