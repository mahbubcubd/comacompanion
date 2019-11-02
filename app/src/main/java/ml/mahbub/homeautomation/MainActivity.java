package ml.mahbub.homeautomation;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void controller(View view){
        //Navigate the activity to online detection
        Intent i=new Intent(this,controller.class);
        i.putExtra("room",101);
        startActivity(i);
    }
    public void rm102(View view){
        //Navigate the activity to online detection
        Intent i=new Intent(this,controller.class);
        i.putExtra("room",102);
        startActivity(i);
    }
    public void rm103(View view){
        //Navigate the activity to online detection
        Intent i=new Intent(this,controller.class);
        i.putExtra("room",103);
        startActivity(i);
    }
    public void rm104(View view){
        //Navigate the activity to online detection
        Intent i=new Intent(this,controller.class);
        i.putExtra("room",104);
        startActivity(i);
    }
}
