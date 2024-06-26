package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.StockPrice;
import in.ineuron.exception.StockNotFoundException;
import in.ineuron.repository.StockRepository;

@Service("service")
public class StockPriceServiceImpl implements IStockPriceService {
	
	@Autowired
	private StockRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {
		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if(stockPrice==null) {
			throw new StockNotFoundException("Company Not Avaialable");
		}
		else
			return stockPrice.getCompanyPrice();
	}

}
