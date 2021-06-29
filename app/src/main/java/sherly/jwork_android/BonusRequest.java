package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class BonusRequest, berfungsi untuk melakukan request bonus dalam bentuk url
 * @author Sherly
 * @version 28-06-2021
 */

public class BonusRequest extends StringRequest {
    private Map<String,String> params;
    private static final String URL = "http://10.0.2.2:8080/bonus/";

    /**
     * Bonus Request untuk mendapatkan promo sesuai kode yang dimasukkan
     * @param referralCode yang mau didapatkan
     * @param listener response yang dilakukan dari objek pada view
     */
    public BonusRequest(String referralCode, Response.Listener<String> listener) {
        super(Method.GET, URL + referralCode, listener, null);
        params = new HashMap<>();
    }

    /**
     * Mengembalikan parameter map dari POST yang dipakai sebagai request
     * @return Parameter request
     * @throws AuthFailureError jika ada kesalahan autentikasi
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}