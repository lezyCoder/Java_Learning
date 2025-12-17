# What is functions ?

Functions are the block of code which are use to perform certain task. It can also be called as reusable code because once it is created then it can be used anywhere and anytime.

# Types of Functions

In Java, there are two categories of functions available, and they are:

**Built-in Functions :** These functions are predefined, and we can use them any time we want in our Java program. For example <span style="color:#7107daff">pow(), sqrt(), min(), etc</span>.

**User Defined Functions :** These functions are defined or created by the programmer for performing a specific task in a program.

# Types of User defined Functions

User defined functions can be divided in two ways -:

**Void Function** - This type of function does not return any value or result to the caller program (program that calls the function). To create void function we have to used the keyword void as per the syntax given below.

```
Syntax of Creating a Void Function

public static void function_name(parameters)
{
    statement 1;
    statement 2;
    ...
}
```

**Return Type Functions** - This type of function returns the value or result to the caller program (the program that calls the function). The function return type can be int, float, double, char or any other type depends on the requirement.

```
Syntax of Creating a Return Type Function
public static return_type function_name(parameters)
{
    statement 1;
    statement 2;
    ...
    return result:
}
```

# Formal and Actual Arguments
The arguments or parameters used during function declaration within the round brackets ( ) are known as Formal Arguments. Whereas the arguments or parameters that are used when providing input to the function from the main program are known as Actual Arguments. Let's see an example for more understanding.


```

import java.util.Scanner;

public class Example
{
    public static float simpleinterest(int p,float r,int t)
    {
        float si;
        si=(p*r*t)/100;
        return si;
    }

    public static void main(String args[])
    {
        int principal,time;
        float rate,interest;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        principal=sc.nextInt();
        System.out.print("Enter yearly rate %: ");
        rate=sc.nextFloat();
        System.out.print("Enter time in year: ");
        time=sc.nextInt();
        interest=simpleinterest(principal,rate,time);
        System.out.println("Simple Interest = " + interest);
    }
}

```

In the above program, variable p, r and t in function simpleinterest() are used to receive inputs from the main program, so these variables are known as Formal Argument.

The variables principal, rate and time used in the main program to provide inputs to the function simpleinterest() are known as Actual Arguments because they provide the actual inputs to the function simpleinterest().