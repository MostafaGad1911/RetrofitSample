package mostafa.projects.retrofitdemo

import android.telecom.Call
import okhttp3.ResponseBody
import retrofit2.http.GET

interface MyServices {

    @GET("posts")
    fun getRepos(): retrofit2.Call<ArrayList<Poste>>
}