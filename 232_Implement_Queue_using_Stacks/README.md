
# Approach
<!-- Describe your approach to solving the problem. -->
The problem can be solved using two ways - 
1. `enqueue` heavy operation
2. `dequeue` heavy operation

The trick is to make use of a second stack depending on what type of operation you choose, pop and push elements from `original` stack to this `temp` stack and perform the push or pop operation, then again pop and push temp back into `original`

##### The following diagram explains the solution very well: 

![232.png](https://assets.leetcode.com/users/images/513a251b-a152-42eb-8327-4e6a8d90080e_1698303782.0193229.png)

