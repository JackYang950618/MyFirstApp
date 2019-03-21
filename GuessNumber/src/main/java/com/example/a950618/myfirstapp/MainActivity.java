package com.example.a950618.myfirstapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b2;
    TextView t1;
    int i=getRandom();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b2=(Button)findViewById(R.id.b2);
        System.out.println(i);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1=(TextView)findViewById(R.id.t1);
                AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);

                builder.setPositiveButton("是" ,  null );
                if(t1.getText().toString().trim().length()>0){
                    int number=Integer.parseInt(t1.getText().toString().trim());


                    if(number==i){
                        builder.setMessage("恭喜你答对了!" ) ;
                        builder.show();
                    }
                    else {
                        if(number<i){
                            builder.setMessage("小了!" ) ;
                            builder.show();
                        }
                        if(number>i){
                            builder.setMessage("大了!" ) ;
                            builder.show();
                        }
                    }

                }
                else {
                    builder.setMessage("请输入数字!" ) ;
                    builder.show();
                }

            }
        });

    }

    /*生成随机数*/
    public int getRandom(){
        return (int)(1+Math.random()*(100));
    }
}
