package net.atshq.drawableclick;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ett=findViewById(R.id.et);

        ett.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_LEFT = 0;
                final int DRAWABLE_TOP = 1;
                final int DRAWABLE_RIGHT = 2;
                final int DRAWABLE_BOTTOM = 3;

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (ett.getRight() - ett.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        // your action here
                        Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                        return true;
                    }else if(event.getRawX() >= (ett.getLeft() - ett.getCompoundDrawables()[DRAWABLE_LEFT].getBounds().width())) {
                        // your action here
                        Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                        return true;
                    }else if(event.getRawX() >= (ett.getTop() - ett.getCompoundDrawables()[DRAWABLE_TOP].getBounds().width())) {
                        // your action here
                        Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                        return true;
                    }else if(event.getRawX() >= (ett.getBottom() - ett.getCompoundDrawables()[DRAWABLE_BOTTOM].getBounds().width())) {
                        // your action here
                        Toast.makeText(MainActivity.this, "Right", Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
