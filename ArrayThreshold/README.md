# Array Threshold

Given an array and a threshold value find the output

**Input Format:** Get array and threshold
**Output Format:** Display the count

## Example 1

```
Array: {5,8,10,13,6,2}
Threshold: 3

Output:
count=17

```

**Explanation:**
Number <-|-> Parts <----|---> Count
5 <----|----> {3,2} <----|----> 2
8 <----|---> {3,3,2} <----|---> 3
10 <---|--> {3,3,3,1} <---|---> 4
13 <--|--> {3,3,3,3,1} <--|---> 5
6 <----|---> {3,3} <-----|----> 2
2 <----|----> {2} <-----|-----> 1
