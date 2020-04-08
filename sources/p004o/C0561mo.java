package p004o;

/* renamed from: o.mo */
enum C0561mo {
    STAND(0, 0),
    WALK(1, 1),
    SIT(2, -1),
    PICK(3, -1),
    BATTLESTANCE(4, -1),
    SHOOT(5, -1),
    TAKEDAMAGE(6, 3),
    STATICDAMAGE(7, -1),
    DEAD(8, 4),
    COOLSTANCE(9, -1),
    ATK1(10, 2),
    ATK2(11, -1),
    CAST(12, 2),
    PERFORMANCE1(-1, 5),
    PERFORMANCE2(-1, 6),
    PERFORMANCE3(-1, 7),
    PERFORMANCE4(-1, 8);
    

    /* renamed from: đ */
    int f1849;

    /* renamed from: Ē */
    int f1850;

    private C0561mo(int i, int i2) {
        this.f1849 = i;
        this.f1850 = i2;
    }
}
