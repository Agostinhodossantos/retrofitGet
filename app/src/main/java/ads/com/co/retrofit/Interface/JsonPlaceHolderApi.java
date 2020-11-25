package ads.com.co.retrofit.Interface;

import java.util.List;

import ads.com.co.retrofit.Model.Posts;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Posts>> getPosts();


}
