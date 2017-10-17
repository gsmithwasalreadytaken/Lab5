#Questions

1. Answer the following questions:
   - Why does `LinkedStack` not require an explicit constructor?
   
   LinkedStack is already implemented with a LinkedStack interface so it would be redundant.
   
   - What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?
   
   push(),peek(), pop(), & isEmpty() all have both the time complexity and space of O(n)
   asList() & ReverseLines.main has O(1)
   
   - How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list but the `asList` method uses constant time and space?
   
   If we have used LinkedList, the asList() would be a faster array. I believe it would be O(n)
   
   - Is it better for `push` and `pop` to return the item or the stack itself?
    Briefly discuss the pros and cons of each design.
    
    Perhaps if the array was small, a O(1) search would be helpful. However, larges masses of code scanned through one-by-one would be inefficient. 
