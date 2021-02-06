/**
 * 
 */
package pratyay.learning.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author praty
 *
 */
@RestController
public class DockerDemoController {

	@GetMapping("/test-docker")
	public String getData() {
		return "Pratyay learning on docker tutorial";
	}

}
