package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Class RegisterRequest, untuk membuat request URL saat proses register
 * @author Sherly
 * @version 28-06-2021
 */

public class RegisterRequest extends StringRequest
{
    private static String URL = "http://10.0.2.2:8080/jobseeker/register";
    private Map<String, String> params;

    /**
     * Method RegisterRequest
     * @param name
     * @param email
     * @param password
     * @param listener response yang dilakukan dari objek pada view
     */
    public RegisterRequest(String name, String email, String password, Response.Listener<String> listener,
                           Response.ErrorListener errListener) {
        super(Method.POST, URL, listener, errListener);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
    }

    /**
     * Mengembalikan parameter Map dari POST yang digunakan untuk request job
     * @return parameter request yang ada
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
