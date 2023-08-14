package org.support.project.ormapping.tool;

import java.io.IOException;

public class DBGen {

	public static void main(String[] args) throws IOException, Exception {
		DatabaseInitializer.main(args);
		EntityMaker.main(args);
		DaoMaker.main(args);
	}

}
