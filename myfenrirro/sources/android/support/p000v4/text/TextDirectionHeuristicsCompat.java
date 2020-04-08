package android.support.p000v4.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false);
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true);
    public static final TextDirectionHeuristicCompat LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$AnyStrong */
    static class AnyStrong implements TextDirectionAlgorithm {
        public static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
        public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            boolean z = false;
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                switch (TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charSequence.charAt(i4)))) {
                    case 0:
                        if (!this.mLookForRtl) {
                            z = true;
                            break;
                        } else {
                            return 0;
                        }
                    case 1:
                        if (this.mLookForRtl) {
                            z = true;
                            break;
                        } else {
                            return 1;
                        }
                }
            }
            if (z) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }

        private AnyStrong(boolean z) {
            this.mLookForRtl = z;
        }

        static {
        }
    }

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$FirstStrong */
    static class FirstStrong implements TextDirectionAlgorithm {
        public static final FirstStrong INSTANCE = new FirstStrong();

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = 2;
            int i4 = i + i2;
            for (int i5 = i; i5 < i4 && i3 == 2; i5++) {
                i3 = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i5)));
            }
            return i3;
        }

        private FirstStrong() {
        }

        static {
        }
    }

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$TextDirectionAlgorithm */
    interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicImpl */
    static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        /* access modifiers changed from: protected */
        public abstract boolean defaultIsRtl();

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl((CharSequence) CharBuffer.wrap(cArr), i, i2);
        }

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.mAlgorithm == null) {
                return defaultIsRtl();
            } else {
                return doCheck(charSequence, i, i2);
            }
        }

        private boolean doCheck(CharSequence charSequence, int i, int i2) {
            switch (this.mAlgorithm.checkRtl(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return defaultIsRtl();
            }
        }
    }

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicInternal */
    static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        private TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z;
        }

        /* access modifiers changed from: protected */
        public boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    /* renamed from: android.support.v4.text.TextDirectionHeuristicsCompat$TextDirectionHeuristicLocale */
    static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        public static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        public TextDirectionHeuristicLocale() {
            super(null);
        }

        /* access modifiers changed from: protected */
        public boolean defaultIsRtl() {
            return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }

        static {
        }
    }

    static {
    }

    /* access modifiers changed from: private */
    public static int isRtlText(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* access modifiers changed from: private */
    public static int isRtlTextOrFormat(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }

    private TextDirectionHeuristicsCompat() {
    }
}
