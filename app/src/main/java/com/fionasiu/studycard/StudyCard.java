package com.fionasiu.studycard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fionasiu on 2018-03-29.
 */

public class StudyCard extends AppCompatActivity {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<CardItem> ITEMS = new ArrayList<CardItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, CardItem> ITEM_MAP = new HashMap<>();

    public static RecyclerView rView;


    static {
        addItem(createCardItem(1, "What is Xcode?", "An integrated development environment for " +
                "macOS containing a suite of software development tools developed by Apple for " +
                "developing software for macOS, iOS, watchOS, and tvOS."));

    }


    private static void addItem(CardItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static CardItem createCardItem(int id, String question, String answer) {
        return new CardItem(String.valueOf(id), question, answer);
    }

    public static class CardItem{
        public final String id;
        public final String question;
        public final String answer;

        public CardItem(String id, String question, String answer){
            this.id = id;
            this.question = question;
            this.answer = answer;
        }

        @Override
        public String toString() {return question;}
    }
}
