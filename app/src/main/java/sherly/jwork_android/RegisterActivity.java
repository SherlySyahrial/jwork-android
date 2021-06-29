package sherly.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Class RegisterActivity, untuk proses register
 * @author Sherly
 * @version 28-06-2021
 */
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName = findViewById(R.id.etRegisterName);
        final EditText etEmail2 = findViewById(R.id.etRegisterEmail);
        final EditText etPassword2 = findViewById(R.id.etRegisterPassword);
        final Button btRegist = findViewById(R.id.btnRegister);

        /**
         * Saat menekan tombol register
         */
        btRegist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name = etName.getText().toString();
                String email = etEmail2.getText().toString();
                String password = etPassword2.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response){
                        try{
                            JSONObject jsonObject = new JSONObject(response);
                            if(jsonObject != null){
                                Toast.makeText(RegisterActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch(JSONException e){
                            Toast.makeText(RegisterActivity.this, "Register Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name, email, password,
                        responseListener, error -> { System.err.println(error); });
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}
