package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class JobSelesaiRequest, berfungsi untuk membuat request URL, agar bisa menyelesaikan request
 * @author Sherly
 * @version 28-06-2021
 */

public class JobSelesaiRequest extends StringRequest {
    private static final String URL = "http://10.0.2.2:8080/invoice/invoiceStatus/";
    private Map<String, String> params;

    /**
     * Method untuk menyelesaikan request job
     * @param id invoice yang akan diselesaikan
     * @param listener response dari objek pada view
     */
    public JobSelesaiRequest(String id, Response.Listener<String> listener){
        super(Method.PUT, URL, listener, null);
        params = new HashMap<>();
        params.put("id", id);
        params.put("invoiceStatus", "Finished");
    }

    /**
     * Mengembalikan parameter map dari POST yang dipakai untuk request invoice
     * @return parameter yang direquest
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}