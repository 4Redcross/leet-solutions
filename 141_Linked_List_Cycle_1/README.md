# Intuition
I first mis-read the problem thinking that I would be given a ListNode and have to link it to `pos` 😅. After looking at the problem properly I understood that it can be solved using fast and slow pointer
# Approach
- To understand the solution properly you'll have to understand the case of two pointers moving in a circle. 
- First pointer at 1 node per iteration and second pointer two nodes at 2 nodes per iteration.
- You'll soon realise if the pointer **does loop**, there will always be a point when both pointers meet.
- Visualize it like this - the second pointer will always be a case where it lands at `position - 1` of first pointer and catch up on its next iteration. The following image will solve answer your doubts: 

![141.png](https://assets.leetcode.com/users/images/d2db86e6-989c-48d5-b4af-68fb420b3091_1697911617.5535839.png)

- Now you simply have to return false if fast pointer reaches null or head is null or the list itself is null

# Complexity
- Time complexity: O(n)

- Space complexity: O(1)
