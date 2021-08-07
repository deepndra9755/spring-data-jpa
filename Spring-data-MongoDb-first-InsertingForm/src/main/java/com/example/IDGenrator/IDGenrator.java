package com.example.IDGenrator;

import java.util.Random;
import java.util.UUID;

public class IDGenrator {
	public  Integer getids()
	{

		return new Random().nextInt(1000);
	}

}
