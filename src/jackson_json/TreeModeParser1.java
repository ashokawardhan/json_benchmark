package jackson_json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TreeModeParser1
{
	static int iter = 1500;

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		FileInputStream targetFile = new FileInputStream(new File("medium.json"));
		// Get the contents of json as a string using commons IO IOUTils class.
		String genreJson = IOUtils.toString(targetFile, "UTF-8"), temp;
		
		double jacksontime = 0.0, gsontime = 0.0,jacksontimeser = 0.0, gsontimeser = 0.0, gsontimecre = 0.0, jacksontimecre = 0.0, jsontimecre = 0.0, jsontimeser = 0.0, jsontimedes = 0.0, jacksontimeserstring = 0.0, jacksontimedeserstring = 0.0, gsontimeserstring = 0.0, gsontimedeserstring = 0.0;
		long gsonsizeser = 0, gsonsizedes = 0, jacksonsizeser = 0, jacksonsizedes = 0, jsonsizeser = 0, jsonsizedes = 0,gsonsizeserstring = 0, gsonsizedeserstring = 0, jacksonsizeserstring = 0, jacksonsizedeserstring = 0;

		for (int i = 0; i < iter; i++)
		{
			double lDateTimejsoncre = new Date().getTime();
			JSONObject json = new JSONObject();
			double lDateTimeNewjsoncre = new Date().getTime();
			
			double lDateTimegsoncre = new Date().getTime();
			Gson gson = new Gson();
			double lDateTimeNewgsoncre = new Date().getTime();
			
			double lDateTimejacksoncre = new Date().getTime();
			ObjectMapper mapper = new ObjectMapper();
			double lDateTimeNewjacksoncre = new Date().getTime();
			Medium jack = mapper.readValue(genreJson, Medium.class);
			double lDateTimejacksonser = new Date().getTime();
			String jack1 = mapper.writeValueAsString(jack);
			double lDateTimeNewjacksonser = new Date().getTime();
			
			double lDateTimejacksonstringser = new Date().getTime();
			String jackstring = mapper.writeValueAsString(genreJson);
			double lDateTimeNewjacksonstringser = new Date().getTime();
			double lDateTimejacksondeserstring = new Date().getTime();
			String jackstring2 = mapper.readValue(jackstring, String.class);
			double lDateTimeNewjacksondeserstring = new Date().getTime();
			double lDateTimejsonser = new Date().getTime();
			JSONObject jsonObj = json.fromObject(genreJson);
			double lDateTimeNewjsonser = new Date().getTime();
			String json1 = jsonObj.toString();
			Medium str1 = gson.fromJson(genreJson, Medium.class);
			JsonFactory factory = new JsonFactory();
			double lDateTimegsonser = new Date().getTime();
			String str = gson.toJson(str1);
			double lDateTimeNewgsonser = new Date().getTime();
			double lDateTimegsonserstring = new Date().getTime();
			String gsonstring = gson.toJson(genreJson);
			double lDateTimeNewgsonserstring = new Date().getTime();
			double lDateTimegsonstringdeser = new Date().getTime();
			 String gsonstring2 = gson.fromJson(gsonstring, String.class);
			 double lDateTimeNewgsonstringdeser = new Date().getTime();
			JsonParser parser = new JsonParser();
			double lDateTimegson = new Date().getTime();
	        JsonElement element = parser.parse(str);			
			JsonObject str2 = element.getAsJsonObject();
			double lDateTimeNewgson = new Date().getTime();
			
			double lDateTimejackson = new Date().getTime();
			com.fasterxml.jackson.core.JsonParser jackparser = factory.createJsonParser(jack1);
			String jack2 = jackparser.getValueAsString(jack1);
			double lDateTimeNewjackson = new Date().getTime();
			
			
			double lDateTimejsondes = new Date().getTime();
			Object json2 = JSONObject.fromObject(JSONObject.toBean(jsonObj, Medium.class));
			double lDateTimeNewjsondes = new Date().getTime();

			
			if (i >= iter-500) {
				gsonsizeser += str.getBytes().length;
				gsonsizedes += str2.toString().getBytes().length;
				gsonsizeserstring += gsonstring.length();
				gsonsizedeserstring += gsonstring2.length();
				jacksonsizeser += jack1.getBytes().length;
				jacksonsizedes += jack2.toString().getBytes().length;
				jsonsizeser += json1.getBytes().length;
				jsonsizedes += json2.toString().getBytes().length;
				jacksonsizeserstring += jackstring.length();
				jacksonsizedeserstring += jackstring2.length();
				jacksontime += (lDateTimeNewjackson - lDateTimejackson);
				jacksontimecre += (lDateTimeNewjacksoncre - lDateTimejacksoncre);
				jacksontimeser += (lDateTimeNewjacksonser - lDateTimejacksonser);
				jacksontimeserstring += (lDateTimeNewjacksonstringser - lDateTimejacksonstringser);
				jacksontimedeserstring += (lDateTimeNewjacksondeserstring - lDateTimejacksondeserstring);
				gsontime += (lDateTimeNewgson - lDateTimegson);
				gsontimecre += (lDateTimeNewgsoncre - lDateTimegsoncre);
				gsontimeser += (lDateTimeNewgsonser - lDateTimegsonser);
				gsontimeserstring += (lDateTimeNewgsonserstring - lDateTimegsonserstring);
				gsontimedeserstring += (lDateTimeNewgsonstringdeser - lDateTimegsonstringdeser);
				jsontimecre += (lDateTimeNewjsoncre - lDateTimejsoncre);
				jsontimeser += (lDateTimeNewjsonser - lDateTimejsonser);
				jsontimedes += (lDateTimeNewjsondes - lDateTimejsondes);
			}
			if (i == iter-1) {
				System.out.println("Jackson:");
				System.out.println("Creation time:"+jacksontimecre/(i-(iter-500)));
				System.out.println("POJO:");
				System.out.println("Serializing size:"+jacksonsizeser/(i-(iter-500)));
				System.out.println("Deserializing size:"+jacksonsizedes/(i-(iter-500)));
				System.out.println("Deserializing time:"+jacksontimeser/(i-(iter-500)));
				System.out.println("Serializing time:"+jacksontime/(i-(iter-500)));
				System.out.println("String:");
				System.out.println("Serializing size:"+jacksonsizeserstring/(i-(iter-500)));
				System.out.println("Deserializing size:"+jacksonsizedeserstring/(i-(iter-500)));
				System.out.println("Deserializing time:"+jacksontimeserstring/(i-(iter-500)));
				System.out.println("Serializing time:"+jacksontimedeserstring/(i-(iter-500)));
				System.out.println("\nGSON:");
				System.out.println("Creation time:"+gsontimecre/(i-(iter-500)));
				System.out.println("POJO:");
				System.out.println("Serializing size:"+gsonsizeser/(i-(iter-500)));				
				System.out.println("Deserializing size:"+gsonsizedes/(i-(iter-500)));				
				System.out.println("Deserializing time:"+gsontimeser/(i-(iter-500)));				
				System.out.println("Serializing time:"+gsontime/(i-(iter-500)));
				System.out.println("String:");
				System.out.println("Serializing size:"+gsonsizeserstring/(i-(iter-500)));
				System.out.println("Deserializing size:"+gsonsizedeserstring/(i-(iter-500)));
				System.out.println("Deserializing time:"+gsontimeserstring/(i-(iter-500)));
				System.out.println("Serializing time:"+gsontimedeserstring/(i-(iter-500)));
				System.out.println("\nOrg.Json");
				System.out.println("Creation size:"+jsontimecre/(i-(iter-500)));
				System.out.println("POJO:");
				System.out.println("Serializing size:"+jsonsizeser/(i-(iter-500)));
				System.out.println("Deserializing size:"+jsonsizedes/(i-(iter-500)));
				System.out.println("Deserializing time:"+jsontimeser/(i-(iter-500)));
				System.out.println("Serializing time:"+jsontimedes/(i-(iter-500)));
			}
		}
	}

}
