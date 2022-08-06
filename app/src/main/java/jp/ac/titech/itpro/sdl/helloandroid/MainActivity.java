package jp.ac.titech.itpro.sdl.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import jp.ac.titech.itpro.sdl.helloandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private TextView outputView;
    private EditText inputName;
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is called by Script",Toast.LENGTH_SHORT).show();
                mBinding.inputName.setText("");
                mBinding.tvGreet.setText(R.string.enter_name);
            }
        });
    }

    public void greet(View V){
        String name = mBinding.inputName.getText().toString().trim();
        Toast.makeText(getApplicationContext(),"This is called by layout",Toast.LENGTH_SHORT).show();
        if(name.length() > 0){
            mBinding.tvGreet.setText("Hello " + name + "!\nNice to see you!");
        }
    }
}