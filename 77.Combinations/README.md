77.Combinations
=

1.Explanation
-
* Consider whether we add n in the result list,
We use dp[n,k] = dp[n-1,k-1]+ dp[n-1,k]

2.About Java
-
* Arrays.asList(int) can be used to construct an array from 1 to n
* Clone() just clones reference
