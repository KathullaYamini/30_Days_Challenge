class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        if (nums1.length <= nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                h.put(nums1[i], h.getOrDefault(nums1[i], 0) + 1);
            }

            for (int i = 0; i < nums2.length; i++) {
                if (h.containsKey(nums2[i]) && h.get(nums2[i]) > 0) {
                    res.add(nums2[i]);
                    h.put(nums2[i], h.get(nums2[i]) - 1);
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                h.put(nums2[i], h.getOrDefault(nums2[i], 0) + 1);
            }

            for (int i = 0; i < nums1.length; i++) {
                if (h.containsKey(nums1[i]) && h.get(nums1[i]) > 0) {
                    res.add(nums1[i]);
                    h.put(nums1[i], h.get(nums1[i]) - 1);
                }
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
