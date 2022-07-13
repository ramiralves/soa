package autor.restful.client.autor.restful.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import autor.restful.client.autor.restful.client.dto.Autor;

public class BuscarAutorTest {
	
	private String tokenJWT = "";
	private boolean statusCode = false;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Before
	public void obterTokenJWT() {				
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("username", "admin");
		map.add("password", "admin");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		ResponseEntity<String> response = restTemplate.postForEntity( "http://localhost:8080/autor/signin", request , String.class );			
		
		statusCode 	= response.getStatusCode().equals(HttpStatus.OK);
		tokenJWT 		= response.getBody();		
	}

	@Test
	public void procurarAutor() {
		
		assertTrue(statusCode);
		
		if (statusCode) {
			String token = "Bearer " + tokenJWT;
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);			
			headers.set("Authorization", token);
			HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
			// Use Token to get Response
			ResponseEntity<Autor> helloResponse = restTemplate.exchange("http://localhost:8080/autor/RAMIR", HttpMethod.GET, jwtEntity,Autor.class);
			if (helloResponse.getStatusCode().equals(HttpStatus.OK)) {
				Autor autor = helloResponse.getBody();
				
			    assertEquals(autor.getCpf(), "111111111");				
			    
			    assertEquals(autor.getEndereco().get(0).getCep(), 2072000);
			    
			    assertEquals(autor.getEndereco().get(0).getCidade().getSigla(), "RJ");
			    
			    assertEquals(autor.getEndereco().get(0).getEstado().getSigla(), "RJ");
			    
			    assertEquals(autor.getEndereco().get(0).getPais().getSigla(), "BR");
				
			}
		}
		
	}
	
}
