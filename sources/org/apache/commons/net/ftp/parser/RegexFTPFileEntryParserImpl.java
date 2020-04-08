package org.apache.commons.net.ftp.parser;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.net.ftp.FTPFileEntryParserImpl;

public abstract class RegexFTPFileEntryParserImpl extends FTPFileEntryParserImpl {
    protected Matcher _matcher_ = null;
    private Pattern pattern = null;
    private MatchResult result = null;

    public RegexFTPFileEntryParserImpl(String str) {
        setRegex(str);
    }

    public boolean matches(String str) {
        this.result = null;
        this._matcher_ = this.pattern.matcher(str);
        if (this._matcher_.matches()) {
            this.result = this._matcher_.toMatchResult();
        }
        return this.result != null;
    }

    public int getGroupCnt() {
        if (this.result == null) {
            return 0;
        }
        return this.result.groupCount();
    }

    public String group(int i) {
        if (this.result == null) {
            return null;
        }
        return this.result.group(i);
    }

    public String getGroupsAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.result.groupCount(); i++) {
            sb.append(i).append(") ").append(this.result.group(i)).append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    public boolean setRegex(String str) {
        try {
            this.pattern = Pattern.compile(str);
            return this.pattern != null;
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: " + str);
        }
    }
}
