package webServices;

import static utils.constans.Urls.BASE_URI_MOCK;

import org.json.JSONObject;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer;
import static utils.constans.Enpoints.CUSTOMER;
/**
 * Description: create info to customers
 *
 */
public class CreateCustomers extends BaseWebServices {
	private Customer cust[] = new Customer[20];
	private Faker data = new Faker();

	/**
	 * The method creates 20 register with pjo
	 * 
	 * @return a object with info
	 * 
	 * 
	 */
	public Object[] addCustomersPojo() throws IllegalArgumentException, IllegalAccessException {

		for (int i = 0; i < 20; i++) {

			cust[i] = new Customer();
		}
		return cust;

	}
	/**
	 * The method deletes emails dupilicats and replace.
	 * 
	 * @return a object with info with emails duplicates
	 * 
	 * 
	 */
	public Object[] replaceDuplicateEmails() throws IllegalArgumentException, IllegalAccessException {

		Object[] custor = addCustomersPojo();

		for (int i = 0; i < custor.length; i++) {

			for (int j = 0; j < custor.length; j++) {

				if (i != j && cust[i].getEmail().equals(cust[j].getEmail())) {

					cust[j].setEmail(data.internet().emailAddress());
					i = 0;

				}

			}

		}
		return custor;

	}
	/**
	 * The method sends info to create a customers
	 * 
	 * @return a object with info with emails duplicates
	 * 
	 * 
	 */
	public Response createDataPojoWebService() throws IllegalArgumentException, IllegalAccessException {

		Object[] custor = replaceDuplicateEmails();
		JSONObject requestParams = new JSONObject();
		for (int i = 0; i < custor.length; i++) {
			requestParams.put("name", cust[i].getName());
			requestParams.put("lastName", cust[i].getLastName());
			requestParams.put("accountNumber", cust[i].getAccountNumber());
			requestParams.put("amount", cust[i].getAmount());
			requestParams.put("transactionType", cust[i].getTransactionType());
			requestParams.put("email", cust[i].getEmail());
			requestParams.put("country", cust[i].getCountry());
			requestParams.put("telephone", cust[i].getTelephone());
			response = request.given().contentType(ContentType.JSON).baseUri(BASE_URI_MOCK.getText())
					.body(requestParams.toString()).log().all().post(CUSTOMER.getText());
		}
		return response;
	}
}
