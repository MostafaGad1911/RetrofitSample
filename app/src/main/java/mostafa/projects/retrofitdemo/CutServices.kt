package mostafa.projects.retrofitdemo

import SupplyDetail
import android.telecom.Call
import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.http.*

interface CutServices {



    @POST("user/Login")
    fun Login(
        @Body loginObj: JsonObject,
        @Header("Accept") accept: String?,
        @Header("Content-Type") content_type: String?
    ): retrofit2.Call<LoginResponse>

    @GET("supplyDetails/{id}")
    fun GetDetails(
        @Path("id") id: Int,
        @Header("Accept") accept: String?,
        @Header("Content-Type") content_type: String?
    ):retrofit2.Call<SupplyDetail>
}