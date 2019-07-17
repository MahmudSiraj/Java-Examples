package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

/**
 * AbsPlus
 */
public class AbsPlus implements BinaryFunc {

    public String getname() {
        return "AbsPlus";

    }


    public int func(int a, int b) { return Math.abs(a) + Math.abs(b);}
}