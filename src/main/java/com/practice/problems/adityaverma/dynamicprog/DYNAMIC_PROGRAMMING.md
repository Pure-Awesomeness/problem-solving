# Dynamic Programming - DP #

> `DP` ====> `Recursion` + `Storage`

* DP's parent is Recursion
* Dynamic Programming is also known as Enhanced Recursion

## How to Identify Dynamic Programming Question? ##

> If recursion calls two function then DP can be applied

> Optimal things will be asked

## How to approach problem? ##

> Write recursive code first

> Then Memoize it

## Question List ##

| Questions                   | Variations |
|:----------------------------|:-----------|
| 0 - 1 Knapsack              | 6          |
| Unbounded Knapsack          | 5          |
| Fibonacci                   | 7          |
| L C S                       | 15         |
| L I S                       | 10         |
| Kadane's Algorithm          | 6          |
| Matrix chain multiplication | 7          |
| DP on tree                  | 4          |
| DP on grid                  | 14         |
| Others                      | 5          |

Total : Approx 80

### Approach to solve knapsack ###

* `Recursive`
* `Recursive` + `Memoization`
* `Iterative` + `Memoization`

### Knapsack ###

<details>
    <summary>Types of Knapsack Problems</summary>
* *Fractional Knapsack (Greedy)*

* *0/1 Knapsack*

* *Unbounded Knapsack*
</details>

<hr/>

#### 0 - 1 Knapsack ####
| Questions                            | Difficulty Level |
|:-------------------------------------|:-----------------|
| Subset Sum                           | Medium           |
| Equal Sum Partition                  | Medium           |
| Count of Subset Sum                  | Medium           |
| Minimum Subset Sum Diff              | Hard             |
| Target Sum                           | Medium           |
| Number of Subset Sum with given Diff | Medium           |

#### Unbounded Knapsack ####
| Questions                            | Difficulty Level |
|:-------------------------------------|:-----------------|
| Rod Cutting                          | Medium           |
| Coin Change - I                      | Medium           |
| Coin Change - II                     | Medium           |
| Maximum Ribbon Cut                   | Hard             |

<hr/>

### Longest Common Subsequence ### 

| Questions                                                         | Difficulty Level | Parent |
|:------------------------------------------------------------------|:-----------------|:-------|
| Longest Common Substring (LCS)                                    | Medium           | Parent |
| Print L C S                                                       | Medium           | LCS    |
| Shortest Common Super sequence (SCS)                              | Medium           | LCS    |
| Print S C S                                                       | Hard             | LCS    |
| Minimum number of Insertions and Deletions                        | Medium           | LCS    |
| Longest repeating Subsequence                                     | Medium           |        |
| Length of longest sequence of A which is substring in B           |                  |        |
| Subsequence Pattern matching                                      |                  |        |
| Count how many times A appear as a subsequence in B               |                  |        |
| Longest Palindromic Subsequence                                   |                  |        |
| Longest Palindromic Substring                                     |                  |        |
| Count of Palindromic Substring                                    |                  |        |
| Minimum number of Deletion(s) in a string to make it Palindromic  | Medium           |        |
| Minimum number of Insertion(s) in a string to make it Palindromic | Hard             |        |

<hr/>

### Matrix Chain Multiplication (MCM) ###
| Questions                                            | Difficulty Level |
|:-----------------------------------------------------|:-----------------|
| M C M                                                | Hard             |
| Printing M C M                                       |                  |
| Evaluate Expression to True/Boolean Parenthesization |                  |
| Minimum Maximum value of an expression               |                  |
| Palindrome partitioning                              |                  |
| Scrambled String                                     | Hard             |
| Egg Dropping Problem                                 | Hard             |

`Generic Code` >>
```
int solve(int[] arr, int i, int j) {
    if (i > j) return 0;
    int answer;


    for (int k = i; k <= j; k++) {
        int tempAnswer = solve(arr, i, k) + solve(arr, k + 1, j);
        answer = function(tempAnswer);
    }

    return answer;
}
```

<hr/>

### DP on Trees ###
| Questions                             | Difficulty Level |
|:--------------------------------------|:-----------------|
| Diameter of a Binary Tree             | Hard             |
| Maximum Path Sum from any node to any |                  |
| Maximum Path Sum from leaf to leafs   |                  |
| Diameter of N-ary Tree                |                  |

`Generic Code` >>
```
int solve(Node root, int result) {
    /* BASE condition */
    if(root == null) 
        return 0;
    
    /* HYPOTHESIS */
    int left = solve(root.left, result);
    int right = solve(root.right, result);
    
    /* INDUCTION */
     int temp = 1 + Math.max(left , right);
    int answer = Math.max(temp, relation);
    
    int result = Math.max(result, answer);
    return temp;
}
```
