package com.fionasiu.studycard;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by fionasiu on 2018-04-01.
 */

public class FabActivity extends AppCompatActivity{
    private Button saveButton;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_activity);
        addDataButton();

    }

    private void addDataButton() {

        saveButton = (Button) findViewById(R.id.saveButton);

        // Create a listener for the button
        saveButton.setOnClickListener(new View.OnClickListener() {

            private EditText addQuestion;
            private EditText addAnswer;

            @Override
            public void onClick(View v) {
                addQuestion = (EditText) findViewById(R.id.addQuestion);
                addAnswer = (EditText) findViewById(R.id.addAnswer);

                question = addQuestion.getText().toString();
                answer = addAnswer.getText().toString();

                int id = StudyCard.ITEMS.size();
                id++;
                StudyCard.CardItem item = new StudyCard.CardItem(String.valueOf(id), question, answer);
                StudyCard.ITEMS.add(item);
                StudyCard.ITEM_MAP.put(String.valueOf(id), item);


                RecyclerView.Adapter a = StudyCard.rView.getAdapter();
                a.notifyDataSetChanged();
                finish();
            }
        });
    }


}
