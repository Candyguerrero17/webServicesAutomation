package webServices;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.BugJira;
import static utils.constans.Enpoints.ISSUE;

import static utils.constans.Token.TOKEN;

import static utils.constans.Urls.BASE_URI_JIRA;
/**
 * Description: Basic methods with Jira
 *
 */
public class WebServiceJira extends BaseWebServices {

	private static final int NUM = 10030;

	/**
	 * The method does a post with header Authorization and token
	 * 
	 * @return request
	 * 
	 * 
	 */
	public Response requestPostWithtAuthorization(BugJira bodyBug) {

		return request.given().header("Authorization", "Basic " + TOKEN.getText()).contentType(ContentType.JSON)
				.body(body(bodyBug.getKey(), bodyBug.getSummary(), bodyBug.getDescription(), bodyBug.getName())).when()
				.post(BASE_URI_JIRA.getText() + ISSUE.getText());

	}
	/**
	 * The method does a get total of register
	 * 
	 * @return request
	 * 
	 * 
	 */
	public int requestValueofRegister(String endpoint, String value) {
		response = request.given().header("Authorization", "Basic " + TOKEN.getText()).contentType(ContentType.JSON)
				.when().when().get(BASE_URI_JIRA.getText() + endpoint);
		JsonPath jsonPathEvaluator = response.jsonPath();
		int total = jsonPathEvaluator.get(value);
		return total + NUM;

	}
	/**
	 * The method does a get specific id
	 * 
	 * @return response
	 * 
	 * 
	 */
	public Response requestGet(String endpoint, int id) {
		
		
		return  request.given().header("Authorization", "Basic " + TOKEN.getText())
				.contentType(ContentType.JSON).when().get(BASE_URI_JIRA.getText() + endpoint + id);

	}
	/**
	 * The method loads body
	 * 
	 * @return a string woth info
	 * 
	 * 
	 */
	public String body(String key, String summay, String description, String name) {

		String body = "{\r\n" + "   \"fields\":{\r\n" + "      \"project\":{\r\n" + "         \"key\":\"" + key
				+ "\"\r\n" + "      },\r\n" + "      \"summary\":\"" + summay + "\",\r\n" + "      \"description\":\""
				+ description + "\",\r\n" + "      \"issuetype\":{\r\n" + "         \"name\":\"" + name + "\"\r\n"
				+ "      }\r\n" + "   }\r\n" + "}";

		return body;
	}

}
