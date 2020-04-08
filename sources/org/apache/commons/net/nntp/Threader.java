package org.apache.commons.net.nntp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Threader {
    private int bogusIdCount = 0;
    private HashMap<String, ThreadContainer> idTable;
    private ThreadContainer root;

    public Threadable thread(List<? extends Threadable> list) {
        return thread((Iterable<? extends Threadable>) list);
    }

    public Threadable thread(Iterable<? extends Threadable> iterable) {
        if (iterable == null) {
            return null;
        }
        this.idTable = new HashMap<>();
        for (Threadable threadable : iterable) {
            if (!threadable.isDummy()) {
                buildContainer(threadable);
            }
        }
        this.root = findRootSet();
        this.idTable.clear();
        this.idTable = null;
        pruneEmptyContainers(this.root);
        this.root.reverseChildren();
        gatherSubjects();
        if (this.root.next != null) {
            throw new RuntimeException("root node has a next:" + this.root);
        }
        for (ThreadContainer threadContainer = this.root.child; threadContainer != null; threadContainer = threadContainer.next) {
            if (threadContainer.threadable == null) {
                threadContainer.threadable = threadContainer.child.threadable.makeDummy();
            }
        }
        Threadable threadable2 = this.root.child == null ? null : this.root.child.threadable;
        this.root.flush();
        this.root = null;
        return threadable2;
    }

    private void buildContainer(Threadable threadable) {
        String[] messageThreadReferences;
        String messageThreadId = threadable.messageThreadId();
        ThreadContainer threadContainer = (ThreadContainer) this.idTable.get(messageThreadId);
        if (threadContainer != null) {
            if (threadContainer.threadable != null) {
                StringBuilder sb = new StringBuilder("<Bogus-id:");
                int i = this.bogusIdCount;
                this.bogusIdCount = i + 1;
                messageThreadId = sb.append(i).append(">").toString();
                threadContainer = null;
            } else {
                threadContainer.threadable = threadable;
            }
        }
        if (threadContainer == null) {
            threadContainer = new ThreadContainer();
            threadContainer.threadable = threadable;
            this.idTable.put(messageThreadId, threadContainer);
        }
        ThreadContainer threadContainer2 = null;
        for (String str : threadable.messageThreadReferences()) {
            ThreadContainer threadContainer3 = (ThreadContainer) this.idTable.get(str);
            if (threadContainer3 == null) {
                threadContainer3 = new ThreadContainer();
                this.idTable.put(str, threadContainer3);
            }
            if (threadContainer2 != null && threadContainer3.parent == null && threadContainer2 != threadContainer3 && !threadContainer3.findChild(threadContainer2)) {
                threadContainer3.parent = threadContainer2;
                threadContainer3.next = threadContainer2.child;
                threadContainer2.child = threadContainer3;
            }
            threadContainer2 = threadContainer3;
        }
        if (threadContainer2 != null && (threadContainer2 == threadContainer || threadContainer.findChild(threadContainer2))) {
            threadContainer2 = null;
        }
        if (threadContainer.parent != null) {
            ThreadContainer threadContainer4 = null;
            ThreadContainer threadContainer5 = threadContainer.parent.child;
            while (threadContainer5 != null && threadContainer5 != threadContainer) {
                threadContainer4 = threadContainer5;
                threadContainer5 = threadContainer5.next;
            }
            if (threadContainer5 == null) {
                throw new RuntimeException("Didnt find " + threadContainer + " in parent" + threadContainer.parent);
            }
            if (threadContainer4 == null) {
                threadContainer.parent.child = threadContainer.next;
            } else {
                threadContainer4.next = threadContainer.next;
            }
            threadContainer.next = null;
            threadContainer.parent = null;
        }
        if (threadContainer2 != null) {
            threadContainer.parent = threadContainer2;
            threadContainer.next = threadContainer2.child;
            threadContainer2.child = threadContainer;
        }
    }

    private ThreadContainer findRootSet() {
        ThreadContainer threadContainer = new ThreadContainer();
        for (Object obj : this.idTable.keySet()) {
            ThreadContainer threadContainer2 = (ThreadContainer) this.idTable.get(obj);
            if (threadContainer2.parent == null) {
                if (threadContainer2.next != null) {
                    throw new RuntimeException("c.next is " + threadContainer2.next.toString());
                }
                threadContainer2.next = threadContainer.child;
                threadContainer.child = threadContainer2;
            }
        }
        return threadContainer;
    }

    private void pruneEmptyContainers(ThreadContainer threadContainer) {
        ThreadContainer threadContainer2 = null;
        ThreadContainer threadContainer3 = threadContainer.child;
        ThreadContainer threadContainer4 = threadContainer3.next;
        while (threadContainer3 != null) {
            if (threadContainer3.threadable == null && threadContainer3.child == null) {
                if (threadContainer2 == null) {
                    threadContainer.child = threadContainer3.next;
                } else {
                    threadContainer2.next = threadContainer3.next;
                }
                threadContainer3 = threadContainer2;
            } else if (threadContainer3.threadable == null && threadContainer3.child != null && (threadContainer3.parent != null || threadContainer3.child.next == null)) {
                ThreadContainer threadContainer5 = threadContainer3.child;
                if (threadContainer2 == null) {
                    threadContainer.child = threadContainer5;
                } else {
                    threadContainer2.next = threadContainer5;
                }
                ThreadContainer threadContainer6 = threadContainer5;
                while (threadContainer6.next != null) {
                    threadContainer6.parent = threadContainer3.parent;
                    threadContainer6 = threadContainer6.next;
                }
                threadContainer6.parent = threadContainer3.parent;
                threadContainer6.next = threadContainer3.next;
                threadContainer4 = threadContainer5;
                threadContainer3 = threadContainer2;
            } else if (threadContainer3.child != null) {
                pruneEmptyContainers(threadContainer3);
            }
            threadContainer2 = threadContainer3;
            threadContainer3 = threadContainer4;
            threadContainer4 = threadContainer4 == null ? null : threadContainer3.next;
        }
    }

    private void gatherSubjects() {
        int i = 0;
        for (ThreadContainer threadContainer = this.root.child; threadContainer != null; threadContainer = threadContainer.next) {
            i++;
        }
        HashMap hashMap = new HashMap((int) (((double) i) * 1.2d), 0.9f);
        int i2 = 0;
        for (ThreadContainer threadContainer2 = this.root.child; threadContainer2 != null; threadContainer2 = threadContainer2.next) {
            Threadable threadable = threadContainer2.threadable;
            if (threadable == null) {
                threadable = threadContainer2.child.threadable;
            }
            String simplifiedSubject = threadable.simplifiedSubject();
            if (!(simplifiedSubject == null || simplifiedSubject == "")) {
                ThreadContainer threadContainer3 = (ThreadContainer) hashMap.get(simplifiedSubject);
                if (threadContainer3 == null || ((threadContainer2.threadable == null && threadContainer3.threadable != null) || (threadContainer3.threadable != null && threadContainer3.threadable.subjectIsReply() && threadContainer2.threadable != null && !threadContainer2.threadable.subjectIsReply()))) {
                    hashMap.put(simplifiedSubject, threadContainer2);
                    i2++;
                }
            }
        }
        if (i2 != 0) {
            ThreadContainer threadContainer4 = null;
            ThreadContainer threadContainer5 = this.root.child;
            ThreadContainer threadContainer6 = threadContainer5.next;
            while (threadContainer5 != null) {
                Threadable threadable2 = threadContainer5.threadable;
                if (threadable2 == null) {
                    threadable2 = threadContainer5.child.threadable;
                }
                String simplifiedSubject2 = threadable2.simplifiedSubject();
                if (!(simplifiedSubject2 == null || simplifiedSubject2 == "")) {
                    ThreadContainer threadContainer7 = (ThreadContainer) hashMap.get(simplifiedSubject2);
                    if (threadContainer7 != threadContainer5) {
                        if (threadContainer4 == null) {
                            this.root.child = threadContainer5.next;
                        } else {
                            threadContainer4.next = threadContainer5.next;
                        }
                        threadContainer5.next = null;
                        if (threadContainer7.threadable == null && threadContainer5.threadable == null) {
                            ThreadContainer threadContainer8 = threadContainer7.child;
                            while (threadContainer8 != null && threadContainer8.next != null) {
                                threadContainer8 = threadContainer8.next;
                            }
                            if (threadContainer8 != null) {
                                threadContainer8.next = threadContainer5.child;
                            }
                            for (ThreadContainer threadContainer9 = threadContainer5.child; threadContainer9 != null; threadContainer9 = threadContainer9.next) {
                                threadContainer9.parent = threadContainer7;
                            }
                            threadContainer5.child = null;
                        } else if (threadContainer7.threadable == null || (threadContainer5.threadable != null && threadContainer5.threadable.subjectIsReply() && !threadContainer7.threadable.subjectIsReply())) {
                            threadContainer5.parent = threadContainer7;
                            threadContainer5.next = threadContainer7.child;
                            threadContainer7.child = threadContainer5;
                        } else {
                            ThreadContainer threadContainer10 = new ThreadContainer();
                            threadContainer10.threadable = threadContainer7.threadable;
                            threadContainer10.child = threadContainer7.child;
                            for (ThreadContainer threadContainer11 = threadContainer10.child; threadContainer11 != null; threadContainer11 = threadContainer11.next) {
                                threadContainer11.parent = threadContainer10;
                            }
                            threadContainer7.threadable = null;
                            threadContainer7.child = null;
                            threadContainer5.parent = threadContainer7;
                            threadContainer10.parent = threadContainer7;
                            threadContainer7.child = threadContainer5;
                            threadContainer5.next = threadContainer10;
                        }
                        threadContainer5 = threadContainer4;
                    }
                }
                threadContainer4 = threadContainer5;
                threadContainer5 = threadContainer6;
                threadContainer6 = threadContainer6 == null ? null : threadContainer6.next;
            }
            hashMap.clear();
        }
    }

    @Deprecated
    public Threadable thread(Threadable[] threadableArr) {
        return thread(Arrays.asList(threadableArr));
    }
}
