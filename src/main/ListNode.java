package main;
public class ListNode<T>{ 

	private T value;			//Generic value
	private ListNode<T> next;	//Next list node in linked list
	
	//Default constructor
	public ListNode(){
		value=null;
		next=null;}
	
	/*Pass in generic type and next link to this ListNode 
	 * @param T initValue, ListNode<T> initNext -- Value for this node and next */
	public ListNode(T initValue, ListNode<T> initNext){ 
		value=initValue; 
		next=initNext;} 

	/*Return generic type stored in link
	 * @return value -- Value for this node */
	public T getValue(){
		return value;} 

	/*Return next ListNode in list
	 * @return next -- Pass back next node */
	public ListNode<T> getNext(){
		return next;} 

	/*Set this generic type equal to new generic type
	 * @param T newValue -- New value for this node */
	public void setValue(T newValue){
		value=newValue;} 

	/*Set next link equal to new next link
	 * @param ListNode<T> newNext -- New value for next node */
	public void setNext(ListNode<T> newNext){
		next=newNext;}
}