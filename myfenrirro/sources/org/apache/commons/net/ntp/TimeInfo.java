package org.apache.commons.net.ntp;

import java.util.ArrayList;
import java.util.List;

public class TimeInfo {
    private List<String> _comments;
    private Long _delay;
    private boolean _detailsComputed;
    private final NtpV3Packet _message;
    private Long _offset;
    private final long _returnTime;

    public TimeInfo(NtpV3Packet ntpV3Packet, long j) {
        this(ntpV3Packet, j, null, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list) {
        this(ntpV3Packet, j, list, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, boolean z) {
        this(ntpV3Packet, j, null, z);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list, boolean z) {
        if (ntpV3Packet == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this._returnTime = j;
        this._message = ntpV3Packet;
        this._comments = list;
        if (z) {
            computeDetails();
        }
    }

    public void addComment(String str) {
        if (this._comments == null) {
            this._comments = new ArrayList();
        }
        this._comments.add(str);
    }

    public void computeDetails() {
        if (!this._detailsComputed) {
            this._detailsComputed = true;
            if (this._comments == null) {
                this._comments = new ArrayList();
            }
            TimeStamp originateTimeStamp = this._message.getOriginateTimeStamp();
            long time = originateTimeStamp.getTime();
            TimeStamp receiveTimeStamp = this._message.getReceiveTimeStamp();
            long time2 = receiveTimeStamp.getTime();
            TimeStamp transmitTimeStamp = this._message.getTransmitTimeStamp();
            long time3 = transmitTimeStamp.getTime();
            if (originateTimeStamp.ntpValue() != 0) {
                if (receiveTimeStamp.ntpValue() == 0 || transmitTimeStamp.ntpValue() == 0) {
                    this._comments.add("Warning: zero rcvNtpTime or xmitNtpTime");
                    if (time > this._returnTime) {
                        this._comments.add("Error: OrigTime > DestRcvTime");
                    } else {
                        this._delay = Long.valueOf(this._returnTime - time);
                    }
                    if (receiveTimeStamp.ntpValue() != 0) {
                        this._offset = Long.valueOf(time2 - time);
                    } else if (transmitTimeStamp.ntpValue() != 0) {
                        this._offset = Long.valueOf(time3 - this._returnTime);
                    }
                } else {
                    long j = this._returnTime - time;
                    if (time3 < time2) {
                        this._comments.add("Error: xmitTime < rcvTime");
                    } else {
                        long j2 = time3 - time2;
                        long j3 = j2;
                        if (j2 <= j) {
                            j -= j3;
                        } else if (j3 - j != 1) {
                            this._comments.add("Warning: processing time > total network time");
                        } else if (j != 0) {
                            this._comments.add("Info: processing time > total network time by 1 ms -> assume zero delay");
                            j = 0;
                        }
                    }
                    this._delay = Long.valueOf(j);
                    if (time > this._returnTime) {
                        this._comments.add("Error: OrigTime > DestRcvTime");
                    }
                    this._offset = Long.valueOf(((time2 - time) + (time3 - this._returnTime)) / 2);
                }
            } else if (transmitTimeStamp.ntpValue() != 0) {
                this._offset = Long.valueOf(time3 - this._returnTime);
                this._comments.add("Error: zero orig time -- cannot compute delay");
            } else {
                this._comments.add("Error: zero orig time -- cannot compute delay/offset");
            }
        }
    }

    public List<String> getComments() {
        return this._comments;
    }

    public Long getDelay() {
        return this._delay;
    }

    public Long getOffset() {
        return this._offset;
    }

    public NtpV3Packet getMessage() {
        return this._message;
    }

    public long getReturnTime() {
        return this._returnTime;
    }
}
