class Solution {
    public int[] deckRevealedIncreasing(int[] deck) 
    {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++)
        {
            queue.add(i);
        }

        int[] array = new int[n];

        for(int i=0; i<n; i++)
        {
            array[queue.poll()] = deck[i];
            queue.add(queue.poll());
        }
        return array;    
    }
}