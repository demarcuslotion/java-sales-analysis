# Sales Analysis (Progression 1 -  Design)

## Problem Description 
The purpose of this program is to find the consecutive period of months with the highest combined sales change. 
This program will examine the company's monthly sales data to determine which period has the greatest overall increase in sales. 

The program receives monthly sales data from January through December. 
Each month has a numerical value that represents either an increase or decrease in sales compared to the previous year. 
Positive numbers represent increases, while negative numbers represent decreases. 

The program should display the starting month and ending month of the consecutive period with the highest combined sales change. 
It should also display the total sales change for that period in millions. 

## Data Design 
The program will use two parallel arrays to organize the monthly sales data. The first array will be a String array that stores
the month names from January through December. The second array will be a double array that stores the sales change for each month. 
Both arrays will use the same index to connect each month with its corresponding sales value.

The program will use currentTotal to keep track of the combined sales change for the period currently being examined. 
The bestTotal variable will store the highest combined sales change found so far. 

Two more variables, bestStart and bestEnd, will store the starting and ending indices of the best consecutive period. These indices will
allow the program to display the corresponding month names. 

If two periods have the same highest total, the program will keep the first period found rather than replacing it with the second. 

## Program Organization
The program will be divided into separate methods, with each method responsible for a specific task.

The main() method will be responsible for organizing the program and calling the other methods needed to analyze the sales data and display the results. 

The analysis method will examine different consecutive periods, calculate their combined sales changes, and keep track of the highest total. It will also
remember the starting and ending indices of the best period. 

The display method will print the results, including the starting month, ending month, and highest combined sales change. 

## Program Flow 
Start --> Create the month and sales arrays --> Examine consecutive periods --> Calculate their combined sales changes --> Compare totals --> Store the best period --> Display the results --> End 
