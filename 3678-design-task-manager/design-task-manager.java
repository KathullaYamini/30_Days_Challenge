class TaskManager {
    private static class Task {
        int priority, taskId, userId;
        Task(int priority, int taskId, int userId) {
            this.priority = priority;
            this.taskId = taskId;
            this.userId = userId;
        }
    }

    private PriorityQueue<Task> pq;
    private Map<Integer, Task> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        pq = new PriorityQueue<>((a, b) -> 
            a.priority != b.priority ? b.priority - a.priority : b.taskId - a.taskId
        );
        taskMap = new HashMap<>();
        for (List<Integer> t : tasks) add(t.get(0), t.get(1), t.get(2));
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(priority, taskId, userId);
        taskMap.put(taskId, task);
        pq.offer(task);
    }

    public void edit(int taskId, int newPriority) {
        if (taskMap.containsKey(taskId)) {
            Task t = taskMap.get(taskId);
            Task newTask = new Task(newPriority, taskId, t.userId);
            taskMap.put(taskId, newTask);
            pq.offer(newTask);
        }
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }

   public int execTop() {
    while (!pq.isEmpty()) {
        Task t = pq.poll();
        if (taskMap.containsKey(t.taskId)) {
            Task latest = taskMap.get(t.taskId);
            if (latest.priority == t.priority && latest.userId == t.userId) {
                taskMap.remove(t.taskId);
                return t.userId;
            }
        }
    }
    return -1;
}

}
