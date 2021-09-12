package com.example.sampleapp.googlesheets;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class GoogleSheetsUtil {
    private static final String WEB_APP_URL = "https://script.google.com/macros/s/AKfycbxDPUxgUSFOllDkMt0gGojgqgrqIgbkeIpIWDdT3iICT8R4SX-vdXJGvkWMCjI-DnEO/exec";
    private static final String ACTION_NAME = "addItem";

    /** Socket timeout in millis for every attempt. */
    private static final int TIMEOUT_MS = 5000;
    /** Number of allowed retries. */
    private static final int RETRY_COUNT = 3;
    /** Multiplier to increase socket timeout exponentially every retry attempt. */
    private static final int BACKOFF_MULTIPLER = 1;

    private static final Gson GSON = new Gson();
    public static void addItem(final Context context, final GoogleSheetsData data) {
        try {
            RequestQueue requestQueue = Volley.newRequestQueue(context);

            StringRequest stringRequest = new StringRequest(Request.Method.POST, WEB_APP_URL,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            Log.d("Response", response.toString());
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.d("Error.Response", error.toString());
                        }
                    }
            ) {
                @Override
                public Map<String, String> getParams() {
                    final Map<String, String> params = new HashMap<>();
                    params.put("action",ACTION_NAME);
                    params.put("name", data.getName());
                    params.put("email", data.getEmail());
                    params.put("phoneNumber", data.getPhoneNumber());
                    params.put("age", data.getAge());
                    params.put("gender", data.getGender());
                    params.put("score", data.getScore());
                    params.put("sheetId", data.getSheetId());
                    params.put("answers", getAnswersInSerialisedForm(data));
                    return params;
                }
            };

            stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                    TIMEOUT_MS,
                    RETRY_COUNT,
                    BACKOFF_MULTIPLER));

            requestQueue.add(stringRequest);
        } catch (Exception e) {
            Log.d("ErrorMessage", "This is my message");
            e.printStackTrace();
        }
    }

    private static String getAnswersInSerialisedForm(final GoogleSheetsData data) {
        return GSON.toJson(data.getAnswers());
    }
}
