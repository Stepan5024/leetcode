package Edit_Distance_72;

public class Practicum {

    public static void main(String[] args){
        String testString = "я умею программировать";
        for (int rot = -testString.length() + 1; rot <= testString.length(); rot++) {
            String rotatedString = rotate(testString, rot);
            System.out.println(rotatedString);
        }
    }

    private static String rotate(String input, int rot) {
        if(input.isEmpty() || rot == 0){
            return input;
        }
        int len = input.length();
        rot = rot % len;
        StringBuilder ret = new StringBuilder();
        if(rot > 0) {
            ret.append(input.charAt(input.length() - 1));
            ret.append(input.substring(0, input.length() - 1));
            return rotate(input.charAt(len - 1) + input.substring(0, len - 1), rot - 1);

            //return rotate(ret.toString(), rot - 1);
        } else {
            ret.append(input.substring(1));
            ret.append(input.charAt(0));
            //return rotate(ret.toString(), rot + 1);
            return rotate(input.substring(1) + input.charAt(0), rot + 1);

        }
    }

}