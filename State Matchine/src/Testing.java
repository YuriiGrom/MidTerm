import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	
	HealthService healthService = new HealthService(false, false, false);

	@Test
	void test() {
		healthService.healthCheck(true);
	}

}
