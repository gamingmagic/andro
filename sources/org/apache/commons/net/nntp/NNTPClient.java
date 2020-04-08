package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Vector;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.p005io.DotTerminatedMessageReader;
import org.apache.commons.net.p005io.DotTerminatedMessageWriter;
import org.apache.commons.net.p005io.Util;

public class NNTPClient extends NNTP {
    private void __parseArticlePointer(String str, ArticleInfo articleInfo) {
        String[] split = str.split(" ");
        if (split.length >= 3) {
            try {
                articleInfo.articleNumber = Long.parseLong(split[1]);
                articleInfo.articleId = split[2];
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse article pointer.\nServer reply: " + str);
    }

    private static void __parseGroupReply(String str, NewsgroupInfo newsgroupInfo) {
        String[] split = str.split(" ");
        if (split.length >= 5) {
            try {
                newsgroupInfo._setArticleCount(Long.parseLong(split[1]));
                newsgroupInfo._setFirstArticle(Long.parseLong(split[2]));
                newsgroupInfo._setLastArticle(Long.parseLong(split[3]));
                newsgroupInfo._setNewsgroup(split[4]);
                newsgroupInfo._setPostingPermission(0);
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse newsgroup info.\nServer reply: " + str);
    }

    static NewsgroupInfo __parseNewsgroupListEntry(String str) {
        String[] split = str.split(" ");
        if (split.length < 4) {
            return null;
        }
        NewsgroupInfo newsgroupInfo = new NewsgroupInfo();
        newsgroupInfo._setNewsgroup(split[0]);
        try {
            long parseLong = Long.parseLong(split[1]);
            long parseLong2 = Long.parseLong(split[2]);
            newsgroupInfo._setFirstArticle(parseLong2);
            newsgroupInfo._setLastArticle(parseLong);
            if (parseLong2 == 0 && parseLong == 0) {
                newsgroupInfo._setArticleCount(0);
            } else {
                newsgroupInfo._setArticleCount((parseLong - parseLong2) + 1);
            }
            switch (split[3].charAt(0)) {
                case 'M':
                case 'm':
                    newsgroupInfo._setPostingPermission(1);
                    break;
                case 'N':
                case 'n':
                    newsgroupInfo._setPostingPermission(3);
                    break;
                case 'Y':
                case 'y':
                    newsgroupInfo._setPostingPermission(2);
                    break;
                default:
                    newsgroupInfo._setPostingPermission(0);
                    break;
            }
            return newsgroupInfo;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Article __parseArticleEntry(String str) {
        Article article = new Article();
        article.setSubject(str);
        String[] split = str.split("\t");
        if (split.length > 6) {
            try {
                article.setArticleNumber(Long.parseLong(split[0]));
                article.setSubject(split[1]);
                article.setFrom(split[2]);
                article.setDate(split[3]);
                article.setArticleId(split[4]);
                article.addReference(split[5]);
            } catch (NumberFormatException unused) {
            }
        }
        return article;
    }

    private NewsgroupInfo[] __readNewsgroupListing() {
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Vector vector = new Vector(2048);
        while (true) {
            try {
                String readLine = dotTerminatedMessageReader.readLine();
                if (readLine != null) {
                    NewsgroupInfo __parseNewsgroupListEntry = __parseNewsgroupListEntry(readLine);
                    if (__parseNewsgroupListEntry != null) {
                        vector.addElement(__parseNewsgroupListEntry);
                    } else {
                        throw new MalformedServerReplyException(readLine);
                    }
                } else {
                    int size = vector.size();
                    if (size <= 0) {
                        return new NewsgroupInfo[0];
                    }
                    NewsgroupInfo[] newsgroupInfoArr = new NewsgroupInfo[size];
                    vector.copyInto(newsgroupInfoArr);
                    return newsgroupInfoArr;
                }
            } finally {
                dotTerminatedMessageReader.close();
            }
        }
    }

    private BufferedReader __retrieve(int i, String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(sendCommand(i, str))) {
                return null;
            }
        } else if (!NNTPReply.isPositiveCompletion(sendCommand(i))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    private BufferedReader __retrieve(int i, long j, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(sendCommand(i, Long.toString(j)))) {
            return null;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveArticle(String str, ArticleInfo articleInfo) {
        return __retrieve(0, str, articleInfo);
    }

    public Reader retrieveArticle(String str) {
        return retrieveArticle(str, (ArticleInfo) null);
    }

    public Reader retrieveArticle() {
        return retrieveArticle((String) null);
    }

    public BufferedReader retrieveArticle(long j, ArticleInfo articleInfo) {
        return __retrieve(0, j, articleInfo);
    }

    public BufferedReader retrieveArticle(long j) {
        return retrieveArticle(j, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleHeader(String str, ArticleInfo articleInfo) {
        return __retrieve(3, str, articleInfo);
    }

    public Reader retrieveArticleHeader(String str) {
        return retrieveArticleHeader(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleHeader() {
        return retrieveArticleHeader((String) null);
    }

    public BufferedReader retrieveArticleHeader(long j, ArticleInfo articleInfo) {
        return __retrieve(3, j, articleInfo);
    }

    public BufferedReader retrieveArticleHeader(long j) {
        return retrieveArticleHeader(j, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleBody(String str, ArticleInfo articleInfo) {
        return __retrieve(1, str, articleInfo);
    }

    public Reader retrieveArticleBody(String str) {
        return retrieveArticleBody(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleBody() {
        return retrieveArticleBody((String) null);
    }

    public BufferedReader retrieveArticleBody(long j, ArticleInfo articleInfo) {
        return __retrieve(1, j, articleInfo);
    }

    public BufferedReader retrieveArticleBody(long j) {
        return retrieveArticleBody(j, (ArticleInfo) null);
    }

    public boolean selectNewsgroup(String str, NewsgroupInfo newsgroupInfo) {
        if (!NNTPReply.isPositiveCompletion(group(str))) {
            return false;
        }
        if (newsgroupInfo != null) {
            __parseGroupReply(getReplyString(), newsgroupInfo);
        }
        return true;
    }

    public boolean selectNewsgroup(String str) {
        return selectNewsgroup(str, null);
    }

    public String listHelp() {
        if (!NNTPReply.isInformational(help())) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        Util.copyReader(dotTerminatedMessageReader, stringWriter);
        dotTerminatedMessageReader.close();
        stringWriter.close();
        return stringWriter.toString();
    }

    public String[] listOverviewFmt() {
        if (!NNTPReply.isPositiveCompletion(sendCommand("LIST", "OVERVIEW.FMT"))) {
            return null;
        }
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = dotTerminatedMessageReader.readLine();
            if (readLine != null) {
                arrayList.add(readLine);
            } else {
                dotTerminatedMessageReader.close();
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
    }

    public boolean selectArticle(String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(stat(str))) {
                return false;
            }
        } else if (!NNTPReply.isPositiveCompletion(stat())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return true;
    }

    public boolean selectArticle(String str) {
        return selectArticle(str, (ArticleInfo) null);
    }

    public boolean selectArticle(ArticleInfo articleInfo) {
        return selectArticle((String) null, articleInfo);
    }

    public boolean selectArticle(long j, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(stat(j))) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return true;
    }

    public boolean selectArticle(long j) {
        return selectArticle(j, (ArticleInfo) null);
    }

    public boolean selectPreviousArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(last())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return true;
    }

    public boolean selectPreviousArticle() {
        return selectPreviousArticle((ArticleInfo) null);
    }

    public boolean selectNextArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(next())) {
            return false;
        }
        if (articleInfo != null) {
            __parseArticlePointer(getReplyString(), articleInfo);
        }
        return true;
    }

    public boolean selectNextArticle() {
        return selectNextArticle((ArticleInfo) null);
    }

    public NewsgroupInfo[] listNewsgroups() {
        if (!NNTPReply.isPositiveCompletion(list())) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewsgroupListing() {
        if (NNTPReply.isPositiveCompletion(list())) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups() {
        return new NewsgroupIterator(iterateNewsgroupListing());
    }

    public NewsgroupInfo[] listNewsgroups(String str) {
        if (!NNTPReply.isPositiveCompletion(listActive(str))) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewsgroupListing(String str) {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("LIST ACTIVE " + str + " command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups(String str) {
        return new NewsgroupIterator(iterateNewsgroupListing(str));
    }

    public NewsgroupInfo[] listNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        return __readNewsgroupListing();
    }

    public Iterable<String> iterateNewNewsgroupListing(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWGROUPS command failed: " + getReplyString());
    }

    public Iterable<NewsgroupInfo> iterateNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        return new NewsgroupIterator(iterateNewNewsgroupListing(newGroupsOrNewsQuery));
    }

    public String[] listNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        Vector vector = new Vector();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        while (true) {
            try {
                String readLine = dotTerminatedMessageReader.readLine();
                if (readLine == null) {
                    break;
                }
                vector.addElement(readLine);
            } finally {
                dotTerminatedMessageReader.close();
            }
        }
        int size = vector.size();
        if (size <= 0) {
            return new String[0];
        }
        String[] strArr = new String[size];
        vector.copyInto(strArr);
        return strArr;
    }

    public Iterable<String> iterateNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        throw new IOException("NEWNEWS command failed: " + getReplyString());
    }

    public boolean completePendingCommand() {
        return NNTPReply.isPositiveCompletion(getReply());
    }

    public Writer postArticle() {
        if (!NNTPReply.isPositiveIntermediate(post())) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    public Writer forwardArticle(String str) {
        if (!NNTPReply.isPositiveIntermediate(ihave(str))) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    public boolean logout() {
        return NNTPReply.isPositiveCompletion(quit());
    }

    public boolean authenticate(String str, String str2) {
        if (authinfoUser(str) != 381 || authinfoPass(str2) != 281) {
            return false;
        }
        this._isAllowedToPost = true;
        return true;
    }

    private BufferedReader __retrieveArticleInfo(String str) {
        if (!NNTPReply.isPositiveCompletion(xover(str))) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveArticleInfo(long j) {
        return __retrieveArticleInfo(Long.toString(j));
    }

    public BufferedReader retrieveArticleInfo(long j, long j2) {
        return __retrieveArticleInfo(j + "-" + j2);
    }

    public Iterable<Article> iterateArticleInfo(long j, long j2) {
        BufferedReader retrieveArticleInfo = retrieveArticleInfo(j, j2);
        if (retrieveArticleInfo != null) {
            return new ArticleIterator(new ReplyIterator(retrieveArticleInfo, false));
        }
        throw new IOException("XOVER command failed: " + getReplyString());
    }

    private BufferedReader __retrieveHeader(String str, String str2) {
        if (!NNTPReply.isPositiveCompletion(xhdr(str, str2))) {
            return null;
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public BufferedReader retrieveHeader(String str, long j) {
        return __retrieveHeader(str, Long.toString(j));
    }

    public BufferedReader retrieveHeader(String str, long j, long j2) {
        return __retrieveHeader(str, j + "-" + j2);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i, int i2) {
        return retrieveHeader(str, (long) i, (long) i2);
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i, int i2) {
        return retrieveArticleInfo((long) i, (long) i2);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i) {
        return retrieveHeader(str, (long) i);
    }

    @Deprecated
    public boolean selectArticle(int i, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle((long) i, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i) {
        return retrieveArticleInfo((long) i);
    }

    @Deprecated
    public boolean selectArticle(int i) {
        return selectArticle((long) i);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i) {
        return retrieveArticleHeader((long) i);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader((long) i, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    @Deprecated
    public Reader retrieveArticleBody(int i) {
        return retrieveArticleBody((long) i);
    }

    @Deprecated
    public Reader retrieveArticle(int i, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle((long) i, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticle(int i) {
        return retrieveArticle((long) i);
    }

    @Deprecated
    public Reader retrieveArticleBody(int i, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody((long) i, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticleBody(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticleHeader(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    @Deprecated
    public boolean selectArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle(str, __ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    @Deprecated
    public boolean selectArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectArticle = selectArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectArticle;
    }

    @Deprecated
    public boolean selectNextArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectNextArticle = selectNextArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectNextArticle;
    }

    @Deprecated
    public boolean selectPreviousArticle(ArticlePointer articlePointer) {
        ArticleInfo __ap2ai = __ap2ai(articlePointer);
        boolean selectPreviousArticle = selectPreviousArticle(__ap2ai);
        __ai2ap(__ap2ai, articlePointer);
        return selectPreviousArticle;
    }

    private ArticleInfo __ap2ai(ArticlePointer articlePointer) {
        if (articlePointer == null) {
            return null;
        }
        return new ArticleInfo();
    }

    private void __ai2ap(ArticleInfo articleInfo, ArticlePointer articlePointer) {
        if (articlePointer != null) {
            articlePointer.articleId = articleInfo.articleId;
            articlePointer.articleNumber = (int) articleInfo.articleNumber;
        }
    }
}
