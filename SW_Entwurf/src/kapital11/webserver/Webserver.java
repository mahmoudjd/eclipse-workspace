package kapital11.webserver;

//import com.google.common.base.Splitter;

public class Webserver {

	private int port;
	private String baseDir;
	// ...20weitere Attríbute

	public static class Builder {
		private Webserver server = new Webserver();

		public Webserver build() {
			// validiere die Parameter
			// setze die Parameter
			return server;
		}

		public Builder withPort(int port) {
			server.port = port;
			return this;
		}
		// set-Methoden für alle Parameter

	}

	public static void main(String[] args) {
//		Webserver.Builder builder = builder();
//		builder.setHttpPort(8080);
//		builder.enableHttpsPort(443);
//		builder.setBaseDir("/var/www");
		// ...
//		Webserver webserver = builder()
//				.withPort(8080)
//				.withHttpsPort(8443)
//				.withBaseDir("/var/www")
//				.build();

//		String str = " foo , bar;;;; baz.blubb";
//		Splitter splitter = Splitter.onPattern(",|\\.|;").omitEmptyStrings().trimResults().limit(3);
//		Iterable<String> words = splitter.split(str);

	}

	private Webserver() {
		// von außen nicht aufrufbar
	}

	public static Builder builder() {
		return new Webserver.Builder();
	}
}
