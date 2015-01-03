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

import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.gson.Gson;

public class TreeModeParser1
{
	static int iter = 1500;
	public static void printer(Iterator<JsonNode> datasetElements)
	{
		while (datasetElements.hasNext())
		{
			JsonNode datasetElement = datasetElements.next();

			// what is its type
			// System.out.println(datasetElement.getNodeType());// Prints Object
			// it is again a container . what are the elements ?
			Iterator<String> datasetElementFields = datasetElement.fieldNames();
			while (datasetElementFields.hasNext())
			{
				String datasetElementField = datasetElementFields.next();
				JsonNode dsset = datasetElement.findValue(datasetElementField);
				// System.out.println(dsset.getNodeType());

				if (dsset.getNodeType() == JsonNodeType.ARRAY)
				{
					Iterator<JsonNode> datasetElements1 = dsset.iterator();
					printer(datasetElements1);
				}
				else if (dsset.getNodeType() == JsonNodeType.OBJECT)
				{
					Iterator<Entry<String, JsonNode>> datasetElements1 = dsset.fields();
					printer1(datasetElements1);
				}
				else
					System.out.println(datasetElementField + ":  " + datasetElement.findValue(datasetElementField));
			}

		}
	}

	private static void printer1(Iterator<Entry<String, JsonNode>> datasetElements1)
	{
		while (datasetElements1.hasNext())
		{
			Entry<String, JsonNode> sx = datasetElements1.next();
			System.out.println(sx.getKey() + ":  " + sx.getValue());
		}

	}

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		//BufferedReader buf = new BufferedReader(new FileReader("small-dict.json"));
		FileInputStream targetFile = new FileInputStream(new File("medium.json"));
		// String url = "small.json";
		// Get the contents of json as a string using commons IO IOUTils class.
		String genreJson = IOUtils.toString(targetFile, "UTF-8"), temp;
		//while ((temp = buf.readLine()) != null)
		//{
		//	genreJson += temp;
		//}
		
		double jacksontime = 0.0, gsontime = 0.0,jacksontimeser = 0.0, gsontimeser = 0.0, gsontimecre = 0.0, jacksontimecre = 0.0, jsontimecre = 0.0, jsontimeser = 0.0, jsontimedes = 0.0;
		long gsonsizeser = 0, gsonsizedes = 0, jacksonsizeser = 0, jacksonsizedes = 0, jsonsizeser = 0, jsonsizedes = 0;
		//System.out.println(str);
		for (int i = 0; i < iter; i++)
		{
			double lDateTimjsoncre = new Date().getTime();
			JSONObject json = new JSONObject();
			double lDateTimeNewjsoncre = new Date().getTime();
			
			double lDateTimegsoncre = new Date().getTime();
			Gson gson = new Gson();
			double lDateTimeNewgsoncre = new Date().getTime();
			
			double lDateTimejacksoncre = new Date().getTime();
			ObjectMapper mapper = new ObjectMapper();
			double lDateTimeNewjacksoncre = new Date().getTime();
			mapper.registerModule(new AfterburnerModule());
			
			double lDateTimejacksonser = new Date().getTime();
			String jack1 = mapper.writeValueAsString(genreJson);
			double lDateTimeNewjacksonser = new Date().getTime();
			
			double lDateTimejsonser = new Date().getTime();
			JSONObject jsonObj = json.fromObject(genreJson);
			double lDateTimeNewjsonser = new Date().getTime();
			String json1 = jsonObj.toString();
			
			double lDateTimegsonser = new Date().getTime();
			String str = gson.toJson(genreJson);
			double lDateTimeNewgsonser = new Date().getTime();
			
			double lDateTimejackson = new Date().getTime();
			String jack2 = mapper.readValue(jack1, String.class);
			double lDateTimeNewjackson = new Date().getTime();
			TypeReference<Map<String, Integer>> type= new TypeReference<Map<String,Integer>>() {};
			double lDateTimejsondes = new Date().getTime();
			//JSONObject jsonObj1 = JSONObject.fromObject(json1);
			Object json2 = JSONObject.fromObject(JSONObject.toBean(jsonObj, Medium.class));
			double lDateTimeNewjsondes = new Date().getTime();
			
			double lDateTimegson = new Date().getTime();
			String str1 = gson.fromJson(str, String.class);
			double lDateTimeNewgson = new Date().getTime();
			if (i >= iter-500) {
				gsonsizeser += str.getBytes().length;
				gsonsizedes += str1.getBytes().length;
				jacksonsizeser += jack1.getBytes().length;
				jacksonsizedes += jack2.getBytes().length;
				jsonsizeser += json1.getBytes().length;
				jsonsizedes += json2.toString().getBytes().length;
				jacksontime += (lDateTimeNewjackson - lDateTimejackson);
				jacksontimecre += (lDateTimeNewjacksoncre - lDateTimejacksoncre);
				gsontime += (lDateTimeNewgson - lDateTimegson);
				gsontimecre += (lDateTimeNewgsoncre - lDateTimegsoncre);
				jacksontimeser += (lDateTimeNewjacksonser - lDateTimejacksonser);
				gsontimeser += (lDateTimeNewgsonser - lDateTimegsonser);
				jsontimeser += (lDateTimeNewjsonser - lDateTimejsonser);
				jsontimedes += (lDateTimeNewjsondes - lDateTimejsondes);
			}
			if (i == iter-1) {
				System.out.println(jacksonsizeser/(i-(iter-500)));
				System.out.println(jacksonsizedes/(i-(iter-500)));
				System.out.println(jacksontimeser/(i-(iter-500)));
				System.out.println(jacksontime/(i-(iter-500)));
				System.out.println(jacksontimecre/(i-(iter-500)));
				System.out.println(gsonsizeser/(i-(iter-500)));				
				System.out.println(gsonsizedes/(i-(iter-500)));				
				System.out.println(gsontimeser/(i-(iter-500)));				
				System.out.println(gsontime/(i-(iter-500)));
				System.out.println(gsontimecre/(i-(iter-500)));
				System.out.println(jsonsizeser/(i-(iter-500)));
				System.out.println(jsonsizedes/(i-(iter-500)));
				System.out.println(jsontimeser/(i-(iter-500)));
				System.out.println(jsontimedes/(i-500));
				System.out.println(jsontimecre/(i-500));
				System.out.println(json2.toString());
			// lets see what type the node is
			// System.out.println(node.getNodeType()); // prints OBJECT
			// is it a container
			// System.out.println(node.isContainerNode()); // prints true
			// lets find out what fields it has
			//Iterator<String> fieldNames = node.fieldNames();
			// while (fieldNames.hasNext()) {
			// String fieldName = fieldNames.next();
			// System.out.println(fieldName);// prints title, message, errors,
			// total,
			// total_pages, page, limit, dataset
			// }

			// we now know what elemets the container has. lets get the value for
			// one of them
			// System.out.println(node.get("title").asText()); // prints
			// "Free Music Archive".

			// Lets look at the dataset now.
			// JsonNode dataset = node.get("dataset");

			// what is its type?
			// System.out.println(node.getNodeType()); // Prints ARRAY

			// so the dataset is an array. Lets iterate through the array and see
			// what each of the elements are
			//Iterator<JsonNode> datasetElements = node.iterator();
			 //printer(datasetElements);
			}
		}
	}

}
