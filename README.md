# HomeTask

I choose to implement PersonCollection class with the following strategy:
1. for the data sturcture that supply the require operations(add/ remove) I choose to use priority queue.
   The priority queue implemented by sorted linked list and allows to add in O(n) and remove in O(1)
   
2. In order to support all potential algorithms and changes in Person's interface,
   I used parameter type Comparator for PersonCollection constructor and save it in data member of the class.
   
3. In order to make the code thread-safe I added to the Add/ Remove operations synchronized block.

4. For the notifications the class extends Observable, this way we can notify to the observers on actions. 

5. For tests, I created NotificationUpdates class that implements Observer and update on each action.

The second data structure I thought is ConcurrentHashMap and sorted list.

Add- add Person to ConcurrentHashMap in O(1) and add Person by value to sorted list in O(n) - O(n)

Remove- O(1)

Tha advantage of this data structure is supporting full concurrency and prevents a programmer from handling synchronization, but the disadvantage is that we still need to manage the sorted list.








