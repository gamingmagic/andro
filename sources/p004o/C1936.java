package p004o;

import java.nio.ByteBuffer;

/* renamed from: o.뙟 */
final class C1936 extends C0762sz {

    /* renamed from: 鷭 */
    static final String[] f8719;

    C1936() {
    }

    static {
        String[] strArr = new String[89];
        strArr[1] = "Not enough SP";
        strArr[2] = "Not enough HP";
        strArr[3] = "Not enough materials";
        strArr[4] = "You can't use this skill yet";
        strArr[5] = "Not enough Zeny";
        strArr[6] = "You can't use this skill with this weapon";
        strArr[7] = "Red Gemstone required";
        strArr[8] = "Blue Gemstone required";
        strArr[9] = "You can't use skills while overweight";
        strArr[11] = "You can't use skills on this target";
        strArr[13] = "You carry too many ancilla";
        strArr[14] = "Holy Water required";
        strArr[15] = "Ancilla required";
        strArr[16] = "Duplicate distance";
        strArr[17] = "Partner is required for this skill";
        strArr[18] = "Wrong direction";
        strArr[19] = "Can't summon anymore";
        strArr[20] = "Not enough spiritballs";
        strArr[21] = "Imitation skill not exists";
        strArr[22] = "Imitation failed";
        strArr[23] = "Unable to use a skill";
        strArr[24] = "Paintbrush required";
        strArr[26] = "Can't use this skill in this area";
        strArr[27] = "Your friend's HP is too low";
        strArr[31] = "Weapon blocking is not active";
        strArr[32] = "Poisoned weapon required";
        strArr[33] = "Mado required";
        strArr[37] = "Cannonball required";
        strArr[40] = "You are not hovering";
        strArr[43] = "Poison required";
        strArr[50] = "Can't use this skill in Mado";
        strArr[51] = "Spellbook required";
        strArr[52] = "Spellbook is too difficult";
        strArr[53] = "Not enough spellbook points";
        strArr[54] = "Spellbook failed";
        strArr[57] = "Thorns seed required";
        strArr[60] = "Bomb mushroom spore required";
        strArr[71] = "Need [VAL:ITEMID] ([BTYPE:NUM])";
        strArr[72] = "[VAL:ITEMID] not equipped";
        strArr[73] = "This skill is bound with other skill";
        strArr[74] = "[BTYPE:NUM] spiritballs required";
        strArr[75] = "Explosion spirits required";
        strArr[76] = "Too many HP to use this skill";
        strArr[77] = "Banding state required";
        strArr[79] = "Elemental spirit required";
        strArr[80] = "Not enough intimacy";
        strArr[81] = "Fighter mode required";
        strArr[82] = "Grappler mode required";
        strArr[83] = "Cannot set chat room while vending";
        strArr[84] = "Insufficient bullets";
        strArr[85] = "[BTYPE:NUM] coins required";
        strArr[87] = "Cannot use skill in this map";
        strArr[88] = "Summoned SP is not enough";
        f8719 = strArr;
    }

    /* renamed from: 鷭 */
    public final void mo4052(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f4671 = 272;
        byteBuffer.getShort();
        int i3 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        int i4 = C1014.f6140.f4506 ? byteBuffer.getInt() : C0622ot.m731(byteBuffer.getShort());
        byteBuffer.get();
        byte b = byteBuffer.get();
        if (!z) {
            int r3 = C0622ot.m730(b);
            String str = null;
            if (r3 >= 0 && r3 < f8719.length) {
                str = f8719[r3];
                if (str != null) {
                    if (str.contains("[VAL:ITEMID]")) {
                        String str2 = "[VAL:ITEMID]";
                        C1701 r32 = C1014.f6158.f674.f608.mo4465(i4);
                        str = str.replace(str2, r32 == null ? null : r32.mo4462(true));
                    }
                    if (str.contains("[BTYPE:NUM]")) {
                        str = str.replace("[BTYPE:NUM]", String.valueOf(i3));
                    }
                }
            }
            if (str == null) {
                str = "Skill has failed";
            }
            C1014.f6147.f51.f1427.mo4490(str, 16711680);
        }
    }
}
