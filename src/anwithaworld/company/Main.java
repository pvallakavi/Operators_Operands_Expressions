/*
http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
Summary of Operators:

Simple Assignment Operator
=       Simple assignment operator
Arithmetic Operators
+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators
+       Unary plus operator; indicates
        positive value (numbers are
        positive without this, however)
-       Unary minus operator; negates
        an expression
++      Increment operator; increments
        a value by 1
--      Decrement operator; decrements
        a value by 1
!       Logical complement operator;
        inverts the value of a boolean
Equality and Relational Operators
==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to
Conditional Operators
&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for
        if-then-else statement)
Type Comparison Operator
instanceof      Compares an object to
                a specified type
Bitwise and Bit Shift Operators
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR

String txt = "We are the so-called \"Vikings\" from the north.";

Code	Result
\n	New Line
\r	Carriage Return
\t	Tab
\b	Backspace
\f	Form Feed
*/


package anwithaworld.company;

public class Main {

    public static void main(String[] args) {
        int result = 10;
        result = result + 5;
        System.out.println("result = " + result);
        result = result / 3;
        System.out.println("result = " + result);
        result = result * 3;
        System.out.println("result = " + result);
        result /= 3;
        System.out.println("result = " + result);
        result -= 2;
        System.out.println("result = " + result);

        boolean isAlien = false; //here = is an assignment

        if (isAlien == false) //== is a logical operator
            System.out.println("Not an alien! " + isAlien);

        if (!isAlien) //! is a
            System.out.println("Not an alien! " + isAlien);

        //code block, include in curly brackets
        result = 100;

        if (result < 100) {
            System.out.println("result is less than 100"); //logical and operator = &&,logical or operator is ||
            //& is a bitwise operator
        }

        //ternary operator ?:  shortcut to if-then statement
        boolean wasAlien = isAlien ? true : false;
        if (wasAlien) {
            System.out.println(wasAlien);
        }


    }
}
