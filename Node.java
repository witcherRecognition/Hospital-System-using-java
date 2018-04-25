//ListNode and List class defination
class Node {
    //package access members; List can access these directly
    Object data;
    Node next;
    
    //create a ListNode that refers to object
    Node(Object obj)
    {
        this(obj, null);
    }
    
    //create ListNode that refers to Object and to next ListNode
    Node(Object obj, Node node)
    {
        data = obj;
       next = node;
    }
    
    //return reference to data in node
    Object getObject()
    {
        return data;//get next node
    }
    
    //return reference to next node in the list
    Node getNext()
    {
        return next; //get next node
    }
}//end class ListNode