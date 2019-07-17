package appstart.mymodappdemo;

import java.util.ServiceLoader;

import appfuncs.simplefuncs.SimpleMathsFuncs;
import userfuncs.binaryfuncs.*;

/**
 * MyModAppDemo
 */
public class MyModAppDemo {

    public static void main(String[] args) {
        if(SimpleMathsFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println("Smallest factor common to both 35 and 105 is " + SimpleMathsFuncs.lcf(35, 105));

        System.out.println("Largest factor common to both 35 and 105 is " + SimpleMathsFuncs.gcf(35, 105));

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;

        for (BinFuncProvider bfp : ldr) {
            if(bfp.get().getname().equals("AbsPlus")){
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null)
            System.out.println("Result of AbsPlus function: " + binOp.func(12, -4));
        else
            System.out.println("AbsPlus function not found.");

        binOp = null;

        for (BinFuncProvider bfp : ldr) {
            if(bfp.get().getname().equals("AbsMinus")){
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null)
            System.out.println("Result of AbsMinus function: " + binOp.func(12, -4));
        else
            System.out.println("AbsMinus function not found.");

        binOp = null;


    }
}