package org.apache.commons.net.telnet;

public final class TelnetCommand {
    public static final int ABORT = 238;

    /* renamed from: AO */
    public static final int f8993AO = 245;
    public static final int AYT = 246;
    public static final int BREAK = 243;

    /* renamed from: DM */
    public static final int f8994DM = 242;

    /* renamed from: DO */
    public static final int f8995DO = 253;
    public static final int DONT = 254;

    /* renamed from: EC */
    public static final int f8996EC = 247;

    /* renamed from: EL */
    public static final int f8997EL = 248;
    public static final int EOF = 236;
    public static final int EOR = 239;

    /* renamed from: GA */
    public static final int f8998GA = 249;
    public static final int IAC = 255;

    /* renamed from: IP */
    public static final int f8999IP = 244;
    public static final int MAX_COMMAND_VALUE = 255;
    public static final int NOP = 241;

    /* renamed from: SB */
    public static final int f9000SB = 250;

    /* renamed from: SE */
    public static final int f9001SE = 240;
    public static final int SUSP = 237;
    public static final int SYNCH = 242;
    public static final int WILL = 251;
    public static final int WONT = 252;
    private static final int __FIRST_COMMAND = 255;
    private static final int __LAST_COMMAND = 236;
    private static final String[] __commandString = {"IAC", "DONT", "DO", "WONT", "WILL", "SB", "GA", "EL", "EC", "AYT", "AO", "IP", "BRK", "DMARK", "NOP", "SE", "EOR", "ABORT", "SUSP", "EOF"};

    static {
    }

    public static final String getCommand(int i) {
        return __commandString[255 - i];
    }

    public static final boolean isValidCommand(int i) {
        return i <= 255 && i >= 236;
    }

    private TelnetCommand() {
    }
}
