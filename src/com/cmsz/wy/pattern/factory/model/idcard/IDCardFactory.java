package com.cmsz.wy.pattern.factory.model.idcard;

import java.util.HashMap;

import com.cmsz.wy.pattern.factory.model.framework.Factory;
import com.cmsz.wy.pattern.factory.model.framework.Product;

public class IDCardFactory extends Factory {
	private HashMap database = new HashMap();
	private int serial = 100;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = (IDCard)product;
		database.put(card.getSerial(), card.getOwner());
	}
	
	public HashMap getOwners() {
		return database;
	}

}
