package com.amp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.security.InvalidParameterException;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
,View.OnClickListener{
    private ArrayAdapter<CharSequence> type_adapter, item_adapter;
    private Spinner country_spinner, type_spinner,item_spinner;
    private boolean isCanada = true, isUSA_Intern = false;
    private String country = RateCalculator.CANADA, type = RateCalculator.STANDARD,
    item = RateCalculator.STAMP_BCP;
    private double weight = 30;
    private RateCalculator rateCalculator = new RateCalculator();
    private TextView rate_view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // button
        Button button = (Button) findViewById(R.id.button_rate);
        button.setOnClickListener(this);

        // the textview to display the computing rate
        rate_view = (TextView) findViewById(R.id.rate_textView);
        spinnerSetup();

    }


    // set up the spinner
    void spinnerSetup() {
        // get the view of the spinners
        country_spinner = (Spinner) findViewById(R.id.country_spinner);
        type_spinner = (Spinner) findViewById(R.id.type_spinner);
        item_spinner = (Spinner) findViewById(R.id.item_spinner);


        // Create an ArrayAdapter for country_adpater
        ArrayAdapter<CharSequence> country_adapter = ArrayAdapter.createFromResource(this,
                R.array.country_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        country_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        country_spinner.setAdapter(country_adapter);

        // set on itemSelectedListener
        country_spinner.setOnItemSelectedListener(this);
        type_spinner.setOnItemSelectedListener(this);
        item_spinner.setOnItemSelectedListener(this);

    }

    // apply the changes to the list in the spinner
    private void applyChanges (AdapterView<?> parent,  int position)
    {
        // get the id of the spinner
        // int ID = parent.getId();

        switch (parent.getId())
        {
            // if the country spinner is selected, check if USA or International
            case R.id.country_spinner:
                // if Canada, change the items in type spinner to be compatible with Canada
                if (position == 0){
                    type_adapter = ArrayAdapter.createFromResource(this,
                            R.array.type_Canada_array, android.R.layout.simple_spinner_item);
                    type_spinner.setAdapter(type_adapter);
                    isCanada = true;
                    isUSA_Intern = false;

                }
                // if not Canada, set the type to be compatible with USA or international
                if(position == 1 || position == 2) {
                    type_adapter = ArrayAdapter.createFromResource(this,
                            R.array.type_USA_Internal_array, android.R.layout.simple_spinner_item);
                    type_spinner.setAdapter(type_adapter);
                    isCanada = false;
                    isUSA_Intern = true;
                }
                // set the dropdownView
                type_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                // now when the change is made in TYPE spinner
            case R.id.type_spinner:
                // if is Canada and the Standard is selected,
                // Item spinner will be updated with standard item
                if (isCanada && position == 0)
                {
                    item_adapter = ArrayAdapter.createFromResource(this,
                            R.array.item_Standard_array, android.R.layout.simple_spinner_item);

                    item_spinner.setAdapter(item_adapter);


                }
                // else it will be updated letter-post or other
                else {
                    item_adapter = ArrayAdapter.createFromResource(this,
                            R.array.item_general_array, android.R.layout.simple_spinner_item);
                    item_spinner.setAdapter(item_adapter);
                }
                item_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        }
    }


    // when select an item
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       applyChanges(parent, position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {

        country = country_spinner.getSelectedItem().toString();
        type = type_spinner.getSelectedItem().toString();
        item = item_spinner.getSelectedItem().toString();

        EditText wei = (EditText) findViewById(R.id.rate_editText);
        weight = Double.parseDouble(wei.getText().toString());
        double rate = 0.0;

        try {
          rate  = rateCalculator.getRate(country, type,item,weight);
        }
        catch (InvalidParameterException e)
        {
            rate_view.setText("The value of Weight cannot be " + weight +  "g for this type");
            return;
        }

        rate_view.setText("The computing rate is $" + rate);

    }
}
