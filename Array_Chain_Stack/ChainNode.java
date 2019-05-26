package Array_Chain_Stack;

public class ChainNode {

    public Object element;
    public ChainNode next;
    
    ChainNode (){}
    
    ChainNode (Object element) {
        this.element = element;
    }
    
    public ChainNode (Object element, ChainNode next) {
        this.element = element;
        this.next = next;
    }
    
}
