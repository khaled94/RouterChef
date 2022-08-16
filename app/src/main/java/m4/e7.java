package m4;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e7 implements c7, y90, ar0, vj, yl0, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f7728s;

    /* renamed from: t */
    public final /* synthetic */ Object f7729t;

    public /* synthetic */ e7(Object obj, int i10) {
        this.f7728s = i10;
        this.f7729t = obj;
    }

    @Override // m4.c7
    public final void b(byte[] bArr, byte[] bArr2) {
        n7 n7Var = (n7) this.f7729t;
        int i10 = n7Var.K1;
        int i11 = n7Var.P0;
        int i12 = (~i11) & i10;
        n7Var.f11464j0 = i12;
        int i13 = (~i12) & i10;
        n7Var.f11462i2 = i13;
        int i14 = n7Var.f11500s1;
        int i15 = n7Var.f11446e1;
        int i16 = n7Var.U1 ^ i12;
        n7Var.U1 = i16;
        int i17 = ((i14 | i13) & (~i15)) ^ i16;
        n7Var.f11475m = i17;
        int i18 = i17 ^ n7Var.f11489p2;
        n7Var.f11489p2 = i18;
        int i19 = n7Var.A2;
        int i20 = n7Var.C1;
        int i21 = ((i16 ^ i19) & i20) ^ n7Var.R0;
        n7Var.A2 = i21;
        int i22 = n7Var.C0 ^ ((i12 ^ i14) & i15);
        n7Var.R0 = i22;
        int i23 = n7Var.f11476m0;
        int i24 = (i21 ^ ((i22 ^ (i20 & i22)) | i23)) ^ n7Var.f11518x;
        n7Var.f11518x = i24;
        int i25 = i14 | i12;
        int i26 = n7Var.f11503t0;
        int i27 = (((~(i26 ^ (i10 ^ i25))) & i20) ^ n7Var.N0) & (~i23);
        int i28 = ~i14;
        int i29 = n7Var.F;
        int i30 = n7Var.C;
        int i31 = (i30 & (~i10)) ^ n7Var.f11495r0;
        n7Var.C = i31;
        int i32 = (i31 ^ n7Var.J) ^ n7Var.G1;
        int i33 = n7Var.f11508u1;
        int i34 = n7Var.V1;
        int i35 = i34 ^ (i33 | i32);
        n7Var.J = i35;
        int i36 = i35 ^ n7Var.f11472l0;
        n7Var.f11472l0 = i36;
        int i37 = ((i32 & i33) ^ i34) ^ n7Var.f11434b0;
        n7Var.f11434b0 = i37;
        int i38 = i10 ^ i11;
        n7Var.K1 = i38;
        int i39 = (i14 | i38) ^ i38;
        n7Var.G1 = i39;
        int i40 = i18 ^ (i23 | (i13 ^ (((n7Var.f11439c2 ^ i38) & i15) & i20)));
        n7Var.f11439c2 = i40;
        int i41 = i40 ^ n7Var.f11448f;
        n7Var.f11448f = i41;
        int i42 = i14 ^ i38;
        n7Var.f11500s1 = i42;
        int i43 = n7Var.p ^ i42;
        n7Var.p = i43;
        int i44 = ((~(((~((i12 & i28) ^ i11)) & i15) ^ ((i38 & i28) ^ i12))) & i20) ^ i43;
        n7Var.N0 = i44;
        int i45 = i44 ^ n7Var.C2;
        n7Var.C2 = i45;
        int i46 = ~(i45 ^ n7Var.f11481n1);
        n7Var.f11481n1 = i46;
        int i47 = ((i38 ^ n7Var.f11480n0) & i15) ^ i42;
        n7Var.f11480n0 = i47;
        int i48 = i47 ^ ((i39 ^ ((~(i25 ^ i29)) & i15)) & i20);
        n7Var.C0 = i48;
        int i49 = i48 ^ i27;
        n7Var.f11503t0 = i49;
        int i50 = i49 ^ n7Var.f11473l1;
        n7Var.f11473l1 = i50;
        int i51 = n7Var.L0;
        bArr2[0] = (byte) (i51 & 255);
        bArr2[1] = (byte) ((i51 >>> 8) & 255);
        bArr2[2] = (byte) ((i51 >>> 16) & 255);
        bArr2[3] = (byte) (i51 >> 24);
        int i52 = n7Var.f11447e2;
        bArr2[4] = (byte) (i52 & 255);
        bArr2[5] = (byte) ((i52 >>> 8) & 255);
        bArr2[6] = (byte) ((i52 >>> 16) & 255);
        bArr2[7] = (byte) (i52 >> 24);
        bArr2[8] = (byte) (i46 & 255);
        bArr2[9] = (byte) ((i46 >>> 8) & 255);
        bArr2[10] = (byte) ((i46 >>> 16) & 255);
        bArr2[11] = (byte) (i46 >> 24);
        int i53 = n7Var.f11442d1;
        bArr2[12] = (byte) (i53 & 255);
        bArr2[13] = (byte) ((i53 >>> 8) & 255);
        bArr2[14] = (byte) ((i53 >>> 16) & 255);
        bArr2[15] = (byte) (i53 >> 24);
        bArr2[16] = (byte) (i41 & 255);
        bArr2[17] = (byte) ((i41 >>> 8) & 255);
        bArr2[18] = (byte) ((i41 >>> 16) & 255);
        bArr2[19] = (byte) (i41 >> 24);
        int i54 = n7Var.f11444e;
        bArr2[20] = (byte) (i54 & 255);
        bArr2[21] = (byte) ((i54 >>> 8) & 255);
        bArr2[22] = (byte) ((i54 >>> 16) & 255);
        bArr2[23] = (byte) (i54 >> 24);
        int i55 = n7Var.f11455h;
        bArr2[24] = (byte) (i55 & 255);
        bArr2[25] = (byte) ((i55 >>> 8) & 255);
        bArr2[26] = (byte) ((i55 >>> 16) & 255);
        bArr2[27] = (byte) (i55 >> 24);
        bArr2[28] = (byte) (i20 & 255);
        bArr2[29] = (byte) ((i20 >>> 8) & 255);
        bArr2[30] = (byte) ((i20 >>> 16) & 255);
        bArr2[31] = (byte) (i20 >> 24);
        int i56 = n7Var.f11463j;
        bArr2[32] = (byte) (i56 & 255);
        bArr2[33] = (byte) ((i56 >>> 8) & 255);
        bArr2[34] = (byte) ((i56 >>> 16) & 255);
        bArr2[35] = (byte) (i56 >> 24);
        int i57 = n7Var.f11517w2;
        bArr2[36] = (byte) (i57 & 255);
        bArr2[37] = (byte) ((i57 >>> 8) & 255);
        bArr2[38] = (byte) ((i57 >>> 16) & 255);
        bArr2[39] = (byte) (i57 >> 24);
        int i58 = n7Var.f11526z1;
        bArr2[40] = (byte) (i58 & 255);
        bArr2[41] = (byte) ((i58 >>> 8) & 255);
        bArr2[42] = (byte) ((i58 >>> 16) & 255);
        bArr2[43] = (byte) (i58 >> 24);
        int i59 = n7Var.f11467k;
        bArr2[44] = (byte) (i59 & 255);
        bArr2[45] = (byte) ((i59 >>> 8) & 255);
        bArr2[46] = (byte) ((i59 >>> 16) & 255);
        bArr2[47] = (byte) (i59 >> 24);
        int i60 = n7Var.G0;
        bArr2[48] = (byte) (i60 & 255);
        bArr2[49] = (byte) ((i60 >>> 8) & 255);
        bArr2[50] = (byte) ((i60 >>> 16) & 255);
        bArr2[51] = (byte) (i60 >> 24);
        int i61 = n7Var.D1;
        bArr2[52] = (byte) (i61 & 255);
        bArr2[53] = (byte) ((i61 >>> 8) & 255);
        bArr2[54] = (byte) ((i61 >>> 16) & 255);
        bArr2[55] = (byte) (i61 >> 24);
        int i62 = n7Var.X0;
        bArr2[56] = (byte) (i62 & 255);
        bArr2[57] = (byte) ((i62 >>> 8) & 255);
        bArr2[58] = (byte) ((i62 >>> 16) & 255);
        bArr2[59] = (byte) (i62 >> 24);
        int i63 = n7Var.f11483o;
        bArr2[60] = (byte) (i63 & 255);
        bArr2[61] = (byte) ((i63 >>> 8) & 255);
        bArr2[62] = (byte) ((i63 >>> 16) & 255);
        bArr2[63] = (byte) (i63 >> 24);
        bArr2[64] = (byte) (i50 & 255);
        bArr2[65] = (byte) ((i50 >>> 8) & 255);
        bArr2[66] = (byte) ((i50 >>> 16) & 255);
        bArr2[67] = (byte) (i50 >> 24);
        int i64 = n7Var.f11438c1;
        bArr2[68] = (byte) (i64 & 255);
        bArr2[69] = (byte) ((i64 >>> 8) & 255);
        bArr2[70] = (byte) ((i64 >>> 16) & 255);
        bArr2[71] = (byte) (i64 >> 24);
        int i65 = n7Var.f11487p0;
        bArr2[72] = (byte) (i65 & 255);
        bArr2[73] = (byte) ((i65 >>> 8) & 255);
        bArr2[74] = (byte) ((i65 >>> 16) & 255);
        bArr2[75] = (byte) (i65 >> 24);
        int i66 = n7Var.b1;
        bArr2[76] = (byte) (i66 & 255);
        bArr2[77] = (byte) ((i66 >>> 8) & 255);
        bArr2[78] = (byte) ((i66 >>> 16) & 255);
        bArr2[79] = (byte) (i66 >> 24);
        int i67 = n7Var.f11510v;
        bArr2[80] = (byte) (i67 & 255);
        bArr2[81] = (byte) ((i67 >>> 8) & 255);
        bArr2[82] = (byte) ((i67 >>> 16) & 255);
        bArr2[83] = (byte) (i67 >> 24);
        int i68 = n7Var.f11506u;
        bArr2[84] = (byte) (i68 & 255);
        bArr2[85] = (byte) ((i68 >>> 8) & 255);
        bArr2[86] = (byte) ((i68 >>> 16) & 255);
        bArr2[87] = (byte) (i68 >> 24);
        bArr2[88] = (byte) (i24 & 255);
        bArr2[89] = (byte) ((i24 >>> 8) & 255);
        bArr2[90] = (byte) ((i24 >>> 16) & 255);
        bArr2[91] = (byte) (i24 >> 24);
        int i69 = n7Var.f11514w;
        bArr2[92] = (byte) (i69 & 255);
        bArr2[93] = (byte) ((i69 >>> 8) & 255);
        bArr2[94] = (byte) ((i69 >>> 16) & 255);
        bArr2[95] = (byte) (i69 >> 24);
        int i70 = n7Var.E1;
        bArr2[96] = (byte) (i70 & 255);
        bArr2[97] = (byte) ((i70 >>> 8) & 255);
        bArr2[98] = (byte) ((i70 >>> 16) & 255);
        bArr2[99] = (byte) (i70 >> 24);
        int i71 = n7Var.N1;
        bArr2[100] = (byte) (i71 & 255);
        bArr2[101] = (byte) ((i71 >>> 8) & 255);
        bArr2[102] = (byte) ((i71 >>> 16) & 255);
        bArr2[103] = (byte) (i71 >> 24);
        int i72 = n7Var.F0;
        bArr2[104] = (byte) (i72 & 255);
        bArr2[105] = (byte) ((i72 >>> 8) & 255);
        bArr2[106] = (byte) ((i72 >>> 16) & 255);
        bArr2[107] = (byte) (i72 >> 24);
        int i73 = n7Var.A;
        bArr2[108] = (byte) (i73 & 255);
        bArr2[109] = (byte) ((i73 >>> 8) & 255);
        bArr2[110] = (byte) ((i73 >>> 16) & 255);
        bArr2[111] = (byte) (i73 >> 24);
        int i74 = n7Var.D;
        bArr2[112] = (byte) (i74 & 255);
        bArr2[113] = (byte) ((i74 >>> 8) & 255);
        bArr2[114] = (byte) ((i74 >>> 16) & 255);
        bArr2[115] = (byte) (i74 >> 24);
        int i75 = n7Var.U;
        bArr2[116] = (byte) (i75 & 255);
        bArr2[117] = (byte) ((i75 >>> 8) & 255);
        bArr2[118] = (byte) ((i75 >>> 16) & 255);
        bArr2[119] = (byte) (i75 >> 24);
        int i76 = n7Var.H1;
        bArr2[120] = (byte) (i76 & 255);
        bArr2[121] = (byte) ((i76 >>> 8) & 255);
        bArr2[122] = (byte) ((i76 >>> 16) & 255);
        bArr2[123] = (byte) (i76 >> 24);
        int i77 = n7Var.f11457h1;
        bArr2[124] = (byte) (i77 & 255);
        bArr2[125] = (byte) ((i77 >>> 8) & 255);
        bArr2[126] = (byte) ((i77 >>> 16) & 255);
        bArr2[127] = (byte) (i77 >> 24);
        int i78 = n7Var.f11461i1;
        bArr2[128] = (byte) (i78 & 255);
        bArr2[129] = (byte) ((i78 >>> 8) & 255);
        bArr2[130] = (byte) ((i78 >>> 16) & 255);
        bArr2[131] = (byte) (i78 >> 24);
        int i79 = n7Var.G;
        bArr2[132] = (byte) (i79 & 255);
        bArr2[133] = (byte) ((i79 >>> 8) & 255);
        bArr2[134] = (byte) ((i79 >>> 16) & 255);
        bArr2[135] = (byte) (i79 >> 24);
        int i80 = n7Var.T0;
        bArr2[136] = (byte) (i80 & 255);
        bArr2[137] = (byte) ((i80 >>> 8) & 255);
        bArr2[138] = (byte) ((i80 >>> 16) & 255);
        bArr2[139] = (byte) (i80 >> 24);
        int i81 = n7Var.f11478m2;
        bArr2[140] = (byte) (i81 & 255);
        bArr2[141] = (byte) ((i81 >>> 8) & 255);
        bArr2[142] = (byte) ((i81 >>> 16) & 255);
        bArr2[143] = (byte) (i81 >> 24);
        int i82 = n7Var.L;
        bArr2[144] = (byte) (i82 & 255);
        bArr2[145] = (byte) ((i82 >>> 8) & 255);
        bArr2[146] = (byte) ((i82 >>> 16) & 255);
        bArr2[147] = (byte) (i82 >> 24);
        int i83 = n7Var.f11474l2;
        bArr2[148] = (byte) (i83 & 255);
        bArr2[149] = (byte) ((i83 >>> 8) & 255);
        bArr2[150] = (byte) ((i83 >>> 16) & 255);
        bArr2[151] = (byte) (i83 >> 24);
        int i84 = n7Var.R1;
        bArr2[152] = (byte) (i84 & 255);
        bArr2[153] = (byte) ((i84 >>> 8) & 255);
        bArr2[154] = (byte) ((i84 >>> 16) & 255);
        bArr2[155] = (byte) (i84 >> 24);
        int i85 = n7Var.X;
        bArr2[156] = (byte) (i85 & 255);
        bArr2[157] = (byte) ((i85 >>> 8) & 255);
        bArr2[158] = (byte) ((i85 >>> 16) & 255);
        bArr2[159] = (byte) (i85 >> 24);
        int i86 = n7Var.P;
        bArr2[160] = (byte) (i86 & 255);
        bArr2[161] = (byte) ((i86 >>> 8) & 255);
        bArr2[162] = (byte) ((i86 >>> 16) & 255);
        bArr2[163] = (byte) (i86 >> 24);
        int i87 = n7Var.f11459i;
        bArr2[164] = (byte) (i87 & 255);
        bArr2[165] = (byte) ((i87 >>> 8) & 255);
        bArr2[166] = (byte) ((i87 >>> 16) & 255);
        bArr2[167] = (byte) (i87 >> 24);
        int i88 = n7Var.f11445e0;
        bArr2[168] = (byte) (i88 & 255);
        bArr2[169] = (byte) ((i88 >>> 8) & 255);
        bArr2[170] = (byte) ((i88 >>> 16) & 255);
        bArr2[171] = (byte) (i88 >> 24);
        int i89 = n7Var.f11430a0;
        bArr2[172] = (byte) (i89 & 255);
        bArr2[173] = (byte) ((i89 >>> 8) & 255);
        bArr2[174] = (byte) ((i89 >>> 16) & 255);
        bArr2[175] = (byte) (i89 >> 24);
        int i90 = n7Var.T;
        bArr2[176] = (byte) (i90 & 255);
        bArr2[177] = (byte) ((i90 >>> 8) & 255);
        bArr2[178] = (byte) ((i90 >>> 16) & 255);
        bArr2[179] = (byte) (i90 >> 24);
        bArr2[180] = (byte) (i11 & 255);
        bArr2[181] = (byte) ((i11 >>> 8) & 255);
        bArr2[182] = (byte) ((i11 >>> 16) & 255);
        bArr2[183] = (byte) (i11 >> 24);
        int i91 = n7Var.V;
        bArr2[184] = (byte) (i91 & 255);
        bArr2[185] = (byte) ((i91 >>> 8) & 255);
        bArr2[186] = (byte) ((i91 >>> 16) & 255);
        bArr2[187] = (byte) (i91 >> 24);
        int i92 = n7Var.f11499s0;
        bArr2[188] = (byte) (i92 & 255);
        bArr2[189] = (byte) ((i92 >>> 8) & 255);
        bArr2[190] = (byte) ((i92 >>> 16) & 255);
        bArr2[191] = (byte) (i92 >> 24);
        int i93 = n7Var.f11471l;
        bArr2[192] = (byte) (i93 & 255);
        bArr2[193] = (byte) ((i93 >>> 8) & 255);
        bArr2[194] = (byte) ((i93 >>> 16) & 255);
        bArr2[195] = (byte) (i93 >> 24);
        int i94 = n7Var.J0;
        bArr2[196] = (byte) (i94 & 255);
        bArr2[197] = (byte) ((i94 >>> 8) & 255);
        bArr2[198] = (byte) ((i94 >>> 16) & 255);
        bArr2[199] = (byte) (i94 >> 24);
        int i95 = n7Var.Z;
        bArr2[200] = (byte) (i95 & 255);
        bArr2[201] = (byte) ((i95 >>> 8) & 255);
        bArr2[202] = (byte) ((i95 >>> 16) & 255);
        bArr2[203] = (byte) (i95 >> 24);
        int i96 = n7Var.D0;
        bArr2[204] = (byte) (i96 & 255);
        bArr2[205] = (byte) ((i96 >>> 8) & 255);
        bArr2[206] = (byte) ((i96 >>> 16) & 255);
        bArr2[207] = (byte) (i96 >> 24);
        bArr2[208] = (byte) (i37 & 255);
        bArr2[209] = (byte) ((i37 >>> 8) & 255);
        bArr2[210] = (byte) ((i37 >>> 16) & 255);
        bArr2[211] = (byte) (i37 >> 24);
        bArr2[212] = (byte) (i15 & 255);
        bArr2[213] = (byte) ((i15 >>> 8) & 255);
        bArr2[214] = (byte) ((i15 >>> 16) & 255);
        bArr2[215] = (byte) (i15 >> 24);
        int i97 = n7Var.f11441d0;
        bArr2[216] = (byte) (i97 & 255);
        bArr2[217] = (byte) ((i97 >>> 8) & 255);
        bArr2[218] = (byte) ((i97 >>> 16) & 255);
        bArr2[219] = (byte) (i97 >> 24);
        int i98 = n7Var.S;
        bArr2[220] = (byte) (i98 & 255);
        bArr2[221] = (byte) ((i98 >>> 8) & 255);
        bArr2[222] = (byte) ((i98 >>> 16) & 255);
        bArr2[223] = (byte) (i98 >> 24);
        int i99 = n7Var.f11450f2;
        bArr2[224] = (byte) (i99 & 255);
        bArr2[225] = (byte) ((i99 >>> 8) & 255);
        bArr2[226] = (byte) ((i99 >>> 16) & 255);
        bArr2[227] = (byte) (i99 >> 24);
        int i100 = n7Var.F1;
        bArr2[228] = (byte) (i100 & 255);
        bArr2[229] = (byte) ((i100 >>> 8) & 255);
        bArr2[230] = (byte) ((i100 >>> 16) & 255);
        bArr2[231] = (byte) (i100 >> 24);
        int i101 = n7Var.f11496r1;
        bArr2[232] = (byte) (i101 & 255);
        bArr2[233] = (byte) ((i101 >>> 8) & 255);
        bArr2[234] = (byte) ((i101 >>> 16) & 255);
        bArr2[235] = (byte) (i101 >> 24);
        int i102 = n7Var.f11501s2;
        bArr2[236] = (byte) (i102 & 255);
        bArr2[237] = (byte) ((i102 >>> 8) & 255);
        bArr2[238] = (byte) ((i102 >>> 16) & 255);
        bArr2[239] = (byte) (i102 >> 24);
        int i103 = n7Var.f11435b2;
        bArr2[240] = (byte) (i103 & 255);
        bArr2[241] = (byte) ((i103 >>> 8) & 255);
        bArr2[242] = (byte) ((i103 >>> 16) & 255);
        bArr2[243] = (byte) (i103 >> 24);
        int i104 = n7Var.E0;
        bArr2[244] = (byte) (i104 & 255);
        bArr2[245] = (byte) ((i104 >>> 8) & 255);
        bArr2[246] = (byte) ((i104 >>> 16) & 255);
        bArr2[247] = (byte) (i104 >> 24);
        bArr2[248] = (byte) (i36 & 255);
        bArr2[249] = (byte) ((i36 >>> 8) & 255);
        bArr2[250] = (byte) ((i36 >>> 16) & 255);
        bArr2[251] = (byte) (i36 >> 24);
        int i105 = n7Var.K0;
        bArr2[252] = (byte) (i105 & 255);
        bArr2[253] = (byte) ((i105 >>> 8) & 255);
        bArr2[254] = (byte) ((i105 >>> 16) & 255);
        bArr2[255] = (byte) (i105 >> 24);
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        im imVar = (im) this.f7729t;
        wk r10 = ((dl) clVar.f9883t).w().r();
        if (r10.f9884u) {
            r10.m();
            r10.f9884u = false;
        }
        xk.y((xk) r10.f9883t, imVar);
        clVar.q(r10);
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f7728s) {
            case 2:
                ((zq0) obj).m0((kk) this.f7729t);
                return;
            case 3:
                ((ay) obj).n0((k60) this.f7729t);
                return;
            default:
                ((rx) obj).B0(((ze2) this.f7729t).f16173i.f6205c);
                return;
        }
    }

    @Override // m4.y90
    /* renamed from: zza */
    public final lq mo20zza() {
        try {
            return ((u20) ((h71) this.f7729t).f9129b).b();
        } catch (RemoteException e10) {
            throw new pm1(e10);
        }
    }

    @Override // m4.y90
    /* renamed from: zza */
    public final void mo20zza() {
        ((a00) this.f7729t).f5992v.k();
    }

    public /* synthetic */ e7(n7 n7Var) {
        this.f7728s = 0;
        this.f7729t = n7Var;
    }
}
