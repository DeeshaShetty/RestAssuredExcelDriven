import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		JsonPath x=new JsonPath(respon);
		System.out.println(respon);
		return x;
	}
}
