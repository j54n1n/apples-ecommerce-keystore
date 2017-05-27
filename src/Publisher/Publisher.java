package Publisher;

import javax.xml.ws.Endpoint;

import helper.KeysManager;

public class Publisher {

		public static void main(String[] args) {
			Endpoint.publish("http://localhost:1234/key", new KeysManager());
		}

	}
	

