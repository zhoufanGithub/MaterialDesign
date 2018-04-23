package com.zhoufan.materialdesigndemo;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    private CollapsingToolbarLayout mCollapsingToolbar;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mCollapsingToolbar = findViewById(R.id.collapsing_tool_bar);
        mCollapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.color_ffffff));
        mTabLayout = findViewById(R.id.tab_layout);
        initTabLayout();
    }

    private void initTabLayout() {
        mTabLayout.addTab(mTabLayout.newTab().setText("读书"));
        mTabLayout.addTab(mTabLayout.newTab().setText("娱乐"));
        mTabLayout.addTab(mTabLayout.newTab().setText("科技"));
        mTabLayout.addTab(mTabLayout.newTab().setText("新闻"));
    }
}
