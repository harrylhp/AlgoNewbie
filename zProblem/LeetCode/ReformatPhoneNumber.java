package zProblem.LeetCode;

public class ReformatPhoneNumber {
    public static void main(String[] args) {
        String number = "00-44 55 6788 9988--9898 8";
        //char[] arrayChar = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++)
            if (Character.isDigit(number.charAt(i)))
                sb.append(number.charAt(i));

        if (sb.length() % 3 == 1) {
            sb.insert(sb.length() - 2, '-');
            for (int i = 3; i < sb.length() - 4; i += 4)
                sb.insert(i, '-');
        } else {
            for (int i = 3; i < sb.length(); i += 4)
                sb.insert(i, '-');
        }

        System.out.println("Phone number is " + sb);
    }
}
