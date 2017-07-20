package umgapp.gt.umgapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private Button bt1;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.noEstudiante);
        tv1 =(TextView) findViewById(R.id.tv1);

    }

    public void calcular(View view)
    {

        int numero = Integer.parseInt(et1.getText().toString()) ;
        int nuevoNumero = (int) (Math.random() * numero) + 1;

        tv1.setText( String.valueOf( nuevoNumero ) );

    }
}
