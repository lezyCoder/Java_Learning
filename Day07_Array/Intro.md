# Java Arrays Introduction

## What is an Array?

An array is a collection of elements of the same data type stored in contiguous memory locations. It allows you to store multiple values in a single variable.

## Array Declaration and Initialization

### Syntax
```java
// Declaration
dataType[] arrayName;

// Declaration and Initialization
dataType[] arrayName = new dataType[size];
dataType[] arrayName = {element1, element2, element3};
```

### Example
```java
// Integer array
int[] numbers = new int[5];
int[] scores = {85, 90, 78, 92, 88};

// String array
String[] names = {"Alice", "Bob", "Charlie"};

// Double array
double[] prices = new double[3];
```

## Common Array Methods

### 1. Accessing Elements
```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[0]); // Output: 10
System.out.println(arr.length); // Output: 4
```

### 2. Iterating Through Arrays
```java
int[] arr = {1, 2, 3, 4, 5};

// For loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for loop
for (int num : arr) {
    System.out.println(num);
}
```

### 3. Array Sorting
```java
import java.util.Arrays;

int[] arr = {5, 2, 8, 1, 9};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [1, 2, 5, 8, 9]
```

### 4. Finding an Element
```java
import java.util.Arrays;

int[] arr = {10, 20, 30, 40};
int index = Arrays.binarySearch(arr, 30);
System.out.println(index); // Output: 2
```

### 5. Copying Arrays
```java
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, original.length);
```
## Array Utility Functions

### 1. Arrays.fill()
```java
import java.util.Arrays;

int[] arr = new int[5];
Arrays.fill(arr, 10);
System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
```

### 2. Arrays.equals()
```java
import java.util.Arrays;

int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2)); // true
```

### 3. Arrays.toString()
```java
import java.util.Arrays;

int[] arr = {5, 10, 15, 20};
System.out.println(Arrays.toString(arr)); // [5, 10, 15, 20]
```

### 4. Arrays.asList()
```java
import java.util.Arrays;

String[] arr = {"a", "b", "c"};
List<String> list = Arrays.asList(arr);
```
## Passing Arrays to Functions

### Syntax
```java
// Function that accepts an array
returnType functionName(dataType[] arrayName) {
    // Function body
}
```

### Example
```java
public static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.println(num);
    }
}

public static int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}

// Calling the functions
int[] numbers = {10, 20, 30, 40};
printArray(numbers);      // Prints each element
int total = sumArray(numbers); // Returns 100
```

### Important Notes
- Arrays are passed by reference, so modifications inside the function affect the original array
- You can pass arrays of any size to a function
- Array parameters can be used with variable-length argument lists (varargs)

### Varargs Example
```java
public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

// Can pass any number of arguments
System.out.println(sum(5, 10, 15));        // Output: 30
System.out.println(sum(1, 2, 3, 4, 5));   // Output: 15
```