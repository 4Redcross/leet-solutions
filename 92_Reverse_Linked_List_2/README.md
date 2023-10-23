# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
My intuition was to go upto left pointer, extract the list to be reversed and reverse it using another function and then managing attaching it back to main list. It was my brute force approach and seemed very complicated to implement

# Approach
<!-- Describe your approach to solving the problem. -->
I then came across a different approach which could solve the the problem in single loop

1. Reach upto the point where list needs to be reversed
2. Assign the first element of this list as `tail`
3. Then keep bringing the next element of the tail to front of list
4. Run this loop `right - left` number of times
5. This automatically reverses the required sub-list

The below diagram will explain the algorithm a lot better - 

![92.png](https://assets.leetcode.com/users/images/9c2a52a8-cc72-48f6-922b-fbf7da69433b_1698046946.584094.png)


# Complexity
- Time complexity: O(n)

- Space complexity: O(1)
