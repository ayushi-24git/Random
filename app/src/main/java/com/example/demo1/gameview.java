package com.example.demo1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import androidx.annotation.Nullable;

class gameview extends View
{

    private cell[][] cells;
    private static final int rows=7,cols=10;

    public gameview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        System.out.println("helloayu4");
    }


    private void createmaze()
    {
        cells=new cell[cols][rows];
        System.out.println("helloayu3");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)

            {
                cells[i][j]=new cell(i,j);
            }
        }
    }




    private class cell
    {
        boolean topwall=true,leftwall=true,rightwall=true,bottomwall=true;
        int col,row;

        public cell(int col,int row) {
            this.col=col;
            this.row=row;
            System.out.println("helloayu2");

        }
    }
}
