package mostafa.projects.retrofitdemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MostafaUtils {
    companion object{
        var BaseUrl = "https://jsonplaceholder.typicode.com/"


        var retrofitBuilder = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var apisInterface = retrofitBuilder.create(MyServices::class.java)



    }
}