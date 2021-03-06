package com.corejava.com.corejava.java8;

public class VolatileExample {
    /*
    volatile vs synchronized:
Before we move on let’s take a look at two important features of locks
and synchronization.

Mutual Exclusion: It means that only one thread or process can execute a
 block of code (critical section) at a time.
Visibility: It means that changes made by one thread to shared data are
visible to other threads.
Java’s synchronized keyword guarantees both mutual exclusion and visibility.
If we make the blocks of threads that modifies the value of shared variable
 synchronized only one thread can enter the block and changes made by it
  will be reflected in the main memory. All other thread trying to enter
  the block at the same time will be blocked and put to sleep.

In some cases we may only desire the visibility and not atomicity.
Use of synchronized in such situation is an overkill and may cause
scalability problems. Here volatile comes to the rescue. Volatile
variables have the visibility features of synchronized but not the
 atomicity features. The values of volatile variable will never be
  cached and all writes and reads will be done to and from the main memory.
   However, use of volatile is limited to very restricted set of cases as
    most of the times atomicity is desired. For example a simple
    increment statement such as x = x + 1; or x++ seems to be a
    single operation but is s really a compound read-modify-write
    sequence of operations that must execute atomically.
     */
}
