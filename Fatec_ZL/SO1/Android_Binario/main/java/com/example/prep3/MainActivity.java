package com.example.prep3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    private final AppBarConfiguration appBarConfiguration;

    public MainActivity(EditText editText, AppBarConfiguration appBarConfiguration) {
        this.editText = editText;
        this.appBarConfiguration = appBarConfiguration;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_view);

        Binary();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
    
    @SuppressLint("SetTextI18n")
    public void Binary(){
        int valor = 0;

        while(valor < 1 || valor > 1000){
            textView.setText("valor inválido, deverá ser digitado novamente");
            try {
                Thread.sleep(120);
            } catch (Exception e){
                e.printStackTrace();
            }
            try {
                valor = Integer.parseInt(editText.getText().toString());
            } catch (NumberFormatException e) {
                editText.setText("Digite o valor: ");
            }
        }

        String binario = Integer.toBinaryString(valor);
        textView.append("\nbinário: " + binario);
    }

}