package org.gfg.minor1;

import org.gfg.minor1.repository.TxnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Minor1Application {

	@Autowired
	private TxnRepository txnRepository;

	public static void main(String[] args) {

		SpringApplication.run(Minor1Application.class, args);
	}

}
