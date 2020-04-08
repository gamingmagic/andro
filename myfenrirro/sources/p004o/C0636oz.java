package p004o;

/* renamed from: o.oz */
public enum C0636oz {
    BC_KEEPALIVE_ACK(67),
    BC_VERIFYPURCHASEACK,
    CB_KEEPALIVE,
    CB_VERIFYPURCHASE,
    RB_AUTHREQ,
    BR_AUTHREPLY,
    BR_ADDPOINTSREQ,
    RB_ADDPOINTSACK,
    CB_SERVERNAME,
    CB_RESOURCEREQ,
    BC_RESOURCEACK,
    BC_RESOURCECHUNK,
    BC_RESOURCEFINISH,
    CB_RESOURCEREQ_ASCII,
    BC_RESOURCEACK_ASCII,
    CB_SERVERNAME_ASCII,
    CB_CRASHREPORT,
    BC_SHOWMESSAGEBOX,
    CB_VERSIONINFO,
    CB_RESOURCESIZEREQ,
    BC_RESOURCESIZEACK,
    CB_CLIENTCHECKSUMREQ,
    BC_CLIENTCHECKSUM,
    CB_RESOURCEREQ2,
    BC_RESOURCEACK2,
    CB_SERVERNAME2,
    CB_LOGMESSAGE;
    

    /* renamed from: 囃 */
    public short f4229;

    static {
        C0636oz[] values = values();
        int i = -1;
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].f4229 != 0) {
                i = values[i2].f4229;
            } else {
                values[i2].f4229 = (short) (i + 1);
                i++;
            }
        }
    }

    private C0636oz(int i) {
        this.f4229 = 67;
    }
}
