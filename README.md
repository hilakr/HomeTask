# HomeTask
People collection 
Bonus: please suggest 2 different data-structures for the internal implementation of the relevant requirements.

Answer:
1. I choose to implement PersonCollection class with the following strategy.

for the data sturcture that supply the require operations(add/ remove) I choose to use priority queue.
The priority queue implemented by sorted link list and allows to add in O(n) and remove in O(1)

In order to support the require that asked to support all potential "algorithms" I created the constructor of PersonCollection class 
with parameter with type Comparator<Person>.
why>
beacuse we need to support all potential "algorithms" we create the class with reference to comparator that can be changed
and it wont affected on the class. so we save reference to the comparater in data member of the class and add person by it.

The parameter that PersonCollection gets is Comparator<Person>.
Comparator<Person> is an interface so I created a class named SecretComparator that implements it.
Theoretically all potential "algorithms" can implemented in this class in the method compare().

In addition, in order to make the code thread-safe I added to the Add/ Remove operations synchronized block to keep it safe.

for the notifications the class extends Observable and that way we can notigy to the observers on actions.
for test I created NotificationUpdates class that implements Observer and update on the actions.







