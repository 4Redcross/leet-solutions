# Approach
<!-- Describe your approach to solving the problem. -->
[Similar](https://leetcode.com/problems/implement-queue-using-stacks/solutions/4209773/java-diagram-explanation-100/) to implementation of Queue using Stacks, this problem can be approached in two ways - 
1. `pop()` heavy operation
2. `push()` heavy operation (_Implemented in code below_)


##### For push() heavy operation - 
- For `pop` simply push elements into the queue
- For `push`, transfer all elements to a temporary queue and then add the new element to original queue. Transfer back all elements from temporary queue

![image.png](https://assets.leetcode.com/users/images/6a27d8ea-5bda-46b8-a8cf-bacb76afbb17_1698323221.747697.png)


##### For pop() heavy operation - 
- For `push` simply push elements into the queue
- For `pop` operation, copy elements upto the last element into another queue, remove the remaining element and transfer the temporary queue back to `original`

![image.png](https://assets.leetcode.com/users/images/4e8501c5-570b-4c7d-a51f-1c14a61e212a_1698323195.1169114.png)

