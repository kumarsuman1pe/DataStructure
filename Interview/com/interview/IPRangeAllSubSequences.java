package DataStructure.Interview.com.interview;

/***
 * HPE IPv4 Address range between the two. 10.10.10.10 - 192.168.1.15
 * 
 * [11:07 AM] Kini, Akshay Ganesh ((IoT Ops))
 * 
 * @param args
 *
 * @author sumankumar
 *
 */
public class IPRangeAllSubSequences {

    public static void printIPv4Range(String startIP, String endIP) {
        long start = ipToLong(startIP);
        long end = ipToLong(endIP);

        for (long current = start; current <= end; current++) {
            String currentIP = longToIP(current);
            System.out.println(currentIP);
        }
    }

    private static long ipToLong(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        long result = 0;

        for (int i = 0; i < 4; i++) {
            result = result << 8 | Integer.parseInt(octets[i]);
        }

        return result;
    }

    private static String longToIP(long ipAddress) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            result.insert(0, ipAddress & 255);
            if (i < 3) {
                result.insert(0, ".");
            }
            ipAddress >>= 8;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String startIP = "10.10.10.10";
        String endIP = "192.168.1.15";

        System.out.println("IPv4 Address Range between " + startIP + " and " + endIP + ":");
        printIPv4Range(startIP, endIP);
    }
}

