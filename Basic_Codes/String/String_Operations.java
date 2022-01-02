// Here you will learn some basic operation on string.
// all operations are performed in System.out.println(); because when you execute this code it will print result so you will understand how it works.

public class String_Operations {
    public static void main(String[] args)
    {
        String name="Pritesh";
      
        System.out.println(name);                         //simply print string.
        System.out.println(name.length());               //print length of string.
        System.out.println(name.toLowerCase());         //convert each char into lower case.
        System.out.println(name.toUpperCase());        //convert each char into upper case.
        System.out.println(name.trim());              //remove leading & trailing spaces from string.
        System.out.println(name.substring(2));       //print's string from index 2.
        System.out.println(name.substring(2,4));    //print's index from index 2 to 4.
        System.out.println(name.replace("r","p"));       //replace char "r" with "p".
        System.out.println(name.replace("esh","hse"));  // replace "esh" with "hse"
        System.out.println(name.startsWith("pri"));                    // return true if string starts with "pri" else false.
        System.out.println(name.endsWith("esh"));                     // return true if string ends with "esh" else false.
        System.out.println(name.charAt(5));                          //prints char at index 5 from string.
        System.out.println(name.indexOf("s"));                      //prints index ff "s" from string.
        System.out.println(name.indexOf("e",2));       //print index of e search after 2 index ignore before char.
        System.out.println(name.lastIndexOf("s"));             //print index of "s" where it last occured.
        System.out.println(name.equals("Pritesh"));              //check string is equal or not by returning true or false.
        System.out.println(name.equalsIgnoreCase("pritesh"));  //check string is equal or not by ignore lower and upper case.

        /**************************************************************/
        // you can also do this by assigning to a value.
        //Example--
        String s=name.toUpperCase();
        System.out.println(s);

    }
}

