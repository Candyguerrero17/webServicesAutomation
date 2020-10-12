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
public class BaseWebServices {

	protected RequestSpecification request = RestAssured.with();
	protected Response response;
	List<Integer> sizeBody =getSize();
	public Response requestGetMethod() {

		return response = request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
				.get(CUSTOMER.getText());
	}

	public String requestPostWithDataDuplicate(int page, String parameter) {
		String message = DUPLICATE.getText();
		String newEmail = requestGetWithInfoMethod(page, parameter);
		for (int i = 0; i < sizeBody.size(); i++) {

			String emailExist = request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
					.get(GET_CUSTOMER.getText() +sizeBody.get(i)).then().statusCode(200).extract().path("email");

			if (newEmail.equals(emailExist)) {
				message = DUPLICATE_OK.getText();
			}

		}

		return message;
	}

	public String requestGetWithInfoMethod(int page, String parameter) {

		return request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText()).get(GET_CUSTOMER.getText() + page)
				.then().extract().path(parameter);

	}

	public Response requestDeleteMethod(String url) {

		return response = request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText()).delete();
	}

	public void requestDeleteAllItems() {
		
		if (sizeBody.isEmpty() == false) {
			for (int i = 0; i < sizeBody.size(); i++) {

				request.given().log().all().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
						.delete(GET_CUSTOMER.getText() + sizeBody.get(i));

			}
		}

	}

	public boolean isEmptyEndpoint() throws InterruptedException {

		if (getSize().isEmpty()) {
			return true;
		}

		return false;

	}

	public List<Integer> getSize() {
		List<Integer> resIDs = requestGetMethod().jsonPath().get("id");
		return resIDs;
	}

}
