/*
 * Copyright (c) 2020 LibXZR
 */

package xzr.La.systemtoolbox.ui.views;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

import java.util.List;

public class LSpinner extends View {

    public LSpinner(Context context, List<String> items) {
        super(context);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){

    }

    public void setSelection(int position){

    }

    public int getSelection(){
        return 0;
    }

    public String getSelectedLabel(){
        return null;
    }

    public static abstract class OnItemClickListener implements AdapterView.OnItemClickListener{
        public abstract void onClick(int i);

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        }
    }
}
