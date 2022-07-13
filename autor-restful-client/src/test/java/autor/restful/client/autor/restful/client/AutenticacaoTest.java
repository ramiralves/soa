package autor.restful.client.autor.restful.client;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

public class AutenticacaoTest {

	@Test
	public void obterTokenJWT() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("username", "admin");
		map.add("password", "admin");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		ResponseEntity<String> response = restTemplate.postForEntity( "http://localhost:8080/autor/signin", request , String.class );	
		
		boolean retorno = false;
		
		if(!StringUtils.isEmpty(response.getBody())) {
			retorno = true;
			System.out.println(String.format("JWT Token: [%s]", response.getBody()));
				
		}		
		assertTrue(retorno);
		
	}
	
}
