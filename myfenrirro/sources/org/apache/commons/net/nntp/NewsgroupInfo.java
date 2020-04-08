package org.apache.commons.net.nntp;

public final class NewsgroupInfo {
    public static final int MODERATED_POSTING_PERMISSION = 1;
    public static final int PERMITTED_POSTING_PERMISSION = 2;
    public static final int PROHIBITED_POSTING_PERMISSION = 3;
    public static final int UNKNOWN_POSTING_PERMISSION = 0;
    private long __estimatedArticleCount;
    private long __firstArticle;
    private long __lastArticle;
    private String __newsgroup;
    private int __postingPermission;

    /* access modifiers changed from: 0000 */
    public final void _setNewsgroup(String str) {
        this.__newsgroup = str;
    }

    /* access modifiers changed from: 0000 */
    public final void _setArticleCount(long j) {
        this.__estimatedArticleCount = j;
    }

    /* access modifiers changed from: 0000 */
    public final void _setFirstArticle(long j) {
        this.__firstArticle = j;
    }

    /* access modifiers changed from: 0000 */
    public final void _setLastArticle(long j) {
        this.__lastArticle = j;
    }

    /* access modifiers changed from: 0000 */
    public final void _setPostingPermission(int i) {
        this.__postingPermission = i;
    }

    public final String getNewsgroup() {
        return this.__newsgroup;
    }

    public final long getArticleCountLong() {
        return this.__estimatedArticleCount;
    }

    public final long getFirstArticleLong() {
        return this.__firstArticle;
    }

    public final long getLastArticleLong() {
        return this.__lastArticle;
    }

    public final int getPostingPermission() {
        return this.__postingPermission;
    }

    @Deprecated
    public final int getArticleCount() {
        return (int) this.__estimatedArticleCount;
    }

    @Deprecated
    public final int getFirstArticle() {
        return (int) this.__firstArticle;
    }

    @Deprecated
    public final int getLastArticle() {
        return (int) this.__lastArticle;
    }
}
