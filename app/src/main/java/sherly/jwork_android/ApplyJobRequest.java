package sherly.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Class ApplyJobRequest, digunakan untuk melakukan request dalam bentuk url, sesuai dengan pilihan pembayaran
 * @author Sherly
 * @version 28-06-2021
 */

public class ApplyJobRequest extends StringRequest {
    private Map<String, String> params;
    private static final String URL_BANK = "http://10.0.2.2:8080/invoice/createBankPayment";
    private static final String URL_WALLET = "http://10.0.2.2:8080/invoice/createEWalletPayment";

    /**
     * Jika memilih pilihan bank
     * @param jobIdList
     * @param jobseekerId
     * @param listener
     */
    public ApplyJobRequest(String jobIdList, String jobseekerId, Response.Listener<String> listener) {
        super(Method.POST, URL_BANK, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", jobIdList);
        params.put("jobseekerId", jobseekerId);
        params.put("adminFee", "2500");
    }

    /**
     * Jika memilih pilihan E-wallet
     * @param job
     * @param id
     * @param referralCode
     * @param listener
     */
    public ApplyJobRequest(String job, String id, String referralCode, Response.Listener<String> listener) {
        super(Method.POST, URL_WALLET, listener, null);
        params = new HashMap<>();
        params.put("jobIdList", job);
        params.put("jobseekerId", id);
        params.put("referralCode", referralCode);
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
