package p004o;

/* renamed from: o.稕 */
final class C1714 {

    /* renamed from: Ą */
    String f7900;

    /* renamed from: ȃ */
    String f7901;

    /* renamed from: ˮ͈ */
    C1719 f7902 = new C1719();

    /* renamed from: 櫯 */
    C1715if f7903 = new C1715if();

    /* renamed from: 鷭 */
    C1718 f7904 = new C1718();

    /* renamed from: o.稕$if */
    class C1715if {

        /* renamed from: Ą */
        String f7905;

        /* renamed from: ą */
        String f7906;

        /* renamed from: Ć */
        C1716if f7907 = new C1716if();

        /* renamed from: ć */
        C1717 f7908 = new C1717();

        /* renamed from: ȃ */
        String f7909;

        /* renamed from: ˮ͈ */
        String f7910;

        /* renamed from: 櫯 */
        String f7912;

        /* renamed from: 鷭 */
        String f7913;

        /* renamed from: o.稕$if$if */
        class C1716if {

            /* renamed from: Ą */
            String f7914;

            /* renamed from: ȃ */
            String f7916;

            /* renamed from: ˮ͈ */
            String f7917;

            /* renamed from: 櫯 */
            String f7918;

            /* renamed from: 鷭 */
            String f7919;

            C1716if() {
            }
        }

        /* renamed from: o.稕$if$鷭 */
        class C1717 {

            /* renamed from: ȃ */
            String f7921;

            /* renamed from: ˮ͈ */
            String f7922;

            /* renamed from: 櫯 */
            String f7923;

            /* renamed from: 鷭 */
            String f7924;

            C1717() {
            }
        }

        C1715if() {
        }
    }

    /* renamed from: o.稕$櫯 */
    class C1718 {

        /* renamed from: ˮ͈ */
        String f7926;

        /* renamed from: 櫯 */
        String f7927;

        /* renamed from: 鷭 */
        String f7928;

        C1718() {
        }
    }

    /* renamed from: o.稕$鷭 */
    class C1719 {

        /* renamed from: 櫯 */
        String f7930;

        /* renamed from: 鷭 */
        String f7931;

        C1719() {
        }
    }

    C1714(String str) {
        String[] split;
        for (String str2 : str.split("\n")) {
            if (!str2.startsWith("//") && !str2.startsWith("\n")) {
                String[] split2 = str2.split(":", 2);
                if (split2 != null && split2.length >= 2) {
                    split2[0] = split2[0].trim();
                    split2[1] = split2[1].trim();
                    if (split2[0].equals("texture/user_interface")) {
                        this.f7904.f7928 = split2[1];
                    } else if (split2[0].equals("texture/water")) {
                        this.f7904.f7927 = split2[1];
                    } else if (split2[0].equals("texture/user_interface/background")) {
                        this.f7904.f7926 = split2[1];
                    } else if (split2[0].equals("sprite/male")) {
                        this.f7901 = split2[1];
                    } else if (split2[0].equals("sprite/female")) {
                        this.f7900 = split2[1];
                    } else if (split2[0].equals("sprite/monster")) {
                        this.f7903.f7913 = split2[1];
                    } else if (split2[0].equals("sprite/shields")) {
                        this.f7903.f7912 = split2[1];
                    } else if (split2[0].equals("sprite/skillicon")) {
                        this.f7903.f7910 = split2[1];
                    } else if (split2[0].equals("sprite/headgear")) {
                        this.f7903.f7909 = split2[1];
                    } else if (split2[0].equals("sprite/unknown")) {
                        this.f7903.f7905 = split2[1];
                    } else if (split2[0].equals("sprite/player")) {
                        this.f7903.f7907.f7919 = split2[1];
                    } else if (split2[0].equals("sprite/doram")) {
                        this.f7903.f7907.f7918 = split2[1];
                    } else if (split2[0].equals("sprite/robe")) {
                        this.f7903.f7906 = split2[1];
                    } else if (split2[0].equals("sprite/effect")) {
                        this.f7903.f7908.f7924 = split2[1];
                    } else if (split2[0].equals("sprite/effect/cart_prefix")) {
                        this.f7903.f7908.f7923 = split2[1];
                    } else if (split2[0].equals("sprite/effect/baby_cart_postfix")) {
                        this.f7903.f7908.f7922 = split2[1];
                    } else if (split2[0].equals("sprite/effect/damage")) {
                        this.f7903.f7908.f7921 = split2[1];
                    } else if (split2[0].equals("sprite/player/body")) {
                        this.f7903.f7907.f7917 = split2[1];
                    } else if (split2[0].equals("sprite/player/head")) {
                        this.f7903.f7907.f7916 = split2[1];
                    } else if (split2[0].equals("sprite/player/weapontrail")) {
                        this.f7903.f7907.f7914 = split2[1];
                    } else if (split2[0].equals("palette/hair")) {
                        this.f7902.f7931 = split2[1];
                    } else if (split2[0].equals("palette/cloth")) {
                        this.f7902.f7930 = split2[1];
                    }
                }
            }
        }
    }
}
