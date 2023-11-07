package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    ImageView img1,img2,img3,img4;
    TextView na1, ad1, bi1, em1, co1,  de1, col1, pas1, hob,hob1,hob2,hob3,sc1,ski1, ski2, ski3,obj1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

      img1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent i = new Intent(SecondActivity2.this, therdActivity3.class);
              String Name = na1.getText().toString();
              String Address = ad1.getText().toString();
              String BirthDate = bi1.getText().toString();
              String EMailId = em1.getText().toString();
              String ContectNumber = co1.getText().toString();
              String Degree = de1.getText().toString();
              String CollegeSchoolUni = co1.getText().toString();
              String PassingYear = pas1.getText().toString();
              String Score = sc1.getText().toString();
              String HobbyDetails = hob.getText().toString();
              String Hobby1 = hob1.getText().toString();
              String Hobby2 = hob2.getText().toString();
              String Hobby3 = hob3.getText().toString();
              String Skill1 = ski1.getText().toString();
              String Skill2 = ski2.getText().toString();
              String Skill3 = ski3.getText().toString();
              String ObjectivDetails = obj1.getText().toString();


              i.putExtra("Name", Name);
              i.putExtra("Address", Address);
              i.putExtra("BirthDate", BirthDate);
              i.putExtra("EMailId", EMailId);
              i.putExtra("ContectNumber", ContectNumber);
              i.putExtra("Degree", Degree);
              i.putExtra("CollegeSchoolUni", CollegeSchoolUni);
              i.putExtra("PassingYear", PassingYear);
              i.putExtra("Score", Score);
              i.putExtra("HobbyDetails",HobbyDetails);
              i.putExtra("Hobby1",Hobby1);
              i.putExtra("Hobby2",Hobby2);
              i.putExtra("Hobby3",Hobby3);
              i.putExtra("Skill1", Skill1);
              i.putExtra("Skill2", Skill2);
              i.putExtra("Skill3", Skill3);
              i.putExtra("ObjectivDetails",ObjectivDetails);
              startActivity(i);
          }
      });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SecondActivity2.this, therdActivity3.class);
                String Name = na1.getText().toString();
                String Address = ad1.getText().toString();
                String BirthDate = bi1.getText().toString();
                String EMailId = em1.getText().toString();
                String ContectNumber = co1.getText().toString();
                String Degree = de1.getText().toString();
                String CollegeSchoolUni = co1.getText().toString();
                String PassingYear = pas1.getText().toString();
                String Score = sc1.getText().toString();
                String HobbyDetails = hob.getText().toString();
                String Hobby1 = hob1.getText().toString();
                String Hobby2 = hob2.getText().toString();
                String Hobby3 = hob3.getText().toString();
                String Skill1 = ski1.getText().toString();
                String Skill2 = ski2.getText().toString();
                String Skill3 = ski3.getText().toString();
                String ObjectivDetails = obj1.getText().toString();


                i.putExtra("Name", Name);
                i.putExtra("Address", Address);
                i.putExtra("BirthDate", BirthDate);
                i.putExtra("EMailId", EMailId);
                i.putExtra("ContectNumber", ContectNumber);
                i.putExtra("Degree", Degree);
                i.putExtra("CollegeSchoolUni", CollegeSchoolUni);
                i.putExtra("PassingYear", PassingYear);
                i.putExtra("Score", Score);
                i.putExtra("HobbyDetails",HobbyDetails);
                i.putExtra("Hobby1",Hobby1);
                i.putExtra("Hobby2",Hobby2);
                i.putExtra("Hobby3",Hobby3);
                i.putExtra("Skill1", Skill1);
                i.putExtra("Skill2", Skill2);
                i.putExtra("Skill3", Skill3);
                i.putExtra("ObjectivDetails",ObjectivDetails);
                startActivity(i);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SecondActivity2.this, therdActivity3.class);
                String Name = na1.getText().toString();
                String Address = ad1.getText().toString();
                String BirthDate = bi1.getText().toString();
                String EMailId = em1.getText().toString();
                String ContectNumber = co1.getText().toString();
                String Degree = de1.getText().toString();
                String CollegeSchoolUni = co1.getText().toString();
                String PassingYear = pas1.getText().toString();
                String Score = sc1.getText().toString();
                String HobbyDetails = hob.getText().toString();
                String Hobby1 = hob1.getText().toString();
                String Hobby2 = hob2.getText().toString();
                String Hobby3 = hob3.getText().toString();
                String Skill1 = ski1.getText().toString();
                String Skill2 = ski2.getText().toString();
                String Skill3 = ski3.getText().toString();
                String ObjectivDetails = obj1.getText().toString();


                i.putExtra("Name", Name);
                i.putExtra("Address", Address);
                i.putExtra("BirthDate", BirthDate);
                i.putExtra("EMailId", EMailId);
                i.putExtra("ContectNumber", ContectNumber);
                i.putExtra("Degree", Degree);
                i.putExtra("CollegeSchoolUni", CollegeSchoolUni);
                i.putExtra("PassingYear", PassingYear);
                i.putExtra("Score", Score);
                i.putExtra("HobbyDetails",HobbyDetails);
                i.putExtra("Hobby1",Hobby1);
                i.putExtra("Hobby2",Hobby2);
                i.putExtra("Hobby3",Hobby3);
                i.putExtra("Skill1", Skill1);
                i.putExtra("Skill2", Skill2);
                i.putExtra("Skill3", Skill3);
                i.putExtra("ObjectivDetails",ObjectivDetails);
                startActivity(i);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SecondActivity2.this, therdActivity3.class);
                String Name = na1.getText().toString();
                String Address = ad1.getText().toString();
                String BirthDate = bi1.getText().toString();
                String EMailId = em1.getText().toString();
                String ContectNumber = co1.getText().toString();
                String Degree = de1.getText().toString();
                String CollegeSchoolUni = co1.getText().toString();
                String PassingYear = pas1.getText().toString();
                String Score = sc1.getText().toString();
                String HobbyDetails = hob.getText().toString();
                String Hobby1 = hob1.getText().toString();
                String Hobby2 = hob2.getText().toString();
                String Hobby3 = hob3.getText().toString();
                String Skill1 = ski1.getText().toString();
                String Skill2 = ski2.getText().toString();
                String Skill3 = ski3.getText().toString();
                String ObjectivDetails = obj1.getText().toString();


                i.putExtra("Name", Name);
                i.putExtra("Address", Address);
                i.putExtra("BirthDate", BirthDate);
                i.putExtra("EMailId", EMailId);
                i.putExtra("ContectNumber", ContectNumber);
                i.putExtra("Degree", Degree);
                i.putExtra("CollegeSchoolUni", CollegeSchoolUni);
                i.putExtra("PassingYear", PassingYear);
                i.putExtra("Score", Score);
                i.putExtra("HobbyDetails",HobbyDetails);
                i.putExtra("Hobby1",Hobby1);
                i.putExtra("Hobby2",Hobby2);
                i.putExtra("Hobby3",Hobby3);
                i.putExtra("Skill1", Skill1);
                i.putExtra("Skill2", Skill2);
                i.putExtra("Skill3", Skill3);
                i.putExtra("ObjectivDetails",ObjectivDetails);
                startActivity(i);
            }
        });



    }
}