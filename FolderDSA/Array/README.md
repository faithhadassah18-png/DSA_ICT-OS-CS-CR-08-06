PROBLEM DESCRIPTION
This program performs matrix multiplication on two 2x2 matrices. It defines two matrices A and B with predetermined values, displays them to the user, multiplies them using the standard matrix multiplication algorithm where each element in the result matrix is calculated by taking the dot product of corresponding rows from the first matrix and columns from the second matrix, and finally displays the resulting product matrix. The program consists of three main parts: the main method that controls program flow, a multiply function that performs the mathematical calculations using nested loops, and a display function that prints matrices in a readable format.


PSEUDOCODE
START
CREATE matrix A
CREATE matrix B
DISPLAY matrix A
DISPLAY matrix B
FOR each row in matrix A
FOR each row in matrix B
SET result to 0
FOR each number in the row
MULTIPLY and ADD to result
END FOR
END FOR
DISPLAY new matrix
END
