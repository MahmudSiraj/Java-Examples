// a generic fixed-size queue class
class GenQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc;

    // construct an empty queue with the given array
    public GenQueue(T[] aref) {
        q = aref;
        putloc = getloc= 0;
    }
    
    // put an item into the queue
    public void put(T obj) throws QueueFullException {
        if(putloc == q.length)
            throw new QueueFullException(q.length);
        
            q[putloc++] = obj;
    }

    // get a character from the queue
    public T get() throws QueueEmptyException {
        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }

}