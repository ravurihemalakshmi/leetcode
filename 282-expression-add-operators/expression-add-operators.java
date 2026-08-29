class Solution {

    public List<String> addOperators(String num, int target) {

        List<String> ans = new ArrayList<>();

        generate(0, num, target, "", 0, 0, ans);

        return ans;
    }

    public void generate(int index, String num, int target,
                         String path, long value, long previous,
                         List<String> ans) {

        // Entire string is used
        if (index == num.length()) {
            if (value == target) {
                ans.add(path);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            // Leading zero is not allowed
            if (i > index && num.charAt(index) == '0') {
                break;
            }

            String curr = num.substring(index, i + 1);
            long number = Long.parseLong(curr);

            // First number: no operator before it
            if (index == 0) {

                generate(i + 1, num, target,
                         curr, number, number, ans);

            } else {

                // +
                generate(i + 1, num, target,
                         path + "+" + curr,
                         value + number,
                         number,
                         ans);

                // -
                generate(i + 1, num, target,
                         path + "-" + curr,
                         value - number,
                         -number,
                         ans);

                // *
                generate(i + 1, num, target,
                         path + "*" + curr,
                         value - previous + previous * number,
                         previous * number,
                         ans);
            }
        }
    }
}