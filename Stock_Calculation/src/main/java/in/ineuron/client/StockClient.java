package in.ineuron.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Response;

@FeignClient(name="STOCK-PRICE-SERVICE")
public interface StockClient {
	
	@GetMapping("/price/stockPrice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String companyName);
}
