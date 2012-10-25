package uk.ac.manchester.cs.owl.owlapi.turtle.parser;

import uk.ac.manchester.cs.JavaCharStream;

/** Token Manager. */
@SuppressWarnings("javadoc")
public class TurtleParserTokenManager implements TurtleParserConstants
{

    /** Debug output. */
    public  java.io.PrintStream debugStream = System.out;
    /** Set debug output. */
    public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
    private final int jjStopStringLiteralDfa_0(int pos, long active0)
    {
        switch (pos)
        {
            case 0:
                if ((active0 & 0x80000000L) != 0L)
                {
                    jjmatchedKind = 40;
                    return 18;
                }
                if ((active0 & 0x100000L) != 0L) {
                    return 8;
                }
                if ((active0 & 0x20000000L) != 0L) {
                    return 59;
                }
                if ((active0 & 0x800000L) != 0L) {
                    return 3;
                }
                if ((active0 & 0x1f00000000L) != 0L)
                {
                    jjmatchedKind = 37;
                    return 59;
                }
                return -1;
            case 1:
                if ((active0 & 0x1f00000000L) != 0L)
                {
                    jjmatchedKind = 40;
                    jjmatchedPos = 1;
                    return 59;
                }
                if ((active0 & 0x80000000L) != 0L) {
                    return 19;
                }
                return -1;
            case 2:
                if ((active0 & 0x1f00000000L) != 0L)
                {
                    jjmatchedKind = 40;
                    jjmatchedPos = 2;
                    return 59;
                }
                return -1;
            case 3:
                if ((active0 & 0x100000000L) != 0L) {
                    return 59;
                }
                if ((active0 & 0x1e00000000L) != 0L)
                {
                    jjmatchedKind = 40;
                    jjmatchedPos = 3;
                    return 59;
                }
                return -1;
            case 4:
                if ((active0 & 0xa00000000L) != 0L) {
                    return 59;
                }
                if ((active0 & 0x1400000000L) != 0L)
                {
                    jjmatchedKind = 40;
                    jjmatchedPos = 4;
                    return 59;
                }
                return -1;
            case 5:
                if ((active0 & 0x1400000000L) != 0L) {
                    return 59;
                }
                return -1;
            default :
                return -1;
        }
    }
    private final int jjStartNfa_0(int pos, long active0)
    {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }
    private int jjStopAtPos(int pos, int kind)
    {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }
    private int jjMoveStringLiteralDfa0_0()
    {
        switch(curChar)
        {
            case 34:
                jjmatchedKind = 6;
                return jjMoveStringLiteralDfa1_0(0x400L);
            case 40:
                return jjStopAtPos(0, 18);
            case 41:
                return jjStopAtPos(0, 19);
            case 44:
                return jjStopAtPos(0, 22);
            case 46:
                return jjStartNfaWithStates_0(0, 23, 3);
            case 59:
                return jjStopAtPos(0, 24);
            case 64:
                jjmatchedKind = 28;
                return jjMoveStringLiteralDfa1_0(0xa000000L);
            case 70:
                return jjMoveStringLiteralDfa1_0(0x1000000000L);
            case 83:
                return jjMoveStringLiteralDfa1_0(0x400000000L);
            case 87:
                return jjMoveStringLiteralDfa1_0(0x800000000L);
            case 91:
                return jjStartNfaWithStates_0(0, 20, 8);
            case 93:
                return jjStopAtPos(0, 21);
            case 94:
                return jjMoveStringLiteralDfa1_0(0x4000000L);
            case 95:
                return jjMoveStringLiteralDfa1_0(0x80000000L);
            case 97:
                return jjStartNfaWithStates_0(0, 29, 59);
            case 102:
                return jjMoveStringLiteralDfa1_0(0x200000000L);
            case 116:
                return jjMoveStringLiteralDfa1_0(0x100000000L);
            default :
                return jjMoveNfa_0(0, 0);
        }
    }
    private int jjMoveStringLiteralDfa1_0(long active0)
    {
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch(curChar)
        {
            case 34:
                return jjMoveStringLiteralDfa2_0(active0, 0x400L);
            case 58:
                if ((active0 & 0x80000000L) != 0L) {
                    return jjStartNfaWithStates_0(1, 31, 19);
                }
                break;
            case 69:
                return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
            case 72:
                return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
            case 73:
                return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
            case 94:
                if ((active0 & 0x4000000L) != 0L) {
                    return jjStopAtPos(1, 26);
                }
                break;
            case 97:
                return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
            case 98:
                return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
            case 112:
                return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
            case 114:
                return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
            default :
                break;
        }
        return jjStartNfa_0(0, active0);
    }
    private int jjMoveStringLiteralDfa2_0(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return jjStartNfa_0(0, old0);
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch(curChar)
        {
            case 34:
                if ((active0 & 0x400L) != 0L) {
                    return jjStopAtPos(2, 10);
                }
                break;
            case 69:
                return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
            case 76:
                return jjMoveStringLiteralDfa3_0(active0, 0x1400000000L);
            case 97:
                return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
            case 108:
                return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
            case 114:
                return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
            case 117:
                return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
            default :
                break;
        }
        return jjStartNfa_0(1, active0);
    }
    private int jjMoveStringLiteralDfa3_0(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return jjStartNfa_0(1, old0);
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch(curChar)
        {
            case 69:
                return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
            case 82:
                return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
            case 84:
                return jjMoveStringLiteralDfa4_0(active0, 0x1000000000L);
            case 101:
                if ((active0 & 0x100000000L) != 0L) {
                    return jjStartNfaWithStates_0(3, 32, 59);
                }
                return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
            case 115:
                return jjMoveStringLiteralDfa4_0(active0, 0x208000000L);
            default :
                break;
        }
        return jjStartNfa_0(2, active0);
    }
    private int jjMoveStringLiteralDfa4_0(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return jjStartNfa_0(2, old0);
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch(curChar)
        {
            case 67:
                return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
            case 69:
                if ((active0 & 0x800000000L) != 0L) {
                    return jjStartNfaWithStates_0(4, 35, 59);
                }
                return jjMoveStringLiteralDfa5_0(active0, 0x1000000000L);
            case 101:
                if ((active0 & 0x8000000L) != 0L) {
                    return jjStopAtPos(4, 27);
                } else if ((active0 & 0x200000000L) != 0L) {
                    return jjStartNfaWithStates_0(4, 33, 59);
                }
                break;
            case 102:
                return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
            default :
                break;
        }
        return jjStartNfa_0(3, active0);
    }
    private int jjMoveStringLiteralDfa5_0(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return jjStartNfa_0(3, old0);
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch(curChar)
        {
            case 82:
                if ((active0 & 0x1000000000L) != 0L) {
                    return jjStartNfaWithStates_0(5, 36, 59);
                }
                break;
            case 84:
                if ((active0 & 0x400000000L) != 0L) {
                    return jjStartNfaWithStates_0(5, 34, 59);
                }
                break;
            case 105:
                return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
            default :
                break;
        }
        return jjStartNfa_0(4, active0);
    }
    private int jjMoveStringLiteralDfa6_0(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return jjStartNfa_0(4, old0);
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            jjStopStringLiteralDfa_0(5, active0);
            return 6;
        }
        switch(curChar)
        {
            case 120:
                if ((active0 & 0x2000000L) != 0L) {
                    return jjStopAtPos(6, 25);
                }
                break;
            default :
                break;
        }
        return jjStartNfa_0(5, active0);
    }
    private int jjStartNfaWithStates_0(int pos, int kind, int state)
    {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) { return pos + 1; }
        return jjMoveNfa_0(state, pos + 1);
    }
    static final long[] jjbitVec0 = {
        0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final long[] jjbitVec2 = {
        0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final long[] jjbitVec3 = {
        0xfffe7000fffffff6L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x5e00000000ffffffL
    };
    static final long[] jjbitVec4 = {
        0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
    };
    static final long[] jjbitVec5 = {
        0x0L, 0xbfff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final long[] jjbitVec6 = {
        0x3000L, 0xffff000000000000L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final long[] jjbitVec7 = {
        0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
    };
    static final long[] jjbitVec8 = {
        0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffL
    };
    static final long[] jjbitVec9 = {
        0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffff00000000ffffL
    };
    static final long[] jjbitVec10 = {
        0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0x3fffffffffffffffL
    };
    static final long[] jjbitVec11 = {
        0x0L, 0x0L, 0x80000000000000L, 0xff7fffffff7fffffL
    };
    static final long[] jjbitVec12 = {
        0xffffffffffffffffL, 0xbfffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final long[] jjbitVec13 = {
        0x8000000000003000L, 0xffff000000000001L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    private int jjMoveNfa_0(int startState, int curPos)
    {
        int startsAt = 0;
        jjnewStateCnt = 59;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64)
            {
                long l = 1L << curChar;
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 0:
                            if ((0x3ff200000000000L & l) != 0L)
                            {
                                if (kind > 44) {
                                    kind = 44;
                                }
                            }
                            else if (curChar == 58)
                            {
                                if (kind > 39) {
                                    kind = 39;
                                }
                                jjCheckNAdd(53);
                            }
                            else if (curChar == 60) {
                                jjCheckNAddTwoStates(11, 12);
                            } else if (curChar == 46) {
                                jjCheckNAdd(3);
                            } else if (curChar == 35)
                            {
                                if (kind > 5) {
                                    kind = 5;
                                }
                                jjCheckNAdd(1);
                            }
                            if ((0x3ff000000000000L & l) != 0L)
                            {
                                if (kind > 13) {
                                    kind = 13;
                                }
                                jjCheckNAddStates(0, 5);
                            }
                            else if ((0x280000000000L & l) != 0L) {
                                jjCheckNAddStates(6, 9);
                            }
                            if ((0x3ff000000000000L & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                                jjCheckNAddTwoStates(14, 15);
                            }
                            break;
                        case 59:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(56, 57);
                            } else if (curChar == 58) {
                                jjCheckNAdd(53);
                            }
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(50, 51);
                            } else if (curChar == 58)
                            {
                                if (kind > 39) {
                                    kind = 39;
                                }
                            }
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            if ((0x3ff200000000000L & l) != 0L)
                            {
                                if (kind > 42) {
                                    kind = 42;
                                }
                            }
                            if ((0x3ff200000000000L & l) != 0L) {
                                jjstateSet[jjnewStateCnt++] = 52;
                            }
                            if ((0x3ff200000000000L & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            if ((0x3ff200000000000L & l) != 0L) {
                                jjstateSet[jjnewStateCnt++] = 49;
                            }
                            break;
                        case 18:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            } else if (curChar == 58) {
                                jjstateSet[jjnewStateCnt++] = 19;
                            }
                            if ((0x3ff200000000000L & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            break;
                        case 1:
                            if ((0xfffffffffffffbffL & l) == 0L) {
                                break;
                            }
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjCheckNAdd(1);
                            break;
                        case 2:
                            if (curChar == 46) {
                                jjCheckNAdd(3);
                            }
                            break;
                        case 3:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(3);
                            break;
                        case 5:
                            if ((0x280000000000L & l) != 0L) {
                                jjCheckNAdd(6);
                            }
                            break;
                        case 6:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 17) {
                                kind = 17;
                            }
                            jjCheckNAdd(6);
                            break;
                        case 10:
                            if (curChar == 60) {
                                jjCheckNAddTwoStates(11, 12);
                            }
                            break;
                        case 11:
                            if ((0xbffffffeffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(11, 12);
                            }
                            break;
                        case 12:
                            if (curChar == 62 && kind > 38) {
                                kind = 38;
                            }
                            break;
                        case 13:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 40) {
                                kind = 40;
                            }
                            jjCheckNAddTwoStates(14, 15);
                            break;
                        case 14:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            break;
                        case 15:
                            if ((0x3ff200000000000L & l) != 0L && kind > 40) {
                                kind = 40;
                            }
                            break;
                        case 16:
                            if ((0x3ff200000000000L & l) != 0L && kind > 44) {
                                kind = 44;
                            }
                            break;
                        case 19:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 46) {
                                kind = 46;
                            }
                            jjCheckNAddTwoStates(20, 21);
                            break;
                        case 20:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(20, 21);
                            }
                            break;
                        case 21:
                            if ((0x3ff200000000000L & l) != 0L && kind > 46) {
                                kind = 46;
                            }
                            break;
                        case 23:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 13) {
                                kind = 13;
                            }
                            jjCheckNAddStates(0, 5);
                            break;
                        case 24:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 14) {
                                kind = 14;
                            }
                            jjCheckNAdd(24);
                            break;
                        case 25:
                            if ((0x3ff000000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(25, 26);
                            }
                            break;
                        case 26:
                            if (curChar == 46) {
                                jjCheckNAddStates(10, 12);
                            }
                            break;
                        case 28:
                            if ((0x280000000000L & l) != 0L) {
                                jjCheckNAdd(29);
                            }
                            break;
                        case 29:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 15) {
                                kind = 15;
                            }
                            jjCheckNAdd(29);
                            break;
                        case 30:
                            if (curChar == 46) {
                                jjCheckNAdd(31);
                            }
                            break;
                        case 31:
                            if ((0x3ff000000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(31, 32);
                            }
                            break;
                        case 33:
                            if ((0x280000000000L & l) != 0L) {
                                jjCheckNAdd(34);
                            }
                            break;
                        case 34:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 15) {
                                kind = 15;
                            }
                            jjCheckNAdd(34);
                            break;
                        case 35:
                            if ((0x3ff000000000000L & l) != 0L) {
                                jjCheckNAddStates(13, 17);
                            }
                            break;
                        case 36:
                            if ((0x3ff000000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(36, 37);
                            }
                            break;
                        case 38:
                            if ((0x280000000000L & l) != 0L) {
                                jjCheckNAdd(39);
                            }
                            break;
                        case 39:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 15) {
                                kind = 15;
                            }
                            jjCheckNAdd(39);
                            break;
                        case 40:
                            if ((0x3ff000000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(40, 41);
                            }
                            break;
                        case 41:
                            if (curChar != 46) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(42);
                            break;
                        case 42:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(42);
                            break;
                        case 43:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAdd(43);
                            break;
                        case 44:
                            if ((0x280000000000L & l) != 0L) {
                                jjCheckNAddStates(6, 9);
                            }
                            break;
                        case 45:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 16) {
                                kind = 16;
                            }
                            jjCheckNAddStates(18, 20);
                            break;
                        case 47:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            break;
                        case 48:
                            if ((0x3ff200000000000L & l) != 0L) {
                                jjstateSet[jjnewStateCnt++] = 49;
                            }
                            break;
                        case 49:
                            if (curChar == 58 && kind > 39) {
                                kind = 39;
                            }
                            break;
                        case 50:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            break;
                        case 51:
                            if ((0x3ff200000000000L & l) != 0L) {
                                jjstateSet[jjnewStateCnt++] = 52;
                            }
                            break;
                        case 52:
                            if (curChar == 58) {
                                jjCheckNAdd(53);
                            }
                            break;
                        case 53:
                            if ((0x3ff000000000000L & l) == 0L) {
                                break;
                            }
                            if (kind > 41) {
                                kind = 41;
                            }
                            jjCheckNAddTwoStates(54, 55);
                            break;
                        case 54:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(54, 55);
                            }
                            break;
                        case 55:
                            if ((0x3ff200000000000L & l) != 0L && kind > 41) {
                                kind = 41;
                            }
                            break;
                        case 56:
                            if ((0x3ff600000000000L & l) != 0L) {
                                jjCheckNAddTwoStates(56, 57);
                            }
                            break;
                        case 57:
                            if ((0x3ff200000000000L & l) != 0L && kind > 42) {
                                kind = 42;
                            }
                            break;
                        case 58:
                            if (curChar != 58) {
                                break;
                            }
                            if (kind > 39) {
                                kind = 39;
                            }
                            jjCheckNAdd(53);
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else if (curChar < 128)
            {
                long l = 1L << (curChar & 077);
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 0:
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 45) {
                                    kind = 45;
                                }
                            }
                            else if (curChar == 91) {
                                jjstateSet[jjnewStateCnt++] = 8;
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 44) {
                                    kind = 44;
                                }
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if ((0x7fffffe07fffffeL & l) != 0L)
                            {
                                if (kind > 42) {
                                    kind = 42;
                                }
                                jjCheckNAddStates(21, 28);
                            }
                            else if (curChar == 95) {
                                jjstateSet[jjnewStateCnt++] = 18;
                            }
                            if ((0x7fffffe07fffffeL & l) != 0L)
                            {
                                if (kind > 37) {
                                    kind = 37;
                                }
                            }
                            if ((0x2000000020L & l) != 0L) {
                                jjAddStates(29, 30);
                            }
                            break;
                        case 59:
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 42) {
                                    kind = 42;
                                }
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(56, 57);
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAdd(52);
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAdd(49);
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            break;
                        case 18:
                            if ((0x7fffffe87fffffeL & l) != 0L)
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            break;
                        case 1:
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjstateSet[jjnewStateCnt++] = 1;
                            break;
                        case 4:
                            if ((0x2000000020L & l) != 0L) {
                                jjAddStates(29, 30);
                            }
                            break;
                        case 7:
                            if (curChar == 91) {
                                jjstateSet[jjnewStateCnt++] = 8;
                            }
                            break;
                        case 8:
                            if (curChar == 93 && kind > 30) {
                                kind = 30;
                            }
                            break;
                        case 9:
                            if ((0x7fffffe07fffffeL & l) != 0L && kind > 37) {
                                kind = 37;
                            }
                            break;
                        case 11:
                            jjAddStates(31, 32);
                            break;
                        case 13:
                            if ((0x7fffffe87fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 40) {
                                kind = 40;
                            }
                            jjCheckNAddTwoStates(14, 15);
                            break;
                        case 14:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            break;
                        case 15:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 40) {
                                kind = 40;
                            }
                            break;
                        case 16:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 44) {
                                kind = 44;
                            }
                            break;
                        case 17:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 45) {
                                kind = 45;
                            }
                            break;
                        case 19:
                            if ((0x7fffffe87fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 46) {
                                kind = 46;
                            }
                            jjCheckNAddTwoStates(20, 21);
                            break;
                        case 20:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(20, 21);
                            }
                            break;
                        case 21:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 46) {
                                kind = 46;
                            }
                            break;
                        case 22:
                            if (curChar == 95) {
                                jjstateSet[jjnewStateCnt++] = 18;
                            }
                            break;
                        case 27:
                            if ((0x2000000020L & l) != 0L) {
                                jjAddStates(33, 34);
                            }
                            break;
                        case 32:
                            if ((0x2000000020L & l) != 0L) {
                                jjAddStates(35, 36);
                            }
                            break;
                        case 37:
                            if ((0x2000000020L & l) != 0L) {
                                jjAddStates(37, 38);
                            }
                            break;
                        case 46:
                            if ((0x7fffffe07fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 42) {
                                kind = 42;
                            }
                            jjCheckNAddStates(21, 28);
                            break;
                        case 47:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            break;
                        case 48:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAdd(49);
                            }
                            break;
                        case 50:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            break;
                        case 51:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAdd(52);
                            }
                            break;
                        case 53:
                            if ((0x7fffffe87fffffeL & l) == 0L) {
                                break;
                            }
                            if (kind > 41) {
                                kind = 41;
                            }
                            jjCheckNAddTwoStates(54, 55);
                            break;
                        case 54:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(54, 55);
                            }
                            break;
                        case 55:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 41) {
                                kind = 41;
                            }
                            break;
                        case 56:
                            if ((0x7fffffe87fffffeL & l) != 0L) {
                                jjCheckNAddTwoStates(56, 57);
                            }
                            break;
                        case 57:
                            if ((0x7fffffe87fffffeL & l) != 0L && kind > 42) {
                                kind = 42;
                            }
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else
            {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 0:
                            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 44) {
                                    kind = 44;
                                }
                            }
                            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 45) {
                                    kind = 45;
                                }
                            }
                            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 42) {
                                    kind = 42;
                                }
                                jjCheckNAddStates(21, 28);
                            }
                            break;
                        case 59:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAdd(49);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAdd(52);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(56, 57);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 42) {
                                    kind = 42;
                                }
                            }
                            break;
                        case 18:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                            {
                                if (kind > 40) {
                                    kind = 40;
                                }
                            }
                            break;
                        case 1:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjstateSet[jjnewStateCnt++] = 1;
                            break;
                        case 11:
                            if (jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                jjAddStates(31, 32);
                            }
                            break;
                        case 13:
                            if (!jjCanMove_1(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 40) {
                                kind = 40;
                            }
                            jjCheckNAddTwoStates(14, 15);
                            break;
                        case 14:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(14, 15);
                            }
                            break;
                        case 15:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 40) {
                                kind = 40;
                            }
                            break;
                        case 16:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 44) {
                                kind = 44;
                            }
                            break;
                        case 17:
                            if (jjCanMove_1(hiByte, i1, i2, l1, l2) && kind > 45) {
                                kind = 45;
                            }
                            break;
                        case 19:
                            if (!jjCanMove_1(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 46) {
                                kind = 46;
                            }
                            jjCheckNAddTwoStates(20, 21);
                            break;
                        case 20:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(20, 21);
                            }
                            break;
                        case 21:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 46) {
                                kind = 46;
                            }
                            break;
                        case 46:
                            if (!jjCanMove_1(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 42) {
                                kind = 42;
                            }
                            jjCheckNAddStates(21, 28);
                            break;
                        case 47:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(47, 48);
                            }
                            break;
                        case 48:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAdd(49);
                            }
                            break;
                        case 50:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            break;
                        case 51:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAdd(52);
                            }
                            break;
                        case 53:
                            if (!jjCanMove_1(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 41) {
                                kind = 41;
                            }
                            jjCheckNAddTwoStates(54, 55);
                            break;
                        case 54:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(54, 55);
                            }
                            break;
                        case 55:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 41) {
                                kind = 41;
                            }
                            break;
                        case 56:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2)) {
                                jjCheckNAddTwoStates(56, 57);
                            }
                            break;
                        case 57:
                            if (jjCanMove_2(hiByte, i1, i2, l1, l2) && kind > 42) {
                                kind = 42;
                            }
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 59 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) { return curPos; }
        }
    }
    private int jjMoveStringLiteralDfa0_2()
    {
        switch(curChar)
        {
            case 34:
                return jjMoveStringLiteralDfa1_2(0x1000L);
            default :
                return 1;
        }
    }
    private int jjMoveStringLiteralDfa1_2(long active0)
    {
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            return 1;
        }
        switch(curChar)
        {
            case 34:
                return jjMoveStringLiteralDfa2_2(active0, 0x1000L);
            default :
                return 2;
        }
    }
    private int jjMoveStringLiteralDfa2_2(long old0, long active0)
    {
        if ((active0 &= old0) == 0L) {
            return 2;
        }
        try { curChar = input_stream.readChar(); }
        catch(java.io.IOException e) {
            return 2;
        }
        switch(curChar)
        {
            case 34:
                if ((active0 & 0x1000L) != 0L) {
                    return jjStopAtPos(2, 12);
                }
                break;
            default :
                return 3;
        }
        return 3;
    }
    private int jjMoveStringLiteralDfa0_1()
    {
        switch(curChar)
        {
            case 34:
                return jjStopAtPos(0, 9);
            default :
                return jjMoveNfa_1(0, 0);
        }
    }
    private int jjMoveNfa_1(int startState, int curPos)
    {
        int startsAt = 0;
        jjnewStateCnt = 3;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;)
        {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64)
            {
                long l = 1L << curChar;
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 0:
                            if ((0xfffffffbffffffffL & l) != 0L && kind > 8) {
                                kind = 8;
                            }
                            break;
                        case 1:
                            if (kind > 7) {
                                kind = 7;
                            }
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else if (curChar < 128)
            {
                do
                {
                    switch(jjstateSet[--i])
                    {
                        case 0:
                            if (kind > 8) {
                                kind = 8;
                            }
                            if (curChar == 92) {
                                jjstateSet[jjnewStateCnt++] = 1;
                            }
                            break;
                        case 1:
                            if (kind > 7) {
                                kind = 7;
                            }
                            break;
                        case 2:
                            if (kind > 8) {
                                kind = 8;
                            }
                            break;
                        default : break;
                    }
                } while(i != startsAt);
            }
            else
            {
                int hiByte = curChar >> 8;
            int i1 = hiByte >> 6;
            long l1 = 1L << (hiByte & 077);
            int i2 = (curChar & 0xff) >> 6;
            long l2 = 1L << (curChar & 077);
            do
            {
                switch(jjstateSet[--i])
                {
                    case 0:
                        if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 8) {
                            kind = 8;
                        }
                        break;
                    case 1:
                        if (jjCanMove_0(hiByte, i1, i2, l1, l2) && kind > 7) {
                            kind = 7;
                        }
                        break;
                    default : break;
                }
            } while(i != startsAt);
            }
            if (kind != 0x7fffffff)
            {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try { curChar = input_stream.readChar(); }
            catch(java.io.IOException e) { return curPos; }
        }
    }
    static final int[] jjnextStates = {
        24, 25, 26, 40, 41, 43, 24, 25, 2, 45, 27, 30, 35, 27, 30, 36,
        37, 35, 40, 41, 43, 47, 48, 49, 50, 51, 52, 56, 57, 5, 6, 11,
        12, 28, 29, 33, 34, 38, 39,
    };
    private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
    {
        switch(hiByte)
        {
            case 0:
                return (jjbitVec2[i2] & l2) != 0L;
            default :
                if ((jjbitVec0[i1] & l1) != 0L) {
                    return true;
                }
                return false;
        }
    }
    private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
    {
        switch(hiByte)
        {
            case 0:
                return (jjbitVec4[i2] & l2) != 0L;
            case 3:
                return (jjbitVec5[i2] & l2) != 0L;
            case 32:
                return (jjbitVec6[i2] & l2) != 0L;
            case 33:
                return (jjbitVec7[i2] & l2) != 0L;
            case 47:
                return (jjbitVec8[i2] & l2) != 0L;
            case 48:
                return (jjbitVec0[i2] & l2) != 0L;
            case 253:
                return (jjbitVec9[i2] & l2) != 0L;
            case 255:
                return (jjbitVec10[i2] & l2) != 0L;
            default :
                if ((jjbitVec3[i1] & l1) != 0L) {
                    return true;
                }
                return false;
        }
    }
    private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
    {
        switch(hiByte)
        {
            case 0:
                return (jjbitVec11[i2] & l2) != 0L;
            case 3:
                return (jjbitVec12[i2] & l2) != 0L;
            case 32:
                return (jjbitVec13[i2] & l2) != 0L;
            case 33:
                return (jjbitVec7[i2] & l2) != 0L;
            case 47:
                return (jjbitVec8[i2] & l2) != 0L;
            case 48:
                return (jjbitVec0[i2] & l2) != 0L;
            case 253:
                return (jjbitVec9[i2] & l2) != 0L;
            case 255:
                return (jjbitVec10[i2] & l2) != 0L;
            default :
                if ((jjbitVec3[i1] & l1) != 0L) {
                    return true;
                }
                return false;
        }
    }

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = {
        "", null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, "\50", "\51", "\133", "\135", "\54", "\56", "\73",
        "\100\160\162\145\146\151\170", "\136\136", "\100\142\141\163\145", "\100", "\141", null, "\137\72",
        "\164\162\165\145", "\146\141\154\163\145", "\123\105\114\105\103\124", "\127\110\105\122\105",
        "\106\111\114\124\105\122", null, null, null, null, null, null, null, null, null, null, null, };

    /** Lexer state names. */
    public static final String[] lexStateNames = {
        "DEFAULT",
        "IN_STRING",
        "IN_LONG_STRING",
    };

    /** Lex State array. */
    public static final int[] jjnewLexState = {
        -1, -1, -1, -1, -1, -1, 1, -1, -1, 0, 2, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    };
    static final long[] jjtoToken = {
        0xfffffffff201L,
    };
    static final long[] jjtoSkip = {
        0x3eL,
    };
    static final long[] jjtoMore = {
        0xdc0L,
    };
    protected JavaCharStream input_stream;
    private final int[] jjrounds = new int[59];
    private final int[] jjstateSet = new int[118];
    protected char curChar;
    /** Constructor. */
    public TurtleParserTokenManager(JavaCharStream stream){
        if (JavaCharStream.staticFlag) {
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        }
        input_stream = stream;
    }

    /** Constructor. */
    public TurtleParserTokenManager(JavaCharStream stream, int lexState){
        this(stream);
        SwitchTo(lexState);
    }

    /** Reinitialise parser. */
    public void ReInit(JavaCharStream stream)
    {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }
    private void ReInitRounds()
    {
        int i;
        jjround = 0x80000001;
        for (i = 59; i-- > 0;) {
            jjrounds[i] = 0x80000000;
        }
    }

    /** Reinitialise parser. */
    public void ReInit(JavaCharStream stream, int lexState)
    {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Switch to specified lex state. */
    public void SwitchTo(int lexState)
    {
        if (lexState >= 3 || lexState < 0) {
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        } else {
            curLexState = lexState;
        }
    }

    protected Token jjFillToken()
    {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = im == null ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /** Get the next Token. */
    public Token getNextToken()
    {
        Token matchedToken;
        int curPos = 0;

        EOFLoop :
            for (;;)
            {
                try
                {
                    curChar = input_stream.BeginToken();
                }
                catch(java.io.IOException e)
                {
                    jjmatchedKind = 0;
                    matchedToken = jjFillToken();
                    return matchedToken;
                }

                for (;;)
                {
                    switch(curLexState)
                    {
                        case 0:
                            try { input_stream.backup(0);
                            while (curChar <= 32 && (0x100002600L & 1L << curChar) != 0L) {
                                curChar = input_stream.BeginToken();
                            }
                            }
                            catch (java.io.IOException e1) { continue EOFLoop; }
                            jjmatchedKind = 0x7fffffff;
                            jjmatchedPos = 0;
                            curPos = jjMoveStringLiteralDfa0_0();
                            if (jjmatchedPos == 0 && jjmatchedKind > 47)
                            {
                                jjmatchedKind = 47;
                            }
                            break;
                        case 1:
                            jjmatchedKind = 0x7fffffff;
                            jjmatchedPos = 0;
                            curPos = jjMoveStringLiteralDfa0_1();
                            break;
                        case 2:
                            jjmatchedKind = 0x7fffffff;
                            jjmatchedPos = 0;
                            curPos = jjMoveStringLiteralDfa0_2();
                            if (jjmatchedPos == 0 && jjmatchedKind > 11)
                            {
                                jjmatchedKind = 11;
                            }
                            break;
                    default:
                        break;
                    }
                    if (jjmatchedKind != 0x7fffffff)
                    {
                        if (jjmatchedPos + 1 < curPos) {
                            input_stream.backup(curPos - jjmatchedPos - 1);
                        }
                        if ((jjtoToken[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 077)) != 0L)
                        {
                            matchedToken = jjFillToken();
                            if (jjnewLexState[jjmatchedKind] != -1) {
                                curLexState = jjnewLexState[jjmatchedKind];
                            }
                            return matchedToken;
                        }
                        else if ((jjtoSkip[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 077)) != 0L)
                        {
                            if (jjnewLexState[jjmatchedKind] != -1) {
                                curLexState = jjnewLexState[jjmatchedKind];
                            }
                            continue EOFLoop;
                        }
                        if (jjnewLexState[jjmatchedKind] != -1) {
                            curLexState = jjnewLexState[jjmatchedKind];
                        }
                        curPos = 0;
                        jjmatchedKind = 0x7fffffff;
                        try {
                            curChar = input_stream.readChar();
                            continue;
                        }
                        catch (java.io.IOException e1) { }
                    }
                    int error_line = input_stream.getEndLine();
                    int error_column = input_stream.getEndColumn();
                    String error_after = null;
                    boolean EOFSeen = false;
                    try { input_stream.readChar(); input_stream.backup(1); }
                    catch (java.io.IOException e1) {
                        EOFSeen = true;
                        error_after = curPos <= 1 ? "" : input_stream.GetImage();
                        if (curChar == '\n' || curChar == '\r') {
                            error_line++;
                            error_column = 0;
                        } else {
                            error_column++;
                        }
                    }
                    if (!EOFSeen) {
                        input_stream.backup(1);
                        error_after = curPos <= 1 ? "" : input_stream.GetImage();
                    }
                    throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
                }
            }
    }

    private void jjCheckNAdd(int state)
    {
        if (jjrounds[state] != jjround)
        {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }
    private void jjAddStates(int start, int end)
    {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }
    private void jjCheckNAddTwoStates(int state1, int state2)
    {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    private void jjCheckNAddStates(int start, int end)
    {
        do {
            jjCheckNAdd(jjnextStates[start]);
        } while (start++ != end);
    }

}
