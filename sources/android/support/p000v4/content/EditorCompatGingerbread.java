package android.support.p000v4.content;

import android.content.SharedPreferences.Editor;

/* renamed from: android.support.v4.content.EditorCompatGingerbread */
class EditorCompatGingerbread {
    EditorCompatGingerbread() {
    }

    public static void apply(Editor editor) {
        try {
            editor.apply();
        } catch (AbstractMethodError unused) {
            editor.commit();
        }
    }
}
