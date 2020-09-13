package com.khubla.hsopenapi;

import org.apache.commons.cli.*;

import com.khubla.hsopenapi.http.*;

/**
 * @author Tom Everett
 */
class Main {
	/**
	 * config option
	 */
	private static final String CONFIG_OPTION = "config";

	public static void main(String[] args) {
		System.out.println("Duety Microservices Engine");
		try {
			/*
			 * options
			 */
			final Options options = new Options();
			final Option oo = Option.builder().argName(CONFIG_OPTION).longOpt(CONFIG_OPTION).type(String.class).hasArg().required(true).desc("config").build();
			options.addOption(oo);
			/*
			 * parse
			 */
			final CommandLineParser parser = new DefaultParser();
			CommandLine commandline = null;
			try {
				commandline = parser.parse(options, args);
				/*
				 * config
				 */
				final Configuration configuration = Configuration.getInstance();
				/*
				 * http port
				 */
				final Integer httpPort = configuration.getHttpPort();
				System.out.println("HTTP port is: " + httpPort);
				/*
				 * start HTTP
				 */
				System.out.println("Starting HTTP server on port: " + httpPort);
				final HTTPServer httpServer = new HTTPServer(httpPort);
				httpServer.start();
				/*
				 * wait
				 */
				System.out.println("Press any key to stop");
				System.in.read();
				/*
				 * done
				 */
				httpServer.stop();
			} catch (final Exception e) {
				e.printStackTrace();
				final HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("posix", options);
				System.exit(0);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}