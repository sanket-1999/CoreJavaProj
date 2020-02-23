package com.abstractclass;

abstract class Persistence {

	abstract void persist();
}

class FilePersistence extends Persistence {
	void persist() {
		System.out.println("data persisted into file");
	}

}

class DatabasePersistence extends Persistence {
	void persist() {
		System.out.println("data persisted into database");
	}

}

class PersistenceFactory {
	public static Persistence getPersistence() {
		return new DatabasePersistence();
	}

}

public class Ptence {
	public static void main(String args[]) {
		Persistence p = PersistenceFactory.getPersistence();
		p.persist();
	}
}