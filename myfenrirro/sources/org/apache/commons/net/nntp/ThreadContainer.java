package org.apache.commons.net.nntp;

class ThreadContainer {
    ThreadContainer child;
    ThreadContainer next;
    ThreadContainer parent;
    Threadable threadable;

    ThreadContainer() {
    }

    /* access modifiers changed from: 0000 */
    public boolean findChild(ThreadContainer threadContainer) {
        if (this.child == null) {
            return false;
        }
        if (this.child == threadContainer) {
            return true;
        }
        return this.child.findChild(threadContainer);
    }

    /* access modifiers changed from: 0000 */
    public void flush() {
        if (this.parent == null || this.threadable != null) {
            this.parent = null;
            if (this.threadable != null) {
                this.threadable.setChild(this.child == null ? null : this.child.threadable);
            }
            if (this.child != null) {
                this.child.flush();
                this.child = null;
            }
            if (this.threadable != null) {
                this.threadable.setNext(this.next == null ? null : this.next.threadable);
            }
            if (this.next != null) {
                this.next.flush();
                this.next = null;
            }
            this.threadable = null;
            return;
        }
        throw new RuntimeException("no threadable in " + toString());
    }

    /* access modifiers changed from: 0000 */
    public void reverseChildren() {
        if (this.child != null) {
            ThreadContainer threadContainer = null;
            ThreadContainer threadContainer2 = this.child;
            ThreadContainer threadContainer3 = threadContainer2.next;
            while (threadContainer2 != null) {
                threadContainer2.next = threadContainer;
                threadContainer = threadContainer2;
                threadContainer2 = threadContainer3;
                threadContainer3 = threadContainer3 == null ? null : threadContainer3.next;
            }
            this.child = threadContainer;
            for (ThreadContainer threadContainer4 = this.child; threadContainer4 != null; threadContainer4 = threadContainer4.next) {
                threadContainer4.reverseChildren();
            }
        }
    }
}
