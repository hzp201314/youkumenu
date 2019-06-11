package com.hzp.youkumenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.hzp.youkumenu.tool.Tool;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button mMenu;
    private Button mHome;
    private Button mBtn31;
    private Button mBtn32;
    private Button mBtn33;
    private Button mBtn34;
    private Button mBtn35;
    private Button mBtn36;
    private Button mBtn37;
    private Button mBtn21;
    private Button mBtn22;

    /**标示上部菜单隐藏显示，true:显示，false:隐藏**/
    private boolean isShowMenuTop = true;
    /**标示中部菜单隐藏显示，true:显示，false:隐藏**/
    private boolean isShowMenuMiddle = true;
    private RelativeLayout mRelMiddle;
    private RelativeLayout mRelTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initView();
    }
    /**
     * 初始化控件
     *
     * 2016-10-28 上午9:39:12
     */
    private void initView() {
        mMenu = (Button) findViewById(R.id.menu);
        mHome = (Button) findViewById(R.id.home);
        mRelTop = (RelativeLayout) findViewById(R.id.rel_top);
        mRelMiddle = (RelativeLayout) findViewById(R.id.rel_middle);


        mBtn31 = (Button) findViewById(R.id.btn_31);
        mBtn32 = (Button) findViewById(R.id.btn_32);
        mBtn33 = (Button) findViewById(R.id.btn_33);
        mBtn34 = (Button) findViewById(R.id.btn_34);
        mBtn35 = (Button) findViewById(R.id.btn_35);
        mBtn36 = (Button) findViewById(R.id.btn_36);
        mBtn37 = (Button) findViewById(R.id.btn_37);
        mBtn21 = (Button) findViewById(R.id.btn_21);
        mBtn22 = (Button) findViewById(R.id.btn_22);

        mBtn31.setOnClickListener( this );
        mBtn32.setOnClickListener( this );
        mBtn33.setOnClickListener( this );
        mBtn34.setOnClickListener( this );
        mBtn35.setOnClickListener( this );
        mBtn36.setOnClickListener( this );
        mBtn37.setOnClickListener( this );
        mBtn21.setOnClickListener( this );
        mBtn22.setOnClickListener( this );


        //设置按钮点击事件
        mMenu.setOnClickListener(this);
        mHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu:
                if (Tool.isAnimationStart()) {
                    return;
                }
                //如果上部的菜单显示，点击隐藏
                //如果上部菜单隐藏，点击显示
                if (isShowMenuTop) {
                    //isShowMenuTop = !isShowMenuTop;
                    Tool.hide(mRelTop,0l);
                }else{
                    //isShowMenuTop = !isShowMenuTop;
                    Tool.show(mRelTop);
                }

                isShowMenuTop = !isShowMenuTop;
                break;
            case R.id.home:
                if (Tool.isAnimationStart()) {
                    return;
                }
                //如果上部菜单显示，点击隐藏上部菜单和中部菜单
                //如果上部菜单隐藏，中部菜单显示，点击隐藏中部菜单
                //如果全部隐藏，点击显示中部菜单
                if (isShowMenuTop) {
                    //如果上部菜单显示，点击隐藏上部菜单和中部菜单
                    isShowMenuTop = false;
                    //isShowMenuMiddle = false;

                    Tool.hide(mRelTop,0l);
                    Tool.hide(mRelMiddle,300l);

                }else if(isShowMenuMiddle){
                    //如果上部菜单隐藏，中部菜单显示，点击隐藏中部菜单
                    //isShowMenuMiddle = false;
                    Tool.hide(mRelMiddle,0l);
                }else{
                    //如果全部隐藏，点击显示中部菜单
                    //isShowMenuMiddle = true;
                    Tool.show(mRelMiddle);
                }
                isShowMenuMiddle = !isShowMenuMiddle;
                break;
            case R.id.btn_31:
                Toast.makeText(this,"btn31", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_32:
                Toast.makeText(this,"btn32", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_33:
                Toast.makeText(this,"btn33", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_34:
                Toast.makeText(this,"btn34", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_35:
                Toast.makeText(this,"btn35", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_36:
                Toast.makeText(this,"btn36", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_37:
                Toast.makeText(this,"btn37", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_21:
                Toast.makeText(this,"btn21", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_22:
                Toast.makeText(this,"btn22", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
