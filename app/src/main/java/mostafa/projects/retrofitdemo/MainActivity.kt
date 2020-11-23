package mostafa.projects.retrofitdemo

import SupplyDetail
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.TextView
import android.widget.Toast
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var demo_txt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        demo_txt = findViewById(R.id.demo_txt)


//        var postsCall = MostafaUtils.apisInterface.getRepos()
//
//        postsCall.enqueue(object : Callback<ArrayList<Poste>> {
//            override fun onResponse(
//                call: retrofit2.Call<ArrayList<Poste>>,
//                response: Response<ArrayList<Poste>>
//            ) {
//
//
//                var post = response.body()?.get(0)
//                println("Posts Data : ${post?.title}")
//                println("Posts Data : ${response.errorBody()?.string()}")
//                demo_txt.setText(post?.title)
//
//            }
//
//            override fun onFailure(call: retrofit2.Call<ArrayList<Poste>>, t: Throwable) {
//                println("Posts error ${t.message}")
//            }
//
//        })


//
//        var login = JsonObject()
//        login.addProperty("phone" , "0128700300222")
//        login.addProperty("password" , "Mostafa14#")
//        var loginCall = MostafaHelper.cut_calls.Login(loginObj = login , accept = "application/json" , content_type = "application/json")
//        loginCall.enqueue(object : Callback<LoginResponse> {
//            override fun onResponse(
//                call: retrofit2.Call<LoginResponse>,
//                response: Response<LoginResponse>
//            ) {
//                if (response.isSuccessful) {
//                    var message = response.body()?.message
//                    println("Mostafa login $message")
//                    Toast.makeText(this@MainActivity , message , Toast.LENGTH_LONG).show()
//                } else {
//                    val errorJsonString = response?.errorBody()?.string()
//                    val json: JSONObject = JSONObject(errorJsonString)
//                    var msg = json.getString("message")
//                    Toast.makeText(this@MainActivity , msg , Toast.LENGTH_LONG).show()
//                    println("Mostafa login error $msg")
//                }
//            }
//
//            override fun onFailure(call: retrofit2.Call<LoginResponse>, t: Throwable) {
//                Toast.makeText(this@MainActivity ,t.message , Toast.LENGTH_LONG).show()
//                println("Login Failed ${t.message}")
//            }
//
//        })


        var supplyCall = MostafaHelper.cut_calls.GetDetails(id = 12 , accept = "application/json" , content_type = "application/json")
        supplyCall.enqueue(object : Callback<SupplyDetail> {
            override fun onResponse(
                call: retrofit2.Call<SupplyDetail>,
                response: Response<SupplyDetail>
            ) {
                if (response.isSuccessful) {
                    var name = response.body()?.relatedSupplies?.name
                    Toast.makeText(this@MainActivity , name , Toast.LENGTH_LONG).show()
                } else {
                    val errorJsonString = response?.errorBody()?.string()
                    val json: JSONObject = JSONObject(errorJsonString)
                    var msg = json.getString("message")
                    Toast.makeText(this@MainActivity , msg , Toast.LENGTH_LONG).show()
                    println("Mostafa login error $msg")
                }
            }

            override fun onFailure(call: retrofit2.Call<SupplyDetail>, t: Throwable) {
                Toast.makeText(this@MainActivity ,t.message , Toast.LENGTH_LONG).show()
                println("Login Failed ${t.message}")
            }

        })












//        println("Start")
//        MostafaHelper.calls.getRepos().enqueue(object : retrofit2.Callback<ArrayList<Post>> {
//            override fun onResponse(call: retrofit2.Call<ArrayList<Post>>, response: Response<ArrayList<Post>>) {
//                println("Gad first call ${response.body()?.get(1)?.title}")
//            }
//
//            override fun onFailure(call: retrofit2.Call<ArrayList<Post>>, t: Throwable) {
//            }
//
//        })
//
//
//        var login=JsonObject()
//        login.addProperty("phone" , "0128700300222")
//        login.addProperty("password" , "123243")
//        MostafaHelper.cut_calls.Login(loginObj = login , accept = MostafaHelper.accept , content_type = MostafaHelper.accept)
//            .enqueue(object : retrofit2.Callback<LoginResponse> {
//                override fun onResponse(
//                    call: retrofit2.Call<LoginResponse>,
//                    response: Response<LoginResponse>
//                ) {
//                    if(response.isSuccessful){
//                        println("Cut Login success ${response.body()?.data}")
//                    }else{
//                        println("Cut Login")
//                    }
//                }
//
//                override fun onFailure(call: retrofit2.Call<LoginResponse>, t: Throwable) {
//                }
//
//            })
    }
}