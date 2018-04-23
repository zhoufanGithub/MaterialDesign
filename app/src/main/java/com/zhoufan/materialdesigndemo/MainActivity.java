package com.zhoufan.materialdesigndemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


/**
 * Material Design
 */
public class MainActivity extends AppCompatActivity implements DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavView;
    private Toolbar toolbar;
    private FloatingActionButton mFloatingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);

        //设置Toolbar的一些属性
        //toolbar.setTitle("Title");
        //toolbar.setSubtitle("SubTitle");
        //toolbar.setLogo(R.mipmap.ic_launcher);
        //toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        setSupportActionBar(toolbar);

        initView();
        initEvent();
    }


    /**
     * 初始化View
     */
    private void initView() {
        mDrawerLayout = findViewById(R.id.drawer_layout);
        // 设置内容区域外的颜色，注意，颜色是渐变的
        // mDrawerLayout.setScrimColor(Color.RED);
        mNavView = findViewById(R.id.nav_view);
        mFloatingBtn = findViewById(R.id.floating_btn);
    }

    /**
     * 设置监听
     */
    private void initEvent() {
        mDrawerLayout.addDrawerListener(this);
        mNavView.setNavigationItemSelectedListener(this);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDrawerLayout.isDrawerOpen(mNavView)) {
                    mDrawerLayout.closeDrawer(mNavView);
                } else {
                    mDrawerLayout.openDrawer(mNavView);
                }
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_search:
                        Toast.makeText(MainActivity.this, "点击了设置键", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        mFloatingBtn.setOnClickListener(this);
    }


    /**
     * 当抽屉被滑动的时候调用此方法
     * arg1 表示 滑动的幅度（0-1）
     */
    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {

    }

    /**
     * 当一个抽屉被完全打开的时候被调用
     */
    @Override
    public void onDrawerOpened(View drawerView) {

    }

    /**
     * 当一个抽屉完全关闭的时候调用此方法
     */
    @Override
    public void onDrawerClosed(View drawerView) {

    }

    /**
     * 当抽屉滑动状态改变的时候被调用
     * 状态值是STATE_IDLE（闲置--0）, STATE_DRAGGING（拖拽的--1）, STATE_SETTLING（固定--2）中之一。
     * 抽屉打开的时候，点击抽屉，drawer的状态就会变成STATE_DRAGGING，然后变成STATE_IDLE
     */
    @Override
    public void onDrawerStateChanged(int newState) {
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.floating_btn:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;
        }
    }
}
