package sengar9.vivek.vivek_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText Email;
     EditText Password;
     Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=findViewById(R.id.editText);
        Password=findViewById(R.id.editText2);
        login=findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,resume.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "login sucessfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
