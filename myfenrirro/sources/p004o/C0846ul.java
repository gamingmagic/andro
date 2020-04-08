package p004o;

import java.lang.reflect.Field;
import java.util.Comparator;

/* renamed from: o.ul */
public final class C0846ul implements Comparator<Field> {

    /* renamed from: 鷭 */
    public static C0846ul f5069 = new C0846ul();

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Field field = (Field) obj;
        Field field2 = (Field) obj2;
        Field field3 = field;
        if (field == null) {
            return 1;
        }
        if (field2 == null) {
            return -1;
        }
        C0845uk ukVar = (C0845uk) field3.getAnnotation(C0845uk.class);
        C0845uk ukVar2 = (C0845uk) field2.getAnnotation(C0845uk.class);
        if (ukVar == null) {
            throw new RuntimeException("Field " + field3.getDeclaringClass() + "." + field3.getName() + " has no @Order annotation");
        } else if (ukVar2 != null) {
            return ukVar.mo4122() - ukVar2.mo4122();
        } else {
            throw new RuntimeException("Field " + field2.getDeclaringClass() + "." + field2.getName() + " has no @Order annotation");
        }
    }

    /* renamed from: 鷭 */
    private static int m1548(Field field, Field field2) {
        if (field == null) {
            return 1;
        }
        if (field2 == null) {
            return -1;
        }
        C0845uk ukVar = (C0845uk) field.getAnnotation(C0845uk.class);
        C0845uk ukVar2 = (C0845uk) field2.getAnnotation(C0845uk.class);
        if (ukVar == null) {
            throw new RuntimeException("Field " + field.getDeclaringClass() + "." + field.getName() + " has no @Order annotation");
        } else if (ukVar2 != null) {
            return ukVar.mo4122() - ukVar2.mo4122();
        } else {
            throw new RuntimeException("Field " + field2.getDeclaringClass() + "." + field2.getName() + " has no @Order annotation");
        }
    }

    static {
    }
}
