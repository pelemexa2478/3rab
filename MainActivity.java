package sobolnikov.roma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox[] chk = new CheckBox[4];
    EditText[] num = new EditText[4];
    float price[] = new float[4];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num[0] = findViewById((R.id.num0));
        num[1] = findViewById((R.id.num1));
        num[2] = findViewById((R.id.num2));
        num[3] = findViewById((R.id.num3));

        chk[0] = findViewById((R.id.checkBox));
        chk[1] = findViewById((R.id.checkBox2));
        chk[2] = findViewById((R.id.checkBox3));
        chk[3] = findViewById((R.id.checkBox4));

        price[0] = 10.25f;
        price[1] = 20.10f;
        price[2] = 5.99f;
        price[3] = 17.55f;
    }

    public void onCalc(View v)
    {


        float sum =0.0f;
        //int n = 5;
        for (int i = 0; i < 4; i++)
        {

            if (chk[i].isChecked())
            {
                int q = Integer.parseInt((num[i].getText().toString()));
                float val = q * price[i];
                sum += val;
            }


        }
        Toast.makeText(this, "" + sum, Toast.LENGTH_SHORT).show();



    }

}