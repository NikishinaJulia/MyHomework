package ru.gb.myhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView greeting;
    private EditText newsToday;
    private Button newsButton;
    private Switch newsSubscription;
    private CheckBox termsOfUse;
    private ToggleButton adButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_activity);

        greeting = findViewById(R.id.greeting_text_view);
        newsToday = findViewById(R.id.news_today);
        newsButton = findViewById(R.id.news_button);
        newsSubscription= findViewById(R.id.subscription_news_switch);
        termsOfUse = findViewById(R.id.terms_of_use_checkbox);
        adButton = findViewById(R.id.ad_toggle_button);
    }
}