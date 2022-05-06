package codewar.kyu.six;

public class DRoot {

    public static int digitalRootClever(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static int digitalRoot(int n) {
        int result = n;
        while (result >=10){
            result = getDigitalRoot(result);
        }
        return result;
    }

    private static int getDigitalRoot(int n) {
        var s = String.valueOf(n);
        var result = 0;
        for (var i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            result += c - 48;
        }
        return result;
    }


}
