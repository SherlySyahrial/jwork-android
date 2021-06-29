package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class JobFetchRequest, berfungsi untuk membuat request url agar bisa mengambil job request yang sudah dibuat
 * @author Sherly
 * @version 28-06-2021
 */

public class JobFetchRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2:8080/invoice/Jobseeker/";
    private Map<String, String> params;

    /**
     * Method request untuk mengambil requets yang ada
     * @param jobseekerId parameter id jobseeker
     * @param listener response dari objek pada view
     */
    public JobFetchRequest(String jobseekerId, Response.Listener<String> listener){
        super(Method.GET, URL+jobseekerId, listener, null);
        params = new HashMap<>();
    }

    /**
     * Mengembalikan parameter map dari POST yang digunakan pada request invoice
     * @return parameter request
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
