package com.example.simplecal;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, sub, mul, div, eq}
    private double data01=0, data02 = 0;
    private Operator opp = Operator.none;
    private boolean hasDot = false;
    private boolean requiresCleaning = false;
    Button button_0,button_1,button_2,button_3,button_4, button_5, button_6,button_7,button_8,button_9;
    Button button_c, button_AC, button_open, button_closed;
    Button button_add, button_sub, button_mul, button_div, button_equalsto, button_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);

        button_c = findViewById(R.id.button_c);
        button_AC = findViewById(R.id.button_AC);
        button_open = findViewById(R.id.button_openedBracket);
        button_closed = findViewById(R.id.button_closedBracket);

        button_add = findViewById(R.id.button_add);
        button_sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);

        button_equalsto = findViewById(R.id.button_dot);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public void btn00Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"0");
    }
    public void btn01Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"1");
    }
    public void btn02Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"2");
    }
    public void btn03Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"3");
    }
    public void btn04Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"4");
    }
    public void btn05Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"5");
    }

    public void btn06Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"6");
    }
    public void btn07Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"7");
    }
    public void btn08Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"8");
    }
    public void btn09Click(View view)
    {
        EditText eText = (EditText)findViewById(R.id.result);
        eText.setText(eText.getText()+"9");
    }
}