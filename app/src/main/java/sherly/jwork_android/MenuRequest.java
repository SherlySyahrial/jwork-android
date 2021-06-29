package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class MenuRequest, untuk membuat menu yang dipanggil dari activity
 * @author Sherly
 * @version 28-06-2021
 */

public class MenuRequest extends StringRequest {

    private static final String URL = "http://10.0.2.2:8080/job";
    private Map<String, String> params;

    /**
     * Menu request yang diminta pada MainActivity
     * @param listener response yang dilakukan dari objek pada view
     */
    public MenuRequest(Response.Listener<String> listener){
        super(Method.GET, URL, listener, null);
    }

    /**
     * Mengembalikan parameter Map dari POST yang digunakan untuk request job
     * @return parameter request yang ada
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return null;
    }
}