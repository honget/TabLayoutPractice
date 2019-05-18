package com.example.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setValues();
        setupEvent();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {
        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("채팅목록").setIcon(R.mipmap.ic_launcher));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("검색"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabViwe("커스텀", "")));
        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabViwe("커스텀2", "")));
    }

    public View createCustomTabViwe(String tabName, String imgUrl){

        View tabView = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);

        TextView nameTxt = tabView.findViewById(R.id.nameTxtV);
        nameTxt.setText(tabName);

        return tabView;
    }

    @Override
    public void bindViews() {
       act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
