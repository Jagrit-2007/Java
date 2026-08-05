Data is stored in two type of memories : 
1. Stack Memory
2. Heap Memory ( String Constant Pool (SCP) + "by new keyword" )

******************************************************************

Stack Memory :
A very small memory and is very fast in execution and whenever execution is done i.e after using values
memory gets clear.
Primitive data types are stores like as : int, boolean, long, double, char, references/adresses of objects, etc.

Heap memory :
All objects like strings, string builders, arrays, scanner ,etc. stays in heap memory. It's size is big and its a bit slow to access and object stays here until "Garbage collector" doesn't collect it.

In case of String : 

1. By String literals , String name1 = "Jagrit"; in this way string is stored in SCP means String constant pool
Also if we later type, String name2 = "Jagrit"; JVM sees that "Jagrit" is already present in SCP. It does NOT create a new object; instead, it makes name2 point to the exact same memory address as name1.
Memory Advantage: Saves memory by reusing identical string values.

2. By using "new" keyword : its directly stored outside SCP, in the main heap memory .. 