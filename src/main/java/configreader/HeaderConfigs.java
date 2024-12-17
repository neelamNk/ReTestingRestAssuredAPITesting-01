package configreader;



	import java.util.HashMap;
	import java.util.Map;

	public class HeaderConfigs {

	    // Method to return default headers without token
	    public Map<String, String> defaultHeaders() {
	        Map<String, String> defaultHeaders = new HashMap<>();
	        defaultHeaders.put("Content-Type", "application/json");
	        return defaultHeaders;
	    }

	    // Method to return headers with tokens
	    public Map<String, String> headersWithToken() {
	        Map<String, String> defaultHeaders = new HashMap<>();
	        defaultHeaders.put("Content-Type", "application/json");
	        defaultHeaders.put("Access_Token", "sdjhvbshdjvbhsdjvbhsdjvbhsdjvbhsdv");
	        defaultHeaders.put("jwt_token", "sdjhvbshdjvbhsdjvbhsdjvbhsdjvbhsdv");
	        defaultHeaders.put("tenet_user", "test");
	        return defaultHeaders;
	    }
	    
	    public static void main(String[] args) {
	    	HeaderConfigs hc = new HeaderConfigs();
	    	System.out.println(hc.defaultHeaders());
		}
	}


