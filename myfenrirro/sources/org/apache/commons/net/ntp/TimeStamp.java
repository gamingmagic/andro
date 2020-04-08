package org.apache.commons.net.ntp;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    public TimeStamp(long j) {
        this.ntpTime = j;
    }

    public TimeStamp(String str) {
        this.ntpTime = decodeNtpHexString(str);
    }

    public TimeStamp(Date date) {
        this.ntpTime = date == null ? 0 : toNtpTime(date.getTime());
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public static long getTime(long j) {
        long j2 = (j >>> 32) & 4294967295L;
        long round = Math.round((((double) (j & 4294967295L)) * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j2) == 0) {
            return (1000 * j2) + msb0baseTime + round;
        }
        return (1000 * j2) + msb1baseTime + round;
    }

    public static TimeStamp getNtpTime(long j) {
        return new TimeStamp(toNtpTime(j));
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    protected static long decodeNtpHexString(String str) {
        if (str == null) {
            throw new NumberFormatException("null");
        }
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
        }
        if (str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str, 16) << 32;
    }

    public static TimeStamp parseNtpString(String str) {
        return new TimeStamp(decodeNtpHexString(str));
    }

    protected static long toNtpTime(long j) {
        long j2;
        boolean z = j < msb0baseTime;
        if (z) {
            j2 = j - msb1baseTime;
        } else {
            j2 = j - msb0baseTime;
        }
        long j3 = j2 / 1000;
        long j4 = ((j2 % 1000) * 4294967296L) / 1000;
        if (z) {
            j3 |= 2147483648L;
        }
        return (j3 << 32) | j4;
    }

    public int hashCode() {
        return (int) (this.ntpTime ^ (this.ntpTime >>> 32));
    }

    public boolean equals(Object obj) {
        if (obj instanceof TimeStamp) {
            return this.ntpTime == ((TimeStamp) obj).ntpValue();
        }
        return false;
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    private static void appendHexString(StringBuilder sb, long j) {
        String hexString = Long.toHexString(j);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }

    public static String toString(long j) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, 4294967295L & j);
        return sb.toString();
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            this.simpleFormatter = new SimpleDateFormat(NTP_DATE_FORMAT, Locale.US);
            this.simpleFormatter.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            this.utcFormatter = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }

    public int compareTo(TimeStamp timeStamp) {
        long j = this.ntpTime;
        long j2 = timeStamp.ntpTime;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
