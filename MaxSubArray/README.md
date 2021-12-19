# Valid set of sub arrays

Write a program to find out a set of valid sub arrays from a given array. The window size of the sub array should be configurable. The output of each subarray should be formed by finding the maximum value in each position(i.e units, tens, hundreds, thousands position etc)

**Example:** If the sub array is {36,145,67,1004} then the biggest units place among these is 7, the biggest digit in tens place is 6 etc... So the derived number from this array would be 1167.

A subarray is considered valid only if it has a favourite number in it. (the number can be in any position). The list of valid and invalid sub arrays should be printed at the end.

## Example 1

```
Input Array: {35,145,67,1004,88,456,2034}
Window Size: 3
Favorite number: 8

Output:
{35,145,67} : 167
{145,67,1004} : 1167
{67,1004,88} : 1088
{1004,88,456} : 1488
{88,456,2034} : 2488


Arrays {67, 1004, 88}, {1004, 88, 456}, {88, 456, 2034} are valid arrays
Arrays {35, 145, 67}, {145, 67, 1004} are invalid arrays

```
