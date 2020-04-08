package p004o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import p004o.C0643pc.aux;

/* renamed from: o.ah */
class C0183ah extends C0757sv {

    /* renamed from: ˮ͈ */
    protected HashMap<Class<? extends C0839ue>, C0184> f377;

    /* renamed from: 櫯 */
    int[] f378;

    /* renamed from: o.ah$鷭 */
    public class C0184 {

        /* renamed from: ȃ */
        int[] f380;

        /* renamed from: ˮ͈ */
        int f381;

        /* renamed from: 櫯 */
        short f382;

        /* renamed from: 鷭 */
        Class<? extends C0839ue> f383;

        C0184(Class<? extends C0839ue> cls, int i, int i2, int[] iArr) {
            this.f383 = cls;
            this.f382 = (short) i;
            this.f381 = i2;
            this.f380 = iArr;
        }
    }

    /* renamed from: 鷭 */
    public void mo3532(C0839ue ueVar, ByteBuffer byteBuffer, int i) {
        Class cls = ueVar.getClass();
        C0184 r2 = (C0184) this.f377.get(cls);
        if (r2 != null) {
            new StringBuilder("Remapped ").append(cls).append(" -> 0x").append(Integer.toHexString(r2.f382));
            byteBuffer.putShort(i, r2.f382);
        }
    }

    /* renamed from: 鷭 */
    public void mo3531(C0652pd pdVar, int i) {
        C0184 r3 = (C0184) this.f377.get(pdVar.getClass());
        if (r3 != null) {
            pdVar.f4538.position(r3.f380[i] - 2);
        }
    }

    /* renamed from: 鷭 */
    public void mo3530(C0652pd pdVar) {
        C0184 r3 = (C0184) this.f377.get(pdVar.getClass());
        if (r3 != null) {
            if (r3.f381 <= 0) {
                throw new IllegalArgumentException();
            }
            pdVar.f4538.position(r3.f381 - 2);
        }
    }

    protected C0183ah() {
        C0838ud[] udVarArr = new C0838ud[427];
        udVarArr[0] = new C1808();
        udVarArr[1] = new C1103();
        udVarArr[2] = new C1393();
        udVarArr[3] = new C1803();
        udVarArr[4] = new C1828();
        udVarArr[5] = new C1136();
        udVarArr[6] = new C1774();
        udVarArr[7] = new C1972();
        udVarArr[8] = new C2037();
        udVarArr[9] = new C1408();
        udVarArr[10] = new C1811();
        udVarArr[11] = new C1407();
        udVarArr[12] = new C1970();
        udVarArr[13] = new C1974();
        try {
            udVarArr[14] = C2117$.m2299("o.朤").getDeclaredConstructor(null).newInstance(null);
            udVarArr[15] = new C1283();
            udVarArr[16] = new C1099();
            udVarArr[17] = new C1098();
            udVarArr[18] = new C1605();
            udVarArr[19] = new C1952();
            udVarArr[20] = new C1280();
            udVarArr[21] = new C1927();
            udVarArr[22] = new C1137();
            udVarArr[23] = new C1889();
            udVarArr[24] = new C1754();
            udVarArr[25] = new C1642();
            try {
                udVarArr[26] = C2118$.m2543("o.ꉴ").getDeclaredConstructor(null).newInstance(null);
                udVarArr[27] = new C1764();
                udVarArr[28] = new C1139();
                udVarArr[29] = new C1829();
                udVarArr[30] = new C1131();
                udVarArr[31] = new C1851();
                udVarArr[32] = C1014.f6140.f4470 >= 20071106 ? new C1262() : new C2033();
                udVarArr[33] = new C1600();
                udVarArr[34] = new C1689();
                udVarArr[35] = new C1388();
                udVarArr[36] = new C2046();
                udVarArr[37] = new C1412();
                udVarArr[38] = new C1594();
                udVarArr[39] = new C2002();
                udVarArr[40] = new C1685();
                udVarArr[41] = new C1387();
                udVarArr[42] = new C2021();
                udVarArr[43] = new C1381();
                udVarArr[44] = new C1741();
                udVarArr[45] = C1014.f6140.f4470 >= 20071106 ? new C1943() : new C2011();
                udVarArr[46] = new C1411();
                udVarArr[47] = new C1397();
                udVarArr[48] = new C1464();
                udVarArr[49] = new C1763();
                udVarArr[50] = new C1380();
                udVarArr[51] = new C1435();
                udVarArr[52] = new C1404();
                udVarArr[53] = new C1759();
                udVarArr[54] = new C1891();
                udVarArr[55] = new C1962();
                udVarArr[56] = new C2028();
                udVarArr[57] = new C1274();
                udVarArr[58] = new C1521();
                udVarArr[59] = new C1125();
                udVarArr[60] = new C1466();
                udVarArr[61] = new C1189();
                udVarArr[62] = new C2006();
                udVarArr[63] = new C1194();
                udVarArr[64] = new C1481();
                udVarArr[65] = new C1195();
                udVarArr[66] = new C1196();
                udVarArr[67] = new C1841();
                udVarArr[68] = new C1872();
                udVarArr[69] = new C1593();
                udVarArr[70] = new C1191();
                udVarArr[71] = new C1192();
                udVarArr[72] = new C1525();
                udVarArr[73] = new C1843();
                udVarArr[74] = new C1555();
                udVarArr[75] = new C1607();
                udVarArr[76] = new C1198();
                udVarArr[77] = new C1765();
                udVarArr[78] = new C1755();
                udVarArr[79] = new C1363();
                udVarArr[80] = new C1147();
                udVarArr[81] = new C1847();
                udVarArr[82] = new C1146();
                udVarArr[83] = new C1661();
                udVarArr[84] = new C1551();
                udVarArr[85] = new C1840();
                udVarArr[86] = new C1359();
                udVarArr[87] = new C1713();
                udVarArr[88] = new C1586();
                udVarArr[89] = new C1587();
                udVarArr[90] = new C1418();
                udVarArr[91] = new C1591();
                udVarArr[92] = new C1475();
                udVarArr[93] = new C1121();
                udVarArr[94] = new C1148();
                udVarArr[95] = new C1138();
                udVarArr[96] = new C1949();
                udVarArr[97] = new C1682();
                udVarArr[98] = new C1385();
                udVarArr[99] = new C1643();
                udVarArr[100] = new C2001();
                udVarArr[101] = new C1822();
                udVarArr[102] = new C1897();
                udVarArr[103] = new C1825();
                udVarArr[104] = new C1742();
                udVarArr[105] = new C1602();
                udVarArr[106] = new C1145();
                udVarArr[107] = new C1749();
                udVarArr[108] = new C1830();
                udVarArr[109] = new C1130();
                udVarArr[110] = new C1552();
                udVarArr[111] = new C2005();
                udVarArr[112] = new C1451();
                udVarArr[113] = new C1447();
                udVarArr[114] = new C1928();
                udVarArr[115] = new C1135();
                udVarArr[116] = new C1235();
                udVarArr[117] = new C1179();
                udVarArr[118] = new C1971();
                udVarArr[119] = new C2035();
                udVarArr[120] = new C1119();
                udVarArr[121] = new C2030();
                udVarArr[122] = new C1405();
                udVarArr[123] = new C1263();
                udVarArr[124] = new C2049();
                udVarArr[125] = new C1604();
                udVarArr[126] = new C1143();
                udVarArr[127] = new C1142();
                udVarArr[128] = new C1403();
                udVarArr[129] = new C1740();
                udVarArr[130] = new C1878();
                udVarArr[131] = new C2010();
                udVarArr[132] = new C2054();
                udVarArr[133] = new C1473();
                udVarArr[134] = new C1936();
                udVarArr[135] = new C1149();
                udVarArr[136] = new C1150();
                udVarArr[137] = new C1513();
                udVarArr[138] = new C1779();
                udVarArr[139] = new C1414();
                udVarArr[140] = new C1268();
                udVarArr[141] = new C1495();
                udVarArr[142] = new C1950();
                udVarArr[143] = new C1269();
                udVarArr[144] = new C1747();
                udVarArr[145] = new C1371();
                udVarArr[146] = new C1349();
                udVarArr[147] = C1014.f6140.f4443 == aux.iRO_Renewal ? new C1866() : new C1597();
                udVarArr[148] = C1014.f6140.f4443 == aux.iRO_Renewal ? new C1116() : new C1117();
                udVarArr[149] = new C1297();
                udVarArr[150] = new C1658();
                udVarArr[151] = new C1772();
                udVarArr[152] = new C1979();
                udVarArr[153] = new C1126();
                udVarArr[154] = new C1127();
                udVarArr[155] = new C1519();
                udVarArr[156] = new C1474();
                udVarArr[157] = new C1424();
                udVarArr[158] = new C1221();
                udVarArr[159] = new C1817();
                udVarArr[160] = new C1445();
                udVarArr[161] = new C1498();
                udVarArr[162] = new C1988();
                udVarArr[163] = new C1367();
                udVarArr[164] = new C1729();
                udVarArr[165] = new C1261();
                udVarArr[166] = new C1470();
                udVarArr[167] = new C1670();
                udVarArr[168] = new C1265();
                udVarArr[169] = new C1423();
                udVarArr[170] = new C1186();
                udVarArr[171] = new C1187();
                udVarArr[172] = new C1167();
                udVarArr[173] = new C1948();
                udVarArr[174] = new C2015();
                udVarArr[175] = new C1662();
                udVarArr[176] = new C1900();
                udVarArr[177] = new C1954();
                udVarArr[178] = new C1684();
                udVarArr[179] = new C1522();
                udVarArr[180] = new C1180();
                udVarArr[181] = new C1370();
                udVarArr[182] = new C1757();
                udVarArr[183] = new C1862();
                udVarArr[184] = new C1935();
                udVarArr[185] = new C1581();
                udVarArr[186] = new C1182();
                udVarArr[187] = new C1651();
                udVarArr[188] = new C1243();
                udVarArr[189] = new C1241();
                udVarArr[190] = new C1118();
                udVarArr[191] = new C2051();
                udVarArr[192] = new C1260();
                udVarArr[193] = new C1242();
                udVarArr[194] = new C1801();
                udVarArr[195] = new C1133();
                udVarArr[196] = new C1550();
                udVarArr[197] = new C1277();
                udVarArr[198] = new C1441();
                udVarArr[199] = new C1901();
                udVarArr[200] = new C1969();
                udVarArr[201] = new C2032();
                udVarArr[202] = new C1406();
                udVarArr[203] = new C1376();
                udVarArr[204] = new C1217();
                udVarArr[205] = new C1687();
                udVarArr[206] = new C1534();
                udVarArr[207] = new C1275();
                udVarArr[208] = new C1200();
                udVarArr[209] = new C1620();
                udVarArr[210] = new C2020();
                udVarArr[211] = C1014.f6140.f4458 ? new C1705() : new C1154();
                udVarArr[212] = C1014.f6140.f4458 ? new C1158() : new C1833();
                udVarArr[213] = new C1869();
                udVarArr[214] = new C1152();
                udVarArr[215] = new C1159();
                udVarArr[216] = new C1225();
                udVarArr[217] = new C1486();
                udVarArr[218] = new C1226();
                udVarArr[219] = new C1773();
                udVarArr[220] = new C1596();
                udVarArr[221] = new C1233();
                udVarArr[222] = new C1487();
                udVarArr[223] = new C1234();
                udVarArr[224] = new C1232();
                udVarArr[225] = new C1230();
                udVarArr[226] = new C1874();
                udVarArr[227] = new C1228();
                udVarArr[228] = new C1236();
                udVarArr[229] = new C1239();
                udVarArr[230] = new C1595();
                udVarArr[231] = new C1223();
                udVarArr[232] = new C1849();
                udVarArr[233] = new C1240();
                udVarArr[234] = new C1805();
                udVarArr[235] = new C1446();
                udVarArr[236] = new C1271();
                udVarArr[237] = new C1544();
                udVarArr[238] = new C1956();
                udVarArr[239] = new C1955();
                udVarArr[240] = new C1399();
                udVarArr[241] = new C1553();
                udVarArr[242] = new C1797();
                udVarArr[243] = new C1427();
                udVarArr[244] = new C1270();
                udVarArr[245] = new C1518();
                udVarArr[246] = new C2023();
                udVarArr[247] = new C2017();
                udVarArr[248] = new C1614();
                udVarArr[249] = new C2019();
                udVarArr[250] = new C1400();
                udVarArr[251] = new C1583();
                udVarArr[252] = new C1129();
                udVarArr[253] = new C1482();
                udVarArr[254] = new C1485();
                udVarArr[255] = new C1203();
                udVarArr[256] = new C1471();
                udVarArr[257] = new C1951();
                udVarArr[258] = new C1824();
                udVarArr[259] = new C1201();
                udVarArr[260] = new C1482();
                udVarArr[261] = new C1183();
                udVarArr[262] = new C1184();
                udVarArr[263] = new C1278();
                udVarArr[264] = new C1751();
                udVarArr[265] = new C1462();
                udVarArr[266] = new C1396();
                udVarArr[267] = new C1469();
                udVarArr[268] = new C1169();
                udVarArr[269] = new C1202();
                udVarArr[270] = new C1207();
                udVarArr[271] = new C1448();
                udVarArr[272] = new C1845();
                udVarArr[273] = new C1209();
                udVarArr[274] = new C1995();
                udVarArr[275] = new C1821();
                udVarArr[276] = new C1108();
                udVarArr[277] = new C1237();
                udVarArr[278] = new C1282();
                udVarArr[279] = new C1238();
                udVarArr[280] = new C1939();
                udVarArr[281] = new C1599();
                udVarArr[282] = new C1123();
                udVarArr[283] = new C1144();
                udVarArr[284] = new C1692();
                udVarArr[285] = new C1389();
                udVarArr[286] = new C1335();
                udVarArr[287] = new C1590();
                udVarArr[288] = new C1673();
                udVarArr[289] = new C1835();
                udVarArr[290] = new C1160();
                udVarArr[291] = new C1177();
                udVarArr[292] = new C1478();
                udVarArr[293] = new C1806();
                udVarArr[294] = new C1854();
                udVarArr[295] = new C1549();
                udVarArr[296] = new C1477();
                udVarArr[297] = new C1837();
                udVarArr[298] = new C1170();
                udVarArr[299] = new C1172();
                udVarArr[300] = new C1176();
                udVarArr[301] = new C1638();
                udVarArr[302] = new C1836();
                udVarArr[303] = new C1168();
                udVarArr[304] = new C1698();
                udVarArr[305] = new C1769();
                udVarArr[306] = new C1162();
                udVarArr[307] = new C1164();
                udVarArr[308] = new C1174();
                udVarArr[309] = new C1181();
                udVarArr[310] = new C1703();
                udVarArr[311] = new C1634();
                udVarArr[312] = new C1960();
                udVarArr[313] = new C1272();
                udVarArr[314] = new C1853();
                udVarArr[315] = new C1491();
                udVarArr[316] = new C1402();
                udVarArr[317] = new C2025();
                udVarArr[318] = new C1580();
                udVarArr[319] = new C1957();
                udVarArr[320] = new C1804();
                udVarArr[321] = new C1981();
                udVarArr[322] = new C1823();
                udVarArr[323] = new C1115();
                udVarArr[324] = new C1465();
                udVarArr[325] = new C1112();
                udVarArr[326] = new C1463();
                udVarArr[327] = new C1113();
                udVarArr[328] = new C1668();
                udVarArr[329] = new C1358();
                udVarArr[330] = new C1567();
                udVarArr[331] = new C1827();
                udVarArr[332] = new C1332();
                udVarArr[333] = new C1760();
                udVarArr[334] = new C1141();
                udVarArr[335] = new C1931();
                udVarArr[336] = new C1566();
                udVarArr[337] = new C1211();
                udVarArr[338] = new C1589();
                udVarArr[339] = new C1461();
                udVarArr[340] = new C1820();
                udVarArr[341] = new C1870();
                udVarArr[342] = new C1253();
                udVarArr[343] = new C1255();
                udVarArr[344] = new C1730();
                udVarArr[345] = new C1966();
                udVarArr[346] = new C1352();
                udVarArr[347] = new C1250();
                udVarArr[348] = new C1251();
                udVarArr[349] = new C1254();
                udVarArr[350] = new C1312();
                udVarArr[351] = new C1267();
                udVarArr[352] = new C2056();
                udVarArr[353] = new C1247();
                udVarArr[354] = new C1875();
                udVarArr[355] = new C1778();
                udVarArr[356] = new C1256();
                udVarArr[357] = new C1107();
                udVarArr[358] = new C1266();
                udVarArr[359] = new C1199();
                udVarArr[360] = new C1480();
                udVarArr[361] = new C1704();
                udVarArr[362] = new C1190();
                udVarArr[363] = new C2047();
                udVarArr[364] = new C1244();
                udVarArr[365] = new C1678();
                udVarArr[366] = new C1382();
                udVarArr[367] = new C1846();
                udVarArr[368] = new C1489();
                udVarArr[369] = new C1206();
                udVarArr[370] = new C1476();
                udVarArr[371] = new C1499();
                udVarArr[372] = new C1479();
                udVarArr[373] = new C1204();
                udVarArr[374] = new C1912();
                udVarArr[375] = new C1985();
                udVarArr[376] = new C1109();
                udVarArr[377] = new C1362();
                udVarArr[378] = new C1216();
                udVarArr[379] = new C1218();
                udVarArr[380] = new C1546();
                udVarArr[381] = new C1401();
                udVarArr[382] = new C1540();
                udVarArr[383] = new C1640();
                udVarArr[384] = new C1737();
                udVarArr[385] = new C2026();
                udVarArr[386] = new C1831();
                udVarArr[387] = new C1398();
                udVarArr[388] = new C1185();
                udVarArr[389] = new C1989();
                udVarArr[390] = new C1728();
                try {
                    udVarArr[391] = $.m2149("o.䈭").getDeclaredConstructor(null).newInstance(null);
                    udVarArr[392] = new C1983();
                    udVarArr[393] = new C1457();
                    udVarArr[394] = new C1625();
                    udVarArr[395] = new C1484();
                    udVarArr[396] = new C1213();
                    udVarArr[397] = new C1214();
                    udVarArr[398] = new C1394();
                    udVarArr[399] = new C1212();
                    udVarArr[400] = new C1892();
                    udVarArr[401] = new C1584();
                    udVarArr[402] = new C1383();
                    udVarArr[403] = new C1690();
                    udVarArr[404] = new C1258();
                    udVarArr[405] = new C1669();
                    udVarArr[406] = new C1259();
                    udVarArr[407] = new C1946();
                    udVarArr[408] = new C1680();
                    udVarArr[409] = new C1333();
                    udVarArr[410] = new C1887();
                    udVarArr[411] = new C1347();
                    udVarArr[412] = new C1554();
                    udVarArr[413] = new C1628();
                    udVarArr[414] = new C1110();
                    udVarArr[415] = new C1104();
                    udVarArr[416] = new C1307();
                    udVarArr[417] = new C1025();
                    udVarArr[418] = new C1422();
                    udVarArr[419] = new C1571();
                    udVarArr[420] = new C1023();
                    udVarArr[421] = new C1944();
                    udVarArr[422] = new C1541();
                    udVarArr[423] = new C1975();
                    udVarArr[424] = new C2039();
                    udVarArr[425] = new C1693();
                    udVarArr[426] = C1014.f6140.f4524 ? new C2004() : new C1409();
                    super(udVarArr, true);
                    this.f377 = new HashMap<>();
                } catch (Throwable th) {
                    throw th.getCause();
                }
            } catch (Throwable th2) {
                throw th2.getCause();
            }
        } catch (Throwable th3) {
            throw th3.getCause();
        }
    }
}
