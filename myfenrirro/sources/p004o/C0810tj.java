package p004o;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: o.tj */
final class C0810tj {
    C0810tj() {
    }

    /* renamed from: 鷭 */
    static void m1508(Object obj, ByteBuffer byteBuffer) {
        if (obj != null) {
            Class<Character> cls = obj.getClass();
            if (cls == byte[].class || cls == Byte[].class) {
                byteBuffer.put((byte[]) obj);
            } else if (cls.isArray()) {
                for (int i = 0; i < Array.getLength(obj); i++) {
                    m1508(Array.get(obj, i), byteBuffer);
                }
            } else if (cls == Byte.TYPE || cls == Byte.class) {
                byteBuffer.put(((Byte) obj).byteValue());
            } else if (cls == Short.TYPE || cls == Short.class) {
                byteBuffer.putShort(((Short) obj).shortValue());
            } else if (cls == Integer.TYPE || cls == Integer.class) {
                byteBuffer.putInt(((Integer) obj).intValue());
            } else if (cls == Long.TYPE || cls == Long.class) {
                byteBuffer.putLong(((Long) obj).longValue());
            } else if (cls == Character.TYPE || cls == Character.class) {
                byteBuffer.putChar(((Character) obj).charValue());
            } else if (cls.isEnum()) {
                byteBuffer.putInt(((Enum) obj).ordinal());
            } else if (cls.isPrimitive()) {
                throw new RuntimeException("Unsupported primitive type.");
            } else {
                ArrayList arrayList = new ArrayList();
                Class<Object> cls2 = obj.getClass();
                do {
                    arrayList.add(0, cls2);
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        break;
                    }
                } while (cls2 != Object.class);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field[] declaredFields = ((Class) it.next()).getDeclaredFields();
                    for (int i2 = 0; i2 < declaredFields.length; i2++) {
                        if (!(declaredFields[i2].getAnnotation(C0845uk.class) != null)) {
                            declaredFields[i2] = null;
                        }
                    }
                    Arrays.sort(declaredFields, C0846ul.f5069);
                    Field[] fieldArr = declaredFields;
                    int length = declaredFields.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        Field field = fieldArr[i3];
                        if (field != null) {
                            field.setAccessible(true);
                            try {
                                Object obj2 = field.get(obj);
                                if (!field.getType().isEnum() || obj2 != null) {
                                    m1508(obj2, byteBuffer);
                                } else {
                                    m1508(Integer.valueOf(0), byteBuffer);
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0131, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0139, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x013f, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0140, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0146, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012b A[ExcHandler: InstantiationException (r6v7 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:55:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0139 A[Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140, NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140, IllegalAccessException -> 0x01ce }, ExcHandler: IllegalArgumentException (r6v6 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:55:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0140 A[Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140, NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140, IllegalAccessException -> 0x01ce }, ExcHandler: InvocationTargetException (r6v5 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:55:0x00bb] */
    /* renamed from: 鷭 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m1510(java.nio.ByteBuffer r7, java.lang.Object r8, java.lang.reflect.Field r9, int r10) {
        /*
            r0 = 1
            r9.setAccessible(r0)
            java.lang.Class r3 = r9.getType()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Class r4 = r3.getComponentType()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Object r5 = r9.get(r8)     // Catch:{ IllegalAccessException -> 0x01ce }
            boolean r0 = r3.isArray()     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r0 == 0) goto L_0x0147
            if (r10 < 0) goto L_0x0023
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r4, r10)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Object r5 = r9.get(r8)     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0023:
            int r10 = java.lang.reflect.Array.getLength(r5)     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Class<byte[]> r0 = byte[].class
            if (r3 == r0) goto L_0x002f
            java.lang.Class<java.lang.Byte[]> r0 = java.lang.Byte[].class
            if (r3 != r0) goto L_0x0038
        L_0x002f:
            byte[] r6 = new byte[r10]     // Catch:{ IllegalAccessException -> 0x01ce }
            r7.get(r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x0038:
            java.lang.Class<short[]> r0 = short[].class
            if (r3 == r0) goto L_0x0040
            java.lang.Class<java.lang.Short[]> r0 = java.lang.Short[].class
            if (r3 != r0) goto L_0x0052
        L_0x0040:
            short[] r6 = new short[r10]     // Catch:{ IllegalAccessException -> 0x01ce }
            r3 = 0
            goto L_0x004c
        L_0x0044:
            short r0 = r7.getShort()     // Catch:{ IllegalAccessException -> 0x01ce }
            r6[r3] = r0     // Catch:{ IllegalAccessException -> 0x01ce }
            int r3 = r3 + 1
        L_0x004c:
            if (r3 < r10) goto L_0x0044
            r9.set(r8, r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x0052:
            java.lang.Class<int[]> r0 = int[].class
            if (r3 == r0) goto L_0x005a
            java.lang.Class<java.lang.Integer[]> r0 = java.lang.Integer[].class
            if (r3 != r0) goto L_0x006c
        L_0x005a:
            int[] r6 = new int[r10]     // Catch:{ IllegalAccessException -> 0x01ce }
            r3 = 0
            goto L_0x0066
        L_0x005e:
            int r0 = r7.getInt()     // Catch:{ IllegalAccessException -> 0x01ce }
            r6[r3] = r0     // Catch:{ IllegalAccessException -> 0x01ce }
            int r3 = r3 + 1
        L_0x0066:
            if (r3 < r10) goto L_0x005e
            r9.set(r8, r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x006c:
            java.lang.Class<long[]> r0 = long[].class
            if (r3 == r0) goto L_0x0074
            java.lang.Class<java.lang.Long[]> r0 = java.lang.Long[].class
            if (r3 != r0) goto L_0x0086
        L_0x0074:
            long[] r6 = new long[r10]     // Catch:{ IllegalAccessException -> 0x01ce }
            r3 = 0
            goto L_0x0080
        L_0x0078:
            long r0 = r7.getLong()     // Catch:{ IllegalAccessException -> 0x01ce }
            r6[r3] = r0     // Catch:{ IllegalAccessException -> 0x01ce }
            int r3 = r3 + 1
        L_0x0080:
            if (r3 < r10) goto L_0x0078
            r9.set(r8, r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x0086:
            java.lang.Class<char[]> r0 = char[].class
            if (r3 == r0) goto L_0x008e
            java.lang.Class<java.lang.Character[]> r0 = java.lang.Character[].class
            if (r3 != r0) goto L_0x00a0
        L_0x008e:
            char[] r6 = new char[r10]     // Catch:{ IllegalAccessException -> 0x01ce }
            r3 = 0
            goto L_0x009a
        L_0x0092:
            char r0 = r7.getChar()     // Catch:{ IllegalAccessException -> 0x01ce }
            r6[r3] = r0     // Catch:{ IllegalAccessException -> 0x01ce }
            int r3 = r3 + 1
        L_0x009a:
            if (r3 < r10) goto L_0x0092
            r9.set(r8, r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x00a0:
            boolean r0 = r3.isEnum()     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r0 == 0) goto L_0x00ba
            r6 = 0
            goto L_0x00b7
        L_0x00a8:
            java.lang.Object[] r0 = r3.getEnumConstants()     // Catch:{ IllegalAccessException -> 0x01ce }
            int r1 = r7.getInt()     // Catch:{ IllegalAccessException -> 0x01ce }
            r0 = r0[r1]     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.reflect.Array.set(r5, r6, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            int r6 = r6 + 1
        L_0x00b7:
            if (r6 < r10) goto L_0x00a8
            return
        L_0x00ba:
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Class r1 = r4.getDeclaringClass()     // Catch:{ NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            r2 = 0
            r0[r2] = r1     // Catch:{ NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.reflect.Constructor r6 = r4.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x00c9, InstantiationException -> 0x012b, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            goto L_0x00ce
        L_0x00c9:
            r0 = 0
            java.lang.reflect.Constructor r6 = r4.getDeclaredConstructor(r0)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
        L_0x00ce:
            r0 = 1
            r6.setAccessible(r0)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Class r9 = r6.getDeclaringClass()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Class r10 = r9.getEnclosingClass()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            r0.<init>()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.StringBuilder r0 = r0.append(r9)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.String r1 = " enclosed by "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Class r1 = r9.getEnclosingClass()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            r0.append(r1)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            p004o.C0624ov.m757()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Class r0 = r8.getClass()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            if (r9 != r0) goto L_0x00fb
            r3 = r8
            goto L_0x0105
        L_0x00fb:
            if (r10 == 0) goto L_0x0104
            if (r9 == r10) goto L_0x0104
            java.lang.Object r3 = r10.newInstance()     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            goto L_0x0105
        L_0x0104:
            r3 = 0
        L_0x0105:
            r8 = 0
            goto L_0x0124
        L_0x0107:
            if (r3 == 0) goto L_0x0114
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            r1 = 0
            r0[r1] = r3     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Object r9 = r6.newInstance(r0)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            goto L_0x011b
        L_0x0114:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.Object r9 = r6.newInstance(r0)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
        L_0x011b:
            r0 = -1
            m1509(r7, r9, r0)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            java.lang.reflect.Array.set(r5, r8, r9)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            int r8 = r8 + 1
        L_0x0124:
            int r0 = java.lang.reflect.Array.getLength(r5)     // Catch:{ InstantiationException -> 0x012b, NoSuchMethodException -> 0x0132, IllegalArgumentException -> 0x0139, InvocationTargetException -> 0x0140 }
            if (r8 < r0) goto L_0x0107
            return
        L_0x012b:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x01ce }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            throw r0     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0132:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x01ce }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            throw r0     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0139:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x01ce }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            throw r0     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0140:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x01ce }
            r0.<init>(r6)     // Catch:{ IllegalAccessException -> 0x01ce }
            throw r0     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0147:
            if (r10 < 0) goto L_0x0151
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.String r1 = "Trying to override array length of non-array field"
            r0.<init>(r1)     // Catch:{ IllegalAccessException -> 0x01ce }
            throw r0     // Catch:{ IllegalAccessException -> 0x01ce }
        L_0x0151:
            java.lang.Class r0 = java.lang.Byte.TYPE     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r3 == r0) goto L_0x0159
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r3 != r0) goto L_0x0165
        L_0x0159:
            byte r0 = r7.get()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x0165:
            java.lang.Class r0 = java.lang.Short.TYPE     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r3 == r0) goto L_0x016d
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r3 != r0) goto L_0x0179
        L_0x016d:
            short r0 = r7.getShort()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x0179:
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r3 == r0) goto L_0x0181
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r3 != r0) goto L_0x018d
        L_0x0181:
            int r0 = r7.getInt()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x018d:
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r3 == r0) goto L_0x0195
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r3 != r0) goto L_0x01a1
        L_0x0195:
            long r0 = r7.getLong()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x01a1:
            java.lang.Class r0 = java.lang.Character.TYPE     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r3 == r0) goto L_0x01a9
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r3 != r0) goto L_0x01b5
        L_0x01a9:
            char r0 = r7.getChar()     // Catch:{ IllegalAccessException -> 0x01ce }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x01b5:
            boolean r0 = r3.isEnum()     // Catch:{ IllegalAccessException -> 0x01ce }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object[] r0 = r3.getEnumConstants()     // Catch:{ IllegalAccessException -> 0x01ce }
            int r1 = r7.getInt()     // Catch:{ IllegalAccessException -> 0x01ce }
            r0 = r0[r1]     // Catch:{ IllegalAccessException -> 0x01ce }
            r9.set(r8, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x01c9:
            r0 = -1
            m1509(r7, r5, r0)     // Catch:{ IllegalAccessException -> 0x01ce }
            return
        L_0x01ce:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0810tj.m1510(java.nio.ByteBuffer, java.lang.Object, java.lang.reflect.Field, int):void");
    }

    /* renamed from: 鷭 */
    static final void m1509(ByteBuffer byteBuffer, Object obj, int i) {
        try {
            ArrayList arrayList = new ArrayList();
            Class<Object> cls = obj.getClass();
            do {
                arrayList.add(0, cls);
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
            } while (cls != Object.class);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field[] declaredFields = ((Class) it.next()).getDeclaredFields();
                for (int i2 = 0; i2 < declaredFields.length; i2++) {
                    if (!(declaredFields[i2].getAnnotation(C0845uk.class) != null)) {
                        declaredFields[i2] = null;
                    }
                }
                Arrays.sort(declaredFields, C0846ul.f5069);
                Field[] fieldArr = declaredFields;
                int length = declaredFields.length;
                for (int i3 = 0; i3 < length; i3++) {
                    Field field = fieldArr[i3];
                    if (field != null) {
                        arrayList2.add(field);
                    }
                }
            }
            Field field2 = null;
            if (arrayList2.size() > 0) {
                field2 = (Field) arrayList2.get(arrayList2.size() - 1);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Field field3 = (Field) it2.next();
                m1510(byteBuffer, obj, field3, field3 == field2 ? i : -1);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
