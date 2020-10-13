package webServices;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static utils.constans.Urls.BASE_URI_MOCK;
import static utils.constans.Enpoints.CUSTOMER;
import static utils.constans.Enpoints.GET_CUSTOMER;
import static utils.constans.Messages.DUPLICATE;
import static utils.constans.Messages.DUPLICATE_OK;

/**
 * Description: Base of web service
 *
 */
public class BaseWebServices {

	protected RequestSpecification request = RestAssured.with();
	protected Response response;
	List<Integer> sizeBody = getSize();

	/**
	 * The method does a request get Returns a response
	 * 
	 * @return request
	 * 
	 * 
	 */
	public Response requestGetMethod() {

		return request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
				.get(CUSTOMER.getText());
	}

	/**
	 * The method does a question to know if email sended is duplicate. Returns a
	 * menssage after of look over.
	 * 
	 * @return message
	 * 
	 * 
	 */
	public String requestPostWithDataDuplicate(String email) {
		String message = DUPLICATE.getText();
		
		for (int i = 0; i < sizeBody.size(); i++) {

			String emailExist = request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
					.get(GET_CUSTOMER.getText() + sizeBody.get(i)).then().statusCode(200).extract().path("email");

			if (email.equals(emailExist)) {
				message = DUPLICATE_OK.getText();
				System.out.println(DUPLICATE_OK.getText());
			}

		}

		return message;
	}

	/**
	 * The method does a get with a parameter Returns a request
	 * 
	 * @return request
	 * 
	 * 
	 */
	public String requestGetWithInfoMethod(int page, String parameter) {

		return request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
				.get(GET_CUSTOMER.getText() + page).then().extract().path(parameter);

	}

	/**
	 * The method does a question if the endpoint isn´t emply delete registers.
	 * 
	 * 
	 */

	public void requestDeleteAllItems() {

		if (sizeBody.isEmpty() == false) {
			for (int i = 0; i < sizeBody.size(); i++) {

				request.given().log().all().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
						.delete(GET_CUSTOMER.getText() + sizeBody.get(i));

			}
		}

	}

	/**
	 * The method does a questions if endpoint is emply return true.
	 * @return true or false
	 * 
	 */
	public boolean isEmptyEndpoint() throws InterruptedException {

		if (getSize().isEmpty()) {
			return true;
		}

		return false;

	}

	/**
	 * The method return a list Integer of endpoint
	 * 
	 *  * @return list Integer
	 */
	public List<Integer> getSize() {
		List<Integer> resIDs = requestGetMethod().jsonPath().get("id");
		return resIDs;
	}

}
