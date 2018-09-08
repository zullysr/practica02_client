package gob.mef.cloud.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class SaludoClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String buscar(@PathVariable String name) {
		String url ="http://localhost:8080/rest/service/saludo/{name}";
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", name);
		return restTemplate.getForObject(url, String.class, parameters);
	}
}
