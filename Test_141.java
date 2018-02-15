
import java.util.*;




public class Test_141 {

  static int stringIndex = 0;
  
  // add static array lists for function names, and variable names as parameters/ arguements

  public static void main(String[] args) { 
    
    
    String test1 = "    int   square(int)  ;";
    
    String test2 = "char hello(int);";
    
    String test3 = "void hello(int);";
    
    String test4 = "float hello(int);";
    
    String test5 = "double hello(int);";
      
    String test6 = " int square (int k, int), circle(int    radius),box(int), cake(int,int);" ;
    
    boolean tester;
    
    tester = isFuncDec(test1);
    tester = isFuncDec(test2);
    tester = isFuncDec(test3);
    tester = isFuncDec(test4);
    tester = isFuncDec(test5);
    tester = isFuncDec(test6);
    //System.out.println(hey);
    
    return;
  }
  
//  SAMPLES THAT SHOULD WORK
  
//  int square(int);
//  int    square (int);
//  void display();
//  void compute(void);
//  void delete(int);
//  void    delete (   int    );
//  int power(int,int);
//  char toLower (char);
//  char toLower (char), tryAgain();  
//  double squareRoot(float);
//  int gcd(int,int), lcm(int,int);
//  int isPrime(int n), isNotPrime(int);
//  char _isOkay_1();
//  int   bob(),marley();
  
  
// SAMPLES THAT SHOULD NOT WORK
  
// lcm(int factor,int factor);
//  int gcd(int,int), gcd(int,int);
//  Int kek();
//  ints kek();
//  int dingo(ints);
//  int snake(int());
//  int space burrito();
//  char bag(int bag)int pupper; ( no comma and having int again)
//  int int keepo(int int);
//  void faceless(hello);
//  void chicken(int void);
//  void chicken;(int; vo;d);
//  int gre(en)(int chicken);
//  char (jail);
//  char (in t jail);
//  char astronaut)char x(;
//  int what(int(int));
//  char where(int));
//  char nobody;

  
// for(char xd : codestring){
//   System.out.print(xd);
// }  
  
//  PROCEDURE
//   1. USE .TRIM() TO REMOVE LEADING AND TRAILING WHITESPACES
//  
//   2. CHECK IF RETURN TYPE IS VALID (X use startswith ?) (X THEN MAYBE SPLIT THE STRING?,
//                                     after split, use is empty, add to another str array if false?)                                                                                     )
//     
//     2.1 THERE SHOULD BE A SPACE BETWEEN RETURN TYPE AND FUNC NAME, if none return false, otherwise trim
//     
//   3. CHECK AGAIN THAT THE FUNCTION NAME IS NOT A PRIMITIVE DATA TYPE
  
  
// RULES
//  A DATATYPE CAN ONLY BE FOLLOWED BY A SPACE, A COMMA OR A CLOSING PARENTHESIS ')'
//  AN OPENING PARENTHESIS CAN ONLY BE FOLLOWED BY A SPACE OR A DATATYPE OR A CLOSING PARENTHESIS;
//  A CLOSING PARENTHESIS CAN ONLY BE FOLLOWED BY A COMMA OR A SEMICOLON OR A SPACEBAR
  
  static boolean isFuncDec(String bob ){
  
    bob = bob.trim();
    System.out.print(bob);
    
    
    char codestring[] = bob.toCharArray();
    boolean continueFlag = true;
    
    
    // REDEISGN!! USE charAt() FOR STRINGS!!
    continueFlag = isDataType(codestring, stringIndex);
    if(continueFlag == false)
      
      return false;
    
    while(codestring[stringIndex] == ' '){stringIndex++;} // MAKE THIS A FUNCTION OR IMPROVE
    
    
    System.out.println(continueFlag);
    
    
    
    stringIndex = 0;
    return false;
  }
  
  //CHECKS if int, char, double, float or void
  
  //TODO -  make sure checks dont go out of bounds from char array! maybe add another parameter to what to check
  
  static boolean isDataType(char string[], int index){
  
    //int check
    if(string[index] == 'i' && string [index+1] == 'n' 
       && string[index+2] == 't')
      return true;
    
    //char check
    else if(string[index] == 'c' && string [index+1] == 'h' 
            && string[index+2] == 'a' && string[index+3] == 'r')
            
      return true;
    
    //void check
    else if(string[index] == 'v' && string [index+1] == 'o' 
            && string[index+2] == 'i' && string[index+3] == 'd')
            
      return true;
    
    //float check
    else if(string[index] == 'f' && string [index+1] == 'l' 
            && string[index+2] == 'o' && string[index+3] == 'a'
            && string[index+4] == 't')
      return true;
    
    //double check
    else if(string[index] == 'd' && string [index+1] == 'o' 
            && string[index+2] == 'u' && string[index+3] == 'b'
            && string[index+4] == 'l' && string[index+5] == 'e')
      
      return true;
   else
    return false;
  }
  
}
