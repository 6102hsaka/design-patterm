package practice.design.pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy Internet which will be used by end user
 * 
 * @author Akash Sharma
 *
 */
public class ProxyInternet implements Internet {

	private RealInternet realInternet;
	private static List<String> blockedSites;

	// initializing list of banned sites
	static {
		blockedSites = new ArrayList<>();
		blockedSites.add("test1.com");
		blockedSites.add("test2.com");
		blockedSites.add("test3.com");
		blockedSites.add("test4.com");
		blockedSites.add("test5.com");
	}

	@Override
	public void connectTo(String site) {
		// validating whether user is allowed to access provided site or not
		if (blockedSites.contains(site.toLowerCase())) {
			throw new RuntimeException("Not allowed to access " + site);
		}
		// On-demand initialization of Real Internet
		if (realInternet == null) {
			realInternet = new RealInternet();
		}
		realInternet.connectTo(site);

	}

}
