public class Stack extends LinkList
{
    public Stack()
    {   }
    
    public void push(Object elem)
    { insertAtFront(elem);          }
    
    public Object pop()
    { return removeFromFront();     }
    
    public Object peek()
    { return getFirst();            }
}



