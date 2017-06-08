package mx.edu.cetis108.cetis108_4avpr_app0003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1,num2;
    EditText op1,op2;
    TextView mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.op1 = (EditText) findViewById(R.id.editText1);
        this.op2 = (EditText) findViewById(R.id.editText2);
        this.mostrar = (TextView) findViewById(R.id.textView);
    }
    public void onResultado (View view){
        if (this.op1.getText().toString().length() > 0 && this.op2.getText().toString().length() >0);
        this.num1 = Integer.parseInt(this.op1.getText().toString());
        this.num2 = Integer.parseInt(this.op2.getText().toString());
        if (this.num1>this.num2){
            this.mostrar.setText(Integer.toString(this.num1 - num2));
        }
        else{
            this.mostrar.setText(Integer.toString(this.num1 + num2));

        }
    }
}
