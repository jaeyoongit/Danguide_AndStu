package com.example.app1_botnavi.ui.outdoor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OutdoorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OutdoorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("카카오 API 삽입");
    }

    public LiveData<String> getText() {
        return mText;
    }
}