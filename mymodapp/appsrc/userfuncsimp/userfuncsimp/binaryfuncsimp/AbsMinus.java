package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

/**
 * AbsMinus
 */
public class AbsMinus implements BinaryFunc {

    public String getname(){
        return "AbsMinus";
    }

    public int func(int a, int b) { return Math.abs(a) - Math.abs(b);}
}