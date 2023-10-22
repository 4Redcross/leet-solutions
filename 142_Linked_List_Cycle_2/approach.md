# Intuition
To solve this problem you must have solved [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/).
 
You also need to know about **Floyd's Cycle Detection**, which I'll explain _why it works_

# Approach
Consider the following image for explanation - 

![142.png](https://assets.leetcode.com/users/images/b0b6bf51-f064-4351-b8e1-3ac531a83f5a_1697970125.3717804.png)

Notice how the position when pointer is found and the position of head is equi-distant from the node where the loop starts. You can try this yourself with other testcases as well!
# Complexity
- Time complexity: O(n)

- Space complexity: O(1)
