package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Class LoginRequest, berfungsi untuk membuat request URL saat login
 * @author Sherly
 * @version 28-06-2021
 */

public class LoginRequest extends StringRequest {
    private static String URL = "http://10.0.2.2:8080/jobseeker/login";
    private Map<String, String> params;

    /**
     * Method request saat login
     * @param email
     * @param password
     * @param listener response yang dilakukan dari objek pada view
     */
    public LoginRequest(String email, String password, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
    }

    /**
     * Mengembalikan parameter Map dari POST yang digunakan untuk request login
     * @return parameter request
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
