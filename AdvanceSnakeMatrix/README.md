# Advanced Snake Matrix Printing

Print a given n\*m array in the snake pattern. If the starting position is in the top row, then the direction should be downward from that position and the pattern should continue.If the starting position is at the bottom row, then the direction should be upward from that position and the pattern should continue.

mat[][] = { {5, 6, 15, 16, 25},
{4, 7, 14, 17, 24},
{3, 8, 13, 18, 23},
{2, 9, 12, 19, 22},
{1, 10, 11, 20, 21} };

## Example 1

```
Input :Starting Position:{4,0}

Output : 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

```

## Example 2

```
Input :Starting Position:{4,1}

Output : 10 9 8 7 6 15 14 13 12 11 20 19 18 17 16 25 24 23 22 21 1 2 3 4 5

```

## Example 3

```
Input :Starting Position:{0,3}

Output : 16 17 18 19 20 21 22 23 24 25 5 4 2 1 10 9 8 7 6 15 14 13 12 11

```
