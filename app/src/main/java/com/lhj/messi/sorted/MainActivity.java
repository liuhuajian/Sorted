package com.lhj.messi.sorted;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        int[] arrays = {33,1,22,5,7,32,11,88,102};
        QuickSorted.getQuickValue(arrays);
        int indexFromArrays = BinarySearch.getIndexFromArrays(arrays, 33);
//        int indexFromArrays = BinarySearch.getIndexFromArraysRecursion(arrays, 33);
        Logger.d("index-->"+indexFromArrays);

//        SelectSorted.getSelectSort(arrays);
//        MaoPaoSorted.sortNumberMaoPao(arrays);
    }
}
