package ru.redgeeks.lessons.multifeatures.netlibrary;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Статья по работе с сетью
// https://habr.com/ru/post/429058/

public class NetworkService {
    private static final NetworkService ourInstance = new NetworkService();

    public static NetworkService getInstance() {
        return ourInstance;
    }

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private Retrofit mRetrofit;


    private NetworkService() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor);


        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();
    }

    public JSONPlaceHolderApi getJSONApi() {
        return mRetrofit.create(JSONPlaceHolderApi.class);
    }
}
