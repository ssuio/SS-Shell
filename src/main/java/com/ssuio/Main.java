/*
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ssuio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.springframework.shell.Bootstrap;

/**
 * Driver class to run the helloworld example. 
 * 
 * @author Mark Pollack
 *
 */
public class Main {

	/**
	 * Main class that delegates to Spring Shell's Bootstrap class in order to simplify debugging inside an IDE
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Bootstrap.main(args);

		//URL url = new URL("http://www.google.com");
		//StringBuilder sb = new StringBuilder();
		//try {
		//	try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
		//		String inputLine;
		//		while ((inputLine = in.readLine()) != null) {
		//			sb.append(inputLine);
		//		}
		//	}
		//} catch (IOException ex) {
		//	sb.append("ERROR");
		//}
                //
		//System.out.println(sb.toString());

	}

}
