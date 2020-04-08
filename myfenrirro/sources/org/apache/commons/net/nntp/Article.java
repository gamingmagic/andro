package org.apache.commons.net.nntp;

import java.util.ArrayList;

public class Article implements Threadable {
    private String articleId;
    private long articleNumber = -1;
    private String date;
    private String from;
    private boolean isReply = false;
    public Article kid;
    public Article next;
    private ArrayList<String> references;
    private String simplifiedSubject;
    private String subject;

    public void addReference(String str) {
        if (str != null && str.length() != 0) {
            if (this.references == null) {
                this.references = new ArrayList<>();
            }
            this.isReply = true;
            for (String add : str.split(" ")) {
                this.references.add(add);
            }
        }
    }

    public String[] getReferences() {
        if (this.references == null) {
            return new String[0];
        }
        return (String[]) this.references.toArray(new String[this.references.size()]);
    }

    private void simplifySubject() {
        int i = 0;
        String subject2 = getSubject();
        int length = subject2.length();
        boolean z = false;
        while (!z) {
            z = true;
            while (i < length && subject2.charAt(i) == ' ') {
                i++;
            }
            if (i < length - 2 && ((subject2.charAt(i) == 'r' || subject2.charAt(i) == 'R') && (subject2.charAt(i + 1) == 'e' || subject2.charAt(i + 1) == 'E'))) {
                if (subject2.charAt(i + 2) == ':') {
                    i += 3;
                    z = false;
                } else if (i < length - 2 && (subject2.charAt(i + 2) == '[' || subject2.charAt(i + 2) == '(')) {
                    int i2 = i + 3;
                    while (i2 < length && subject2.charAt(i2) >= '0' && subject2.charAt(i2) <= '9') {
                        i2++;
                    }
                    if (i2 < length - 1 && ((subject2.charAt(i2) == ']' || subject2.charAt(i2) == ')') && subject2.charAt(i2 + 1) == ':')) {
                        i = i2 + 2;
                        z = false;
                    }
                }
            }
            if ("(no subject)".equals(this.simplifiedSubject)) {
                this.simplifiedSubject = "";
            }
            int i3 = length;
            while (i3 > i && subject2.charAt(i3 - 1) < ' ') {
                i3--;
            }
            if (i == 0 && i3 == length) {
                this.simplifiedSubject = subject2;
            } else {
                this.simplifiedSubject = subject2.substring(i, i3);
            }
        }
    }

    public static void printThread(Article article, int i) {
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                System.out.print("==>");
            }
            article.getSubject();
            article.getFrom();
            article.getArticleId();
            if (article.kid != null) {
                printThread(article.kid, i + 1);
            }
            if (article.next != null) {
                article = article.next;
            } else {
                return;
            }
        }
    }

    public String getArticleId() {
        return this.articleId;
    }

    public long getArticleNumberLong() {
        return this.articleNumber;
    }

    public String getDate() {
        return this.date;
    }

    public String getFrom() {
        return this.from;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setArticleId(String str) {
        this.articleId = str;
    }

    public void setArticleNumber(long j) {
        this.articleNumber = j;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public boolean isDummy() {
        return this.articleNumber == -1;
    }

    public String messageThreadId() {
        return this.articleId;
    }

    public String[] messageThreadReferences() {
        return getReferences();
    }

    public String simplifiedSubject() {
        if (this.simplifiedSubject == null) {
            simplifySubject();
        }
        return this.simplifiedSubject;
    }

    public boolean subjectIsReply() {
        return this.isReply;
    }

    public void setChild(Threadable threadable) {
        this.kid = (Article) threadable;
        flushSubjectCache();
    }

    private void flushSubjectCache() {
        this.simplifiedSubject = null;
    }

    public void setNext(Threadable threadable) {
        this.next = (Article) threadable;
        flushSubjectCache();
    }

    public Threadable makeDummy() {
        return new Article();
    }

    public String toString() {
        return this.articleNumber + " " + this.articleId + " " + this.subject;
    }

    @Deprecated
    public int getArticleNumber() {
        return (int) this.articleNumber;
    }

    @Deprecated
    public void setArticleNumber(int i) {
        this.articleNumber = (long) i;
    }

    @Deprecated
    public void addHeaderField(String str, String str2) {
    }
}
