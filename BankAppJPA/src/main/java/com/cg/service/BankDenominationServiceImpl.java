package com.cg.service;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.exception.BankException;
import com.cg.model.Denomination;
import com.cg.repository.BankDAO;
import com.cg.repository.BankDenominationDAO;

import java.util.List;
import java.util.Random;


@Service
public class BankDenominationServiceImpl implements BankDenominationService{
	public BankDenominationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public static final Logger LOGGER = Logger.getLogger(BankDenominationService.class);
	
	@Autowired
	BankDenominationDAO bkdenomdao;
	
	@Autowired
	BankDAO bkdao;
	
	@Override
	public void addDenomination(Integer amount) throws BankException {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2000);
		list.add(1000);
		list.add(500);
		list.add(200);
		final Random rand = new Random();
		Integer remainder = amount;
		Integer randomIndex = rand.nextInt(list.size());
		Integer randomElement  = list.get(randomIndex);
		for (int i = 0; i < list.size(); i++) {
			if((randomElement.compareTo(remainder) == 0) || randomElement.compareTo(remainder) == -1)
			{
				Denomination bkdenom = new Denomination();
				bkdenom.setNoOfDenomination(remainder / randomElement);
				bkdenom.setDenomination(randomElement);
				remainder = remainder % randomElement;
				LOGGER.info("Denomination"+ bkdenom);
				if (remainder == 0) {
					break;
				}
			}
			list.remove(randomIndex);
		}
	}
}