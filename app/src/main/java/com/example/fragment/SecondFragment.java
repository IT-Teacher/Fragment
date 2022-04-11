package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {
    TextView tv;
    Frist mCallback;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        tv = view.findViewById(R.id.textview_second);

        return view;
    }
    public void updateText(String text){
        tv.setText(text);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
            mCallback = (Frist) context;
    }
    @Override
    public void onDetach() {
        mCallback = null;
        super.onDetach();
    }

    public interface Frist{
        public void sendText(String text);
    }

}