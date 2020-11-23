package mostafa.projects.retrofitdemo

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterfaces {

    @GET("posts")
    fun GetPosts(
    ):Call<PostsData>
}