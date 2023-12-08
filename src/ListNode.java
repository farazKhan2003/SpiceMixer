class ListNode {
	private Attempt payload;
	private ListNode next;
	
	public ListNode(Attempt payload, ListNode next) {
		this.payload = payload;
		this.next = next;
	}
	
	public ListNode(Attempt payload) {
        this.payload = payload;
        this.next = null;
	}
	
	public ListNode getNext() {return this.next;}
	public Attempt getPayload() {return this.payload;}
	
	
    public String toString() {

        String attemptString="";
        for (ListNode cur = this; cur != null; cur = cur.getNext()) {
            attemptString += cur.getPayload().toString() + "\n";
        }
        return attemptString.toString();
    }
    
    
}
