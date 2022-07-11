package autor.restful.client.autorrestfulclient;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


class AutorRestfulClientApplicationTests {

    @Test
    public void obterTokenJWT() throws URISyntaxException {
    	
    	RestTemplate restTemplate = new RestTemplate();
    	       
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setContentType(MediaType.TEXT_PLAIN);
		
		HttpEntity<String> entity = new HttpEntity<>(headers);	
		
		
		String token = restTemplate.exchange("http://localhost:8080/autor/signin", HttpMethod.GET, entity, String.class).getBody();
		
		System.out.println(token);
    }	
    
    

}
