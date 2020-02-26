package com.example.fitnessapplication1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class UserData extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        Spinner ageRangeSpinner = findViewById(R.id.spnrAgeRange);
        ArrayAdapter<String> ageRangeAdapter = new ArrayAdapter<String>(UserData.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.ageRange));
        ageRangeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ageRangeSpinner.setAdapter(ageRangeAdapter);
        //Age range spinner

        Spinner activityLevelSpinner = findViewById(R.id.spnrActivityLevel);
        ArrayAdapter<String> activityLevelAdapter = new ArrayAdapter<String>(UserData.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.activityLevel));
        activityLevelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activityLevelSpinner.setAdapter(activityLevelAdapter);
        //Activity level spinner

        Spinner targetWeightSpinner = findViewById(R.id.spnrTargetWeight);
        ArrayAdapter<String> targetWeightAdapter = new ArrayAdapter<String>(UserData.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.weightChange));
        targetWeightAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        targetWeightSpinner.setAdapter(targetWeightAdapter);
        //Target weight spinner

        Spinner sexSpinner = findViewById(R.id.spnrSex);
        ArrayAdapter<String> sexAdapter = new ArrayAdapter<String>(UserData.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sex));
        sexAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sexSpinner.setAdapter(sexAdapter);
        //Sex Spinner


        Spinner mySpinner = (Spinner) findViewById(R.id.spnrSex);
        String choice = mySpinner.getSelectedItem().toString();

        System.out.println(choice);



    }

    public class IntensityRatio
    {

        protected static final int AGE_LEVEL_1 = 0;
        protected static final int AGE_LEVEL_2 = 1;
        protected static final int AGE_LEVEL_3 = 2;
        protected static final int AGE_LEVEL_4 = 3;
        //For AGE_LEVEL array position

        protected static final int WEIGHT_TARGET_1 = 0;
        protected static final int WEIGHT_TARGET_2 = 1;
        protected static final int WEIGHT_TARGET_3 = 2;
        protected static final int WEIGHT_TARGET_4 = 3;
        protected static final int WEIGHT_TARGET_5 = 4;
        //For WEIGHT_TARGET array position

        protected static final int ACTIVITY_LEVEL_1 = 0;
        protected static final int ACTIVITY_LEVEL_2 = 1;
        protected static final int ACTIVITY_LEVEL_3 = 2;
        protected static final int ACTIVITY_LEVEL_4 = 3;
        //For ACTIVITY_LEVEL array position

        double[] ageFactors = {1.0, 0.75, 0.5, 0.25};
        double[] weightFactors = {0.2, 0.4, 0.6, 0.8, 1.0};
        double[] activityFactors = {0.25, 0.5, 0.75, 1};
        //Values corresponding to choices on spinners, if not working changed to protected

        public  double calculateIntensity(int activityLevel, int ageRange, int targetWeight)
        {
            double intensityRatio = (activityFactors[activityLevel] + ageFactors[ageRange] + weightFactors[targetWeight]);
            return intensityRatio;

        }

    }


}
