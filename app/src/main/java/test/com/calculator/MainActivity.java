package test.com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUserInput ;
    private TextView tvResult ;
    private Button btnClear;
    private Button btnPercentage ;
    private Button btnDevide ;
    private Button btnBack ;
    private Button btnSeven ;
    private Button btnEight ;
    private Button btnNine ;
    private Button btnMultiply ;
    private Button btnFour ;
    private Button btnFive ;
    private Button btnSix ;
    private Button btnMinus ;
    private Button btnOne ;
    private Button btnTwo ;
    private Button btnThree ;
    private Button btnSum ;
    private Button btnZero ;
    private Button btnDot ;
    private Button btnParenthese ;
    private Button btnEqual ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();   // declaring editText , TextView and All Buttons
        setListener();  // setting click listener for buttons
    }

    private void initialize() {

        etUserInput = (EditText) findViewById(R.id.et_userinput);
        tvResult = (TextView) findViewById(R.id.tv_userResult);

        btnClear = (Button) findViewById(R.id.button_clear);
        btnPercentage = (Button) findViewById(R.id.button_percentage);
        btnDevide = (Button) findViewById(R.id.button_devide);
        btnBack = (Button) findViewById(R.id.button_back);
        btnSeven = (Button) findViewById(R.id.button_seven);
        btnEight = (Button) findViewById(R.id.button_eight);
        btnNine = (Button) findViewById(R.id.button_nine);
        btnMultiply = (Button) findViewById(R.id.button_multiply);
        btnFour = (Button) findViewById(R.id.button_four);
        btnFive = (Button) findViewById(R.id.button_five);
        btnSix = (Button) findViewById(R.id.button_six);
        btnMinus = (Button) findViewById(R.id.button_minus);
        btnOne = (Button) findViewById(R.id.button_one);
        btnTwo = (Button) findViewById(R.id.button_two);
        btnThree = (Button) findViewById(R.id.button_three);
        btnSum = (Button) findViewById(R.id.button_sum);
        btnZero = (Button) findViewById(R.id.button_zero);
        btnDot = (Button) findViewById(R.id.button_dot);
        btnParenthese = (Button) findViewById(R.id.button_parentheses);
        btnEqual = (Button) findViewById(R.id.button_equal);
    }

    private void setListener() {
        btnClear.setOnClickListener(this);
        btnPercentage.setOnClickListener(this);
        btnDevide.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnParenthese.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_clear:

                break;

            case R.id.button_percentage:

                break;

            case R.id.button_devide:

                break;

            case R.id.button_back:

                break;

            case R.id.button_seven:

                break;

            case R.id.button_eight:

                break;

            case R.id.button_nine:

                break;

            case R.id.button_multiply:

                break;

            case R.id.button_four:

                break;

            case R.id.button_five:

                break;

            case R.id.button_six:

                break;

            case R.id.button_minus:

                break;

            case R.id.button_one:

                break;

            case R.id.button_two:

                break;

            case R.id.button_three:

                break;

            case R.id.button_sum:

                break;

            case R.id.button_zero:

                break;

            case R.id.button_dot:

                break;

            case R.id.button_parentheses:

                break;

            case R.id.button_equal:

                break;
        }
    }
}
