package mostafa.projects.retrofitdemo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MostafaHelper {
    companion object{
        var rtrofitBuilder = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var calls = rtrofitBuilder.create(MyServices::class.java)



        var rtrofitBuilder2 = Retrofit.Builder()
            .baseUrl("https://cut-backend-2.appssquare.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var cut_calls = rtrofitBuilder2.create(CutServices::class.java)


        var accept = "application/json"



    }
}