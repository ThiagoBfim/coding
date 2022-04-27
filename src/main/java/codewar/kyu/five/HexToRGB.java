package codewar.kyu.five;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {
        var red = hex.substring(1, 3);
        var green = hex.substring(3, 5);
        var blue = hex.substring(5);
        return new int[]{
                Integer.parseInt(red, 16),
                Integer.parseInt(green, 16),
                Integer.parseInt(blue, 16)
        };
    }
}
