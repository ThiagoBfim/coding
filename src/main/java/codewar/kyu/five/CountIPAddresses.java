package codewar.kyu.five;


public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        String[] starts = start.split("\\.");
        String[] ends = end.split("\\.");

        Long ip1 = (Long.valueOf(ends[0]) - Long.valueOf(starts[0])) * 256;
        Long ip2 = (Long.valueOf(ends[1]) - Long.valueOf(starts[1]));
        Long ip3 = (Long.valueOf(ends[2]) - Long.valueOf(starts[2]));
        Long ip4 = Long.valueOf(ends[3]) - Long.valueOf(starts[3]);

        return (((ip1 + ip2) * 256) + ip3) * 256 + ip4;
    }

}
