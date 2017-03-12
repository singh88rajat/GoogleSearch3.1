package com.example.mypc.googlesearch31;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText editTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput= (EditText) findViewById(R.id.editTextInput);
    }

public void GoogleSearch(View view)
{
Intent intent= new Intent(Intent.ACTION_WEB_SEARCH);
    String term= editTextInput.getText().toString();
    intent.putExtra(SearchManager.QUERY,term);
  startActivity(intent);
}
}
