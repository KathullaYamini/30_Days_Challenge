import java.util.*;

class FoodRatings {
    private Map<String, String> foodToCuisine;
    private Map<String, Integer> foodToRating;
    private Map<String, PriorityQueue<Food>> cuisineToPQ;

    private static class Food {
        String name;
        int rating;
        Food(String name, int rating) { this.name = name; this.rating = rating; }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToPQ = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            String f = foods[i];
            String c = cuisines[i];
            int r = ratings[i];
            foodToCuisine.put(f, c);
            foodToRating.put(f, r);
            cuisineToPQ.computeIfAbsent(c, k -> new PriorityQueue<>((a, b) -> {
                if (a.rating != b.rating) return Integer.compare(b.rating, a.rating);
                return a.name.compareTo(b.name);
            })).offer(new Food(f, r));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        foodToRating.put(food, newRating);
        cuisineToPQ.get(cuisine).offer(new Food(food, newRating));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = cuisineToPQ.get(cuisine);
        while (true) {
            Food top = pq.peek();
            if (top == null) return "";
            int current = foodToRating.get(top.name);
            if (top.rating == current) return top.name;
            pq.poll();
        }
    }
}
