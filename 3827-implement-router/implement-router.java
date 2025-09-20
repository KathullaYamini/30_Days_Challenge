import java.util.*;

class Router {
    private int memoryLimit;
    private Queue<int[]> queue; // FIFO packets [source, dest, time]
    private Set<String> packetSet; // duplicate detection
    private Map<Integer, List<Integer>> destMap; // dest -> sorted timestamps

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new LinkedList<>();
        this.packetSet = new HashSet<>();
        this.destMap = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "-" + destination + "-" + timestamp;

        // duplicate check
        if (packetSet.contains(key)) {
            return false;
        }

        // evict oldest if full
        if (queue.size() == memoryLimit) {
            int[] old = queue.poll();
            String oldKey = old[0] + "-" + old[1] + "-" + old[2];
            packetSet.remove(oldKey);

            // remove old timestamp (since it's at front, it's always the earliest one)
            List<Integer> list = destMap.get(old[1]);
            int idx = Collections.binarySearch(list, old[2]);
            if (idx >= 0) list.remove(idx);
        }

        // add new packet
        queue.offer(new int[]{source, destination, timestamp});
        packetSet.add(key);

        destMap.putIfAbsent(destination, new ArrayList<>());
        destMap.get(destination).add(timestamp); // always increasing
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) {
            return new int[]{}; // empty
        }

        int[] packet = queue.poll();
        String key = packet[0] + "-" + packet[1] + "-" + packet[2];
        packetSet.remove(key);

        List<Integer> list = destMap.get(packet[1]);
        int idx = Collections.binarySearch(list, packet[2]);
        if (idx >= 0) list.remove(idx);

        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!destMap.containsKey(destination)) return 0;
        List<Integer> list = destMap.get(destination);

        // binary search for left bound (>= startTime)
        int left = lowerBound(list, startTime);
        // binary search for right bound (<= endTime)
        int right = upperBound(list, endTime);

        return Math.max(0, right - left);
    }

    // first index >= target
    private int lowerBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) >= target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    // first index > target
    private int upperBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) > target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
