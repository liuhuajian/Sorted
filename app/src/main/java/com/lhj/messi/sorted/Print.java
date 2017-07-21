package com.lhj.messi.sorted;

/**
 * Created by messi on 2017/7/21.
 */

public class Print {
    public static void printArrys(int[] arrays){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<arrays.length;i++){
            stringBuilder.append(arrays[i]+" ");
        }
        Logger.d(stringBuilder.toString());
    }
}
