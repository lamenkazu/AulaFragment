package com.example.aulafragment;


import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class HelloFragment extends Fragment {

    //Forma mais recente de fazer o link entre Fragmento.class e xml
    public HelloFragment(){
        super(R.layout.fragment_hello);
    }

    public void changeText(String frase){

        String result = frase.replaceAll("a", "4")
                             .replaceAll("e", "3")
                             .replaceAll("i", "1")
                             .replaceAll("o", "0");


        TextView  textView = this.getView().findViewById(R.id.lblHello);
        textView.setText(result);



    }

}