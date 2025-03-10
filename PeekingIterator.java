// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Time Complexity all methods - O(1).
// Space Complexity all methods - O(1).
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer nextEl;
    boolean peeked = false;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.it = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        nextEl();
        peeked = true;
        return nextEl;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        nextEl();
        peeked = false;
        return this.nextEl;
    }

    public void nextEl() {
        if(peeked){
            return;
        }
        this.nextEl = it.next();
    }

    @Override
    public boolean hasNext() {
        return peeked==true || it.hasNext();
    }
}
