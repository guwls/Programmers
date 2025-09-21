class Solution {
    public String solution(String s) {
         String lower = s.toLowerCase();

        StringBuilder sb = new StringBuilder(lower.length());
        boolean startOfWord = true; // 직전 문자가 공백이면 true

        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);

            if (c == ' ') {
                // 공백은 그대로 보존 + 다음 문자가 단어 시작
                sb.append(c);
                startOfWord = true;
            } else {
                if (startOfWord && Character.isLetter(c)) {
                    // 단어 시작이 알파벳이면 대문자
                    sb.append(Character.toUpperCase(c));
                } else {
                    // 그 외는 그대로(이미 소문자 상태, 숫자/기호 포함)
                    sb.append(c);
                }
                startOfWord = false;
            }
        }
        return sb.toString();
    }
}