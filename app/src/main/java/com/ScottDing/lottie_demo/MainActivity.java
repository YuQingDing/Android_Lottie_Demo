package com.ScottDing.lottie_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从final开始，就是Lottie的基本使用代码
        final LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.anim_view);//根据id来找到动画控件，在布局设计器里动画空间里的设定是android:id="@+id/anim_view"
        animationView.setAnimation("loading.json");//在assets目录下的动画json文件名，请确保assets文件夹路径是对的，否则程序读取不到动画会强制退出。
        animationView.loop(true);//设置动画循环播放
        animationView.playAnimation();//播放动画
        final Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.anim_view);//根据id来找到动画控件，在布局设计器里动画空间里的设定是android:id="@+id/anim_view"
                animationView.setAnimation("architecture.json");//在assets目录下的动画json文件名，请确保assets文件夹路径是对的，否则程序读取不到动画会强制退出。
                animationView.loop(true);//设置动画循环播放
                animationView.setSpeed((float) 1);//正常速度
                animationView.playAnimation();//播放动画
        }


    });
}


}
