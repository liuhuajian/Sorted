package com.lhj.messi.sorted;

/**
 * Created by messi on 2017/7/20.
 */

public class MaoPaoSorted {
    public static void sortNumberMaoPao(int[] arrays){
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays.length-i-1;j++){
                if (arrays[j] >arrays[j+1]){
                    arrays[j] = arrays[j] ^arrays[j+1];
                    arrays[j+1] = arrays[j] ^arrays[j+1];
                    arrays[j] = arrays[j] ^arrays[j+1];
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<arrays.length;i++){
            stringBuilder.append(arrays[i]+" ");
        }
        Logger.d(stringBuilder.toString());
    }
}
