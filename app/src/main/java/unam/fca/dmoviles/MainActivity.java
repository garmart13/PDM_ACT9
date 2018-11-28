package unam.fca.dmoviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText2;
    TextView textViewResult;
    Button button;
    String n1, n2;
    float  a=0, b=0;

    private final static int IMAGE_WIDTH = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=editText.getText().toString();
                n2=editText2.getText().toString();
                a=Float.parseFloat(n1);
                b=Float.parseFloat(n2);
                textViewResult.setText(+(b-a)/a*100+ "% de incremento");
            }
        });
    }
}
