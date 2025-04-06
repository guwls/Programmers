class Solution {
    public static String solution(String phone_number) {

        String mask = "*".repeat(phone_number.length() - 4);
        String visible = phone_number.substring(phone_number.length() - 4);

        return mask + visible;
    }
}