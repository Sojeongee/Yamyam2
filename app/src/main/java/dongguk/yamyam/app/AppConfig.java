package dongguk.yamyam.app;

public class AppConfig {
	// Server user login url
	public static String ip = "192.168.43.62";

	public static String URL_LOGIN = "http://" + ip + "/yamyam_api/login.php";

	// Server user register url
	public static String URL_REGISTER = "http://" + ip + "/yamyam_api/register.php";

	// Server data input url
	public static String URL_SEARCH = "http://" + ip + "/yamyam_api/search.php";
}
