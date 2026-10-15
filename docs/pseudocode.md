# Sales Analysis (Progression 2 - Pseudocode)

Start the program. 

Access the arrays containing the months and their sales changes.

Set bestTotal to the first month's sales change.

Set bestStart and bestEnd to index 0.

Begin with January as the starting position. 

Use an outer loop to examine each starting month from January to December. 

Set currentTotal to 0 for the selected starting month. 

Examine every possible consecutive period beginning at that position. 

Use an inner loop to examine each possible ending month, starting at the
selected starting position and moving through December. 

Add each month's sales change to currentTotal. 

If currentTotal is greater than bestTotal.
--> Update bestTotal to equal currentTotal. 
--> Store the current starting index in bestStart.
--> Store the current ending index in bestEnd. 

If currentTotal equals bestTotal, keep the first period found without updating the best values. 

Move to the next month and repeat until all starting positions have been examined. 

Use bestStart and bestEnd to find the corresponding month names in the months array. 

Display the starting month, the ending month, and the highest combined sales change in millions.

End the program. 
